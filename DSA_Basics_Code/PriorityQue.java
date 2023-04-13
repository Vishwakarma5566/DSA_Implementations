package Java.LinkedList;

public class PriorityQue {
	Item[] pque;
	int front;
	int rear;
	int size;
	
	public PriorityQue(int c) {
		// TODO Auto-generated constructor stub
		this.pque=new Item[c];
		this.front=-1;
		this.rear=-1;
		this.size=c;
	}
	public boolean isFull(){
		return front==0 && rear==size-1;
	}
	public boolean isEmpty() {
		return front==-1;
	}
	
	class Item{
		int value;
		int priority;
		
		public Item(int value, int priority) {
			this.value=value;
			this.priority=priority;
		}
	}
	public void enQueue(int val, int priority) {
		Item objItem = new Item(val, priority);
		if(isFull()) {
			System.out.println("Queue is Full !!!(Overflow Condition)");
			return;
		}
		if(front==-1) {
			front=0;
			rear++;
			pque[rear]= objItem;
			return;
		}
		int pos=-1;
		for (int i = 0; i <= rear; i++) {
			if (objItem.priority>pque[i].priority) {
				pos=i;
				break;
			}
			else if (pque[i].priority == objItem.priority) {
				pos = i+1;
				break;
			}
			pos=i+1;
		}
		for (int i = rear; i >= pos; i--) {
			pque[i+1] = pque[i];
		}
		pque[pos]=objItem;
		rear++;	
	}
	public void display() {
		if (isEmpty()) {
			System.out.println("Empty hai Bhai!!");
			return;
		}
		for (int i = 0; i <=rear; i++) {
			System.out.println(pque[i].value+" "+pque[i].priority);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQue pQ = new PriorityQue(5);
		pQ.enQueue(0, 0);
		pQ.enQueue(1, 1);
		pQ.enQueue(2, 2);
		pQ.enQueue(3, 3);
		pQ.display();

	}

}
