package Java.LinkedList;

//import org.w3c.dom.Node;

public class MyStack {
	Node head;
	int size;
	private static class Node{
		Node next;
		int data;
		public Node(int data) {
			this.data=data;
		}
	}
	public MyStack() {
		this.head=null;
		this.size=0;
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public void push(int data) {
		Node node = new Node(data);
		if(head==null) {
			head=node;
			size++;
			return;
		}
		node.next=head;
		head=node;
		size++;
	}
	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("Stack is empty!!! (Underflow)");
		}
		int res = head.data;
		head=head.next;
		size--;
		return res;
		
	}
	public int peek() {
		if(head==null) {
			throw new RuntimeException("Stack is empty!!! (Underflow)");
		}
		return head.data;
	}

	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		myStack.push(10);
		myStack.push(9);
		myStack.push(8);
		myStack.push(7);
		
		System.out.println(myStack.size());
		// TODO Auto-generated method stub
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.peek());
	}

}
