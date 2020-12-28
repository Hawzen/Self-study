
public class LinkedStack<T> implements Stack<T> {

	private Node<T> top;

	public LinkedStack() {
		top = null;
	}

	@Override
	public T pop() {
		T e = top.getData();
		top = top.getNext();
		return e;
	}

	@Override
	public void push(T e) {

		Node<T> n = new Node<T>(e);
		n.setNext(top);
		top = n;

	}

	@Override
	public boolean IsEmpty() {
		return top == null;
	}

	@Override
	public boolean IsFull() {
		return false;
	}

}

class Node<T>{
	public T data;
	public Node<T> next;

	Node(T e){
		this.data = e;

	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public Node<T> getNext() {
		return next;
	}

	public T getData() {
		return data;
	}
}