package Java.LinkedList;

class Item{
	int value;
	int priority;
	
	public Item(int value, int priority) {
		super();
		this.value = value;
		this.priority = priority;
	}
	
}

public class PriorityItemQue {
	Item[] qItems;
	int front=-1;
	int rear=-1;
	int size;

	public PriorityItemQue(int c) {
		super();
		this.qItems = new Item[c];
		this.front = -1;
		this.rear = -1;
		this.size = c;
	}
	
	public boolean isEmpty() {
		return front==-1;
	}
	
	public boolean isFull() {
		return front==0 && rear==size-1;
	}
	
	public void enQueue() {
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityItemQue piq = new PriorityItemQue(5);

	}

}
