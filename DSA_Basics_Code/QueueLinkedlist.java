package Java.LinkedList;

public class QueueLinkedlist {
	Node head;
	int size;
	
	class Node{
		Node next;
		int data;
		
		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.next=null;
			this.data=data;
			size++;
		}
	}
	public QueueLinkedlist() {
		// TODO Auto-generated constructor stub
		head=null;
		size=0;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public int Size() {
		return size;
	}
	public void enQueue(int data) {
		Node newnode = new Node(data);
		if (head==null) {
			head=newnode;
		}
		else {
			Node curNode = head;
			while (curNode.next!=null) {
				curNode=curNode.next;
			}
			curNode.next=newnode;
		}
		
	}
	public int deQueue(int data) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
