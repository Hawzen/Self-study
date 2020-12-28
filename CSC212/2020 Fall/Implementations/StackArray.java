
public class StackArray<T> implements Stack<T> {

	private int maxsize, top;
	private T[] nodes;

	public StackArray(int size) {

		maxsize = size;
		top = -1;
		nodes = (T[]) new Object[maxsize];

	}

	@Override
	public T pop() {
		return nodes[top--];
	}

	@Override
	public void push(T e) {
		nodes[++top] = e;
	}

	@Override
	public boolean IsEmpty() {
		return top == -1;
	}

	@Override
	public boolean IsFull() {
		return top == maxsize - 1;
	}

}
