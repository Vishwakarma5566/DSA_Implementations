package Java.LinkedList;

public class Queue {
	int front;
	int rear;
	int queue[];
	int size;
	
	public Queue(int c) {
//		super();
		front=-1;
		rear=-1;
		queue=new int[c];
		size=c;
	}
	
	public boolean isFull() {
		return front==0 && rear==size-1;
	}
	
	public boolean isEmpty() {
		return front==-1;
	}
	
	public void enQueue(int data) {
		if(isFull()){
			System.out.println("Queue is Full!!!!!!!");
			return;
		}
		if(front==-1) {
			front=0;
		}
		queue[++rear]=data;
	} 
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty!!!!");
			return -1;
		}
		int temp =queue[front];
		
		for (int i = 0; i < rear; i++) {
			queue[i]=queue[i+1];
		}
		rear--;
		if (rear==-1) {
			front=-1;
		}
		
		return temp;
	}
	public void display() {
		if (front==-1 || rear==-1) {
			return;
		}
		for (int i = 0; i <=rear ; i++) {
			System.out.print(queue[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue qu = new Queue(6);
		qu.enQueue(10);
		qu.enQueue(20);
		qu.enQueue(30);
		qu.enQueue(40);
		qu.enQueue(50);
		qu.enQueue(60);
		System.out.println("Dequeue: " + qu.dequeue());
		System.out.println("Dequeue: " + qu.dequeue());
		System.out.println("Dequeue: " + qu.dequeue());
		System.out.println("Dequeue: " + qu.dequeue());
		System.out.println("Dequeue: " + qu.dequeue());
		System.out.println("Dequeue: " + qu.dequeue());
		qu.display();

	}

}
