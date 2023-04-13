package Java.LinkedList;

public class PriorityQueue {
	
	int[] queue;
	int front=-1;
	int rear=-1;
	int size;
	
	public PriorityQueue(int c) {
		super();
		this.queue = new  int[c];
		this.front = -1;
		this.rear = -1;
		this.size = c;
	}

	public boolean isEmpty() {
		return front==-1;
	}
	
	public boolean isFull() {
		return front==0 && rear==size-1 || front==rear+1;
	}
	
	public void enQueue(int data) {
		if (isFull()) {
			System.out.println("Queue is Full!!!");
			return;
		}
		if (front==-1) {
			rear=0;
			front=0;
			queue[rear]=data;
			return;
		}
		int pos=0;
		for (int i = 0; i <=rear; i++) {
			if (queue[i]<data) {
				pos=i;
				break;
			}
			else if (queue[i]==data) {
				pos=i+1;
				break;
			}
			pos=i+1;
			
		}
		for (int i = rear; i>=pos ; i--) {
			queue[i+1]=queue[i];
		}
		queue[pos]=data;
		rear++;
	}
	
	public void display() {
		if (isEmpty()) {
			System.out.println("Queueis Empty!!!!");
			return;
		}
		for (int i = front; i <=rear; i++) {
			System.out.print(queue[i]+"<-");
		}
	}

	public static void main(String[] args) {
		PriorityQueue pQueue = new PriorityQueue(5);
		pQueue.enQueue(3);
		pQueue.enQueue(4);
		pQueue.enQueue(2);
		pQueue.enQueue(7);
		pQueue.enQueue(3);
		
		pQueue.display();
	}

}
