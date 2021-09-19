import java.io.*; 
import java.util.concurrent.TimeUnit;

enum Part{
    SUM,
    SYNCH,
    INTERRUPT
}

class PassableInt {
    long val = 0;
}

public class HwThread implements Runnable {
    Part part;
    int start, stop, threadNumber, interruptType;
    PassableInt sumTo;

    public HwThread(Part part, int start, int stop, PassableInt sumTo){
        this.part = part;
        this.start = start;
        this.stop = stop;
        this.sumTo = sumTo;
    }

    public HwThread(Part part, int threadNumber){
        this.part = part;
        this.threadNumber = threadNumber;
    }

    public HwThread(Part part, int threadNumber, int interruptType){
        this.part = part;
        this.threadNumber = threadNumber;
        this.interruptType = interruptType;
    }

    public void run(){
        switch(this.part){
            case SUM:
                this.sum(this.start, this.stop, sumTo);
                break;
            case SYNCH:
                this.writeFile(this.threadNumber);
                break;
            case INTERRUPT:
                if(this.interruptType == 0)
                    interruptZeroMethod();
                else
                    interruptOneMethod();
        }
    }

    void sum(int start, int stop, PassableInt sumTo) {
        for(int i=start; i <= stop; i++)
            sumTo.val += i;
    }

    synchronized void writeFile(int threadNumber){
        try{
            FileWriter file = new FileWriter("shareable.txt", true);
            file.append(String.format("Thread %d started writing\n", threadNumber));
            file.append(String.format("Thread %d is currently writing\n", threadNumber));
            file.append(String.format("Thread %d finished writing – Mohand Alrasheed\n", threadNumber));
            file.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    void interruptZeroMethod(){
        System.out.print("Thread 0 is created\n");
        try{
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e){
            System.out.print("Thread 0 is interrupted!\n");
            Thread.currentThread().interrupt();
        }
    }
    
    void interruptOneMethod(){
        System.out.print("Thread 1 is created\n");
        while(true){
            for(int i=0; i<1000; i++); // Do some stuff
            if(Thread.currentThread().isInterrupted()){ // Check periodically 
                System.out.print("Thread 1 is interrupted!\n");
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
    public static void main(String args[]){
        int start = 1, stop = 100000000, step=stop/4;
        
        // Threaded
        long initial = System.currentTimeMillis();
        PassableInt[] sumTo = new PassableInt[4];
        HwThread[] threads = new HwThread[4];

        for(int i=start, cnt=0; i<stop; i+=step, cnt++){
            sumTo[cnt] = new PassableInt();
            threads[cnt] = new HwThread(Part.SUM, i, i + step - 1, sumTo[cnt]);
            threads[cnt].run();
        }

        long total = 0;
        for (PassableInt pass : sumTo) {
            total += pass.val;
        }
        
        long after = System.currentTimeMillis();
        System.out.printf("Threaded:\nTotal: %d\t Time: %d Milliseconds", total, after - initial);


        // Sequential
        initial = System.currentTimeMillis();
        total = 0;
        for(int i=start; i<=stop; i++)
            total += i;
        after = System.currentTimeMillis();
        System.out.printf("\n\nSequential:\nTotal: %d\t Time: %d Milliseconds", total, after - initial);


        // Synchronization
        for(int cnt=0; cnt<3; cnt++){
            threads[cnt] = new HwThread(Part.SYNCH, cnt);
            threads[cnt].run();
            // threads[cnt].
        }




        // Interrupts
        HwThread one = new HwThread(Part.INTERRUPT, 1, 1);
        Thread threadOne = new Thread(one);
        threadOne.start();
        System.out.printf("\n\n\n");
        threadOne.interrupt();

        HwThread zero = new HwThread(Part.INTERRUPT, 0, 0);
        Thread threadZero = new Thread(zero);
        threadZero.start();
        System.out.printf("\n\n\n");
        threadZero.interrupt();
        
    }
}