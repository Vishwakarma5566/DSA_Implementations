package Java.LinkedList;

public class CircularQue {
	
	int front;
	int rear;
	int[] queue;
	int size;
	
	
	public CircularQue(int c) {
		super();
		this.front = -1;
		this.rear = -1;
		this.queue = new int[c];
		this.size = c;
	}

	public boolean isEmpty() {
		return front==-1;
	}
	
	public boolean isFull() {
		if (front==0 && rear==size-1) {
			return true;
		}
		if (front==rear+1) {
			return true;
		}
		return false;
	}
	
	private void enQueue(int data) {
		if(isFull()) {
			System.out.println("Queue is full!!");
			return;
		}
		rear = (rear+1)%size;
		queue[rear]=data;
		
		if (front==-1) {
			front=0;
		}
	}
	
	private void display() {
		if (isEmpty()) {
			System.out.println("Queue is empty!!");
			return;
		}
		for (int i = front; i !=(rear+1); i=i+1%size) {
			System.out.print(queue[i]+"->");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularQue cQue = new CircularQue(5);
		cQue.enQueue(1);
		cQue.enQueue(2);
		cQue.enQueue(3);
		cQue.enQueue(4);
		cQue.enQueue(5);
		cQue.enQueue(6);
		
		cQue.display();

	}

}
