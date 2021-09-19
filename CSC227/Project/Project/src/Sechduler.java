import java.io.*;
import java.util.*;

public class Sechduler {

    int time, timeFirstProcessArrives, lastProcessPID; // Initialized as first submitted pcb's submission time
    int quantom = 3;
    int[][] csv;
    Deque<PCB> pcbs;
    List<PCB> finishedPcbs;

    public Sechduler(int[][] csv){
        this.csv = csv;
    }
    
    static int getLineCount(String filename){
        int lineCount = 0;
        try{
            FileReader file = new FileReader(filename);
            BufferedReader buffer = new BufferedReader(file);
            while(buffer.readLine() != null)
                lineCount++;
            buffer.close();
        } catch(IOException e){
            e.printStackTrace();
        }
        return lineCount;
    }

    static int[][] parseCSV(String filename, boolean skipFirstRow){
        try{
            int numLines = getLineCount(filename);
            if(skipFirstRow)
                numLines--;
            int maxNumLines = numLines; // Keep copy of numLines
            int[][] csv = new int[numLines][3];
            FileReader file = new FileReader(filename);
            BufferedReader buffer = new BufferedReader(file);
            if(skipFirstRow)
                buffer.readLine();
            for(String line=buffer.readLine(); numLines!=0 && line!=null; numLines--, line=buffer.readLine()){
                String[] lineByLine = line.split(",");
                
                for(int i=0; i<lineByLine.length; i++)
                    csv[maxNumLines-numLines][lineByLine.length-i-1] = Integer.parseInt(lineByLine[i]);
            }
            buffer.close();
            return csv;
        } catch (FileNotFoundException e) {
            System.out.print("FileNotFoundException\nMake sure to include a file named data.csv in the root of this directory\n");
            return null;
        }
        catch(IOException e){
            e.printStackTrace();
            return null;
        }
    }

    static void printPhase1Statistics(int[][] csv){
        int processNum = csv.length, minBurst = Integer.MAX_VALUE, maxBurst = Integer.MIN_VALUE;
        long totalBurst = 0;
        for (int[] line : csv) {
            totalBurst += line[1];
            minBurst = (minBurst < line[1]) ? minBurst : line[1];
            maxBurst = (maxBurst > line[1]) ? maxBurst : line[1];
        }

        double averageBurst = (double) totalBurst / processNum;
        int moreThanAverage = 0, lessThanAverage = 0;
        for (int[] line : csv) 
            if(averageBurst < line[1])
                moreThanAverage++;
            else if(averageBurst > line[1])
                lessThanAverage++;


        System.out.printf("Total number of processes %d\n" 
                        + "Maximum burst time %d\n"
                        + "Minimum burst time %d\n"
                        + "Number of processes that have more than average burst time %d\n"
                        + "Number of processes that have less than average burst time %d\n",
                        csv.length, maxBurst, minBurst, moreThanAverage, lessThanAverage);
    }

    static void printCSV(int[][] csv){
        for (int[] line : csv) 
            System.out.printf("%d %d %d\n", line[0], line[1], line[2]);
    }

    static <T> void printIterable(Iterable<T> it){
        for (T el : it) {
            System.out.println(el);
        }
    }

    void printFinishedList(){
        for(Object pp : this.finishedPcbs.toArray())
            System.out.println((PCB) pp);
    }
    static Deque<PCB> csvToQueue(int[][] csv){
        // Given a CSV convert to queue sorted by arrival time and burst 
        List<PCB> pcbs = new LinkedList<PCB>();
        
        for (int[] line : csv) {
            if(!pcbs.add(new PCB(line[2], line[0], -1, line[1], -1)))
                System.out.print("Addition of PCB to List failed");
        }
        Collections.sort(pcbs, new PCB(0, 0, 0, 0, 0));
        return (Deque<PCB>) pcbs;
    }

    void applyRoundRobin(boolean verbose){
        this.pcbs = csvToQueue(this.csv);
        finishedPcbs = new LinkedList<PCB>();
        this.lastProcessPID = pcbs.getLast().pid;
        PCB pcb = this.pcbs.pop();
        this.time = pcb.submissionTime;
        while(true){
            if(pcb.enterTime == -1)
                    pcb.enterTime = time;

            if(pcb.burstLeft <= quantom){
                time += pcb.burstLeft;
                pcb.burstLeft = 0;
                pcb.finishTime = time;
                this.finishedPcbs.add(pcb);
                if(verbose)
                    System.out.printf("Process %d Finished at Time %d\n", pcb.pid, time);
            }
            else {
                if(verbose)
                    System.out.printf("Process %d Time %d Burst %d->%d\n", pcb.pid, time, pcb.burstLeft, pcb.burstLeft-quantom);
                time += quantom;
                pcb.burstLeft -= quantom;
                this.pcbs.add(pcb);
            }
            if(pcbs.isEmpty())
                break;
            pcb = this.pcbs.pop();
        }
    }
    
    void printPhase2Statistics(boolean verbose){
        applyRoundRobin(verbose);

        // Call applyRoundRobin before calling this method
        int timeFirstProcessArrives = this.timeFirstProcessArrives,
            pidOfSecondProcessExecutedAtCPU = -1,    
            pidOfSecondProcessExecuted = -1, 
            timeLastProcessExecuted = -1,
            pidOfLastProcessExecuted = -1,
            timeLastProcessExecutedAtCPU = -1,
            pidOfLastProcessExecutedAtCPU = this.lastProcessPID,
            totalTimeForExecution = -1;
        
        double averageTurnaround = 0,
              averageWaitingtime = 0;

        String finishTimes = "";
        
        this.pcbs = csvToQueue(this.csv);
        timeFirstProcessArrives = pcbs.pop().submissionTime;
        pidOfSecondProcessExecutedAtCPU = pcbs.pop().submissionTime;
        
        
        for(Object temp : this.finishedPcbs.toArray()){
            PCB tempPcb = (PCB) temp;
            if(tempPcb.pid == this.lastProcessPID)
                timeLastProcessExecutedAtCPU = tempPcb.enterTime;
            
        }

        for (int i = 0; i < finishedPcbs.size(); i++) {
            PCB pcb = finishedPcbs.get(i);
            if(i == 1) // Second process{}
                pidOfSecondProcessExecuted = pcb.pid;
            else if(i == finishedPcbs.size() - 1){ // Last process
                totalTimeForExecution = pcb.finishTime - timeFirstProcessArrives;
                timeLastProcessExecuted = pcb.finishTime;
                pidOfLastProcessExecuted = pcb.pid;
            }

            averageTurnaround += pcb.getTurnaround();
            averageWaitingtime += pcb.getWaiting();

            finishTimes += String.format("\tPCB %d's finish time is %d\n", pcb.pid, pcb.finishTime);
        }

        averageTurnaround /= finishedPcbs.size() - 4;
        averageWaitingtime /= finishedPcbs.size();

        // System.out.printf("Time first process arrives: %d\n"
        //                 + "PID of second process executed (Finished): %d, (Entered): %d\n"
        //                 + "Time last process executed (Finished): %dو (Entered): %d\n"
        //                 + "PID of last process executed (Finished): %d, (Entered): %d\n"
        //                 + "Total time of execution: %d\n"
        //                 + "Average Turnaround: %f\n"
        //                 + "Average waiting time: %f\n"
        //                 + "Finish time of every process:\n%s", 
        //                 timeFirstProcessArrives,
        //                 pidOfSecondProcessExecuted,
        //                 pidOfSecondProcessExecutedAtCPU,
        //                 timeLastProcessExecuted,
        //                 timeLastProcessExecutedAtCPU,
        //                 pidOfLastProcessExecuted,
        //                 pidOfLastProcessExecutedAtCPU,
        //                 totalTimeForExecution,
        //                 averageTurnaround,
        //                 averageWaitingtime,
        //                 finishTimes);
        
        int lessThanAverageTurnaround = 0;
        for(Object temp : this.finishedPcbs.toArray()){
            PCB tempPcb = (PCB) temp;
            if(tempPcb.getTurnaround() < averageTurnaround)
                lessThanAverageTurnaround++;                
        }
        System.out.printf("EXAM less than avg turnaround : %d", lessThanAverageTurnaround);
                
    }

    public static void main(String[] args) {
        String filename = "data.csv";
        boolean skipFirstRow = true;
        int[][] csv = parseCSV(filename, skipFirstRow);

        // Phase 1
        printPhase1Statistics(csv);

        // Phase 2
        Sechduler cpu = new Sechduler(csv);
        boolean verbose = false;
        cpu.printPhase2Statistics(verbose);
    }
}

class PCB implements Comparator<PCB> {
    int pid, submissionTime, finishTime, burstLeft, burstMax, enterTime;

    public PCB(int pid, int submissionTime, int finishTime, int burst, int enterTime){
        this.pid = pid;
        this.submissionTime = submissionTime;
        this.finishTime = finishTime;
        this.burstLeft = burst;
        this.burstMax = burst;
        this.enterTime = enterTime;
    }

    int getTurnaround(){
        return this.finishTime - this.submissionTime;
    }

    int getWaiting(){
        return this.getTurnaround() - this.burstMax;
    }

    public String toString(){
        return String.format("PID:%d SubmissionTime:%d FinishTime:%d BurstLeft:%d Submission:%d", pid, submissionTime, finishTime, burstLeft, enterTime);
    }

    public int compare(PCB pcb1, PCB pcb2) { 
        // Used to sort based on time and burst
        if(pcb1.submissionTime == pcb2.submissionTime)
            return pcb1.pid - pcb2.pid;
        return pcb1.submissionTime - pcb2.submissionTime;
    }
}
