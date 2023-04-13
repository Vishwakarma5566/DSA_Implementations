package Java.LinkedList;

public class Deque{
	int[] deque;
	int front;
	int rear;
	int size;
	
	public Deque(int c) {
		super();
		this.deque = new int[c];
		this.front = -1;
		this.rear = -1;
		this.size = c;
	}
	public boolean isFull() {
		return front==0 && rear==size-1 || front==(rear+1);
	}
	public boolean isEmpty() {
		return front==-1;
	}
	
	public void inserAtFront(int data) {
		if (isFull()) {
			System.out.println("Overflow!!  Queue is Full");
			return;
		}
		if(front==-1) {
			front=0;
			rear=0;
		}
		else if (front==0) {
			front=size-1;
		}
		else {
			front=front-1;
		}
		deque[front]=data;
	}
	public void insertAtRear(int data) {
		if (isFull()) {
			System.out.println("Overflow!!  Queue is Full");
			return;
		}
		if(front==-1) {
			front=0;
			rear=0;
		}
		else if (rear==size-1) {
			rear=0;
		}
		else {
			rear=rear+1;
		}
		deque[rear]=data;
	}
	
	public void display() {
		for (int i : deque) {
			System.out.println(deque[i]+" ");
		}
	}
	
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque dqDeque = new Deque(5);
		dqDeque.inserAtFront(1);
		dqDeque.inserAtFront(2);
		dqDeque.inserAtFront(3);
		dqDeque.display();
		
		

	}

}
