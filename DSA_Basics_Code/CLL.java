package Java.LinkedList;

public class CLL {
	Node head;
	int size;
	class Node{
		Node next;
		String data;
		
		public Node(String data) {
			this.data=data;
			this.next=null;
			size++;
		}
	}
	public CLL() {
		head=null;
		size=0;
	}
	public int Length() {
		return size;
	}
	public void addFirst(String x) {
		Node newNode = new Node(x);
		if (head==null) {
			head=newNode;
			head.next=head;
		}
		else {
			Node curNode=head;
			while (curNode.next!=head) {
				curNode=curNode.next;
			}
			newNode.next=head;
			curNode.next=newNode;
			head=newNode;
		}
	}
	public void addLast(String val) {
		Node newNode = new Node(val);
		if (head==null) {
			head=newNode;
			head.next=head;
		}
		else {
			Node curNode=head;
			while (curNode.next!=head) {
				curNode=curNode.next;
			}
			curNode.next=newNode;
			newNode.next=head;
		}
	}
	public void deletFirst() {
		if (head==null) {
			System.out.println("Empty hai Bhai");
		}
		else if(head.next==head) {
			head=null;
			head.next=null;
			size--;
		}
		else {
			Node curNode=head;
			while (curNode.next!=head) {
				curNode=curNode.next;
			}
			curNode.next=head.next;
			head=head.next;
			size--;
		}
	}
	public void deletLast() {
		if (head==null) {
			System.out.println("Empty hai Bhai");
		}
		else if (head.next==head) {
			head=null;
			head.next=null;
			size--;
		}
		else {
			Node slNode = head;
			Node lNode=head.next;
			while (lNode.next!=head) {
				slNode=slNode.next;
				lNode=lNode.next;
			}
			slNode.next=head;
			size--;
			
		}
	}
	public void display() {
		Node curNode=head;
		if (head==null) {
			System.out.println("Empty hai Bhai");
			return;
		}
		while (curNode.next!=head) {
			System.out.print(curNode.data+" ~! ");
			curNode=curNode.next;
		}
		System.out.println(curNode.data);
		
	}

	public static void main(String[] args) {
		CLL cll = new CLL();
		cll.addFirst("Hare Krishna");
		cll.addFirst("Hare Rama");
		cll.addFirst("Jai Giridhari");
		cll.addFirst("Jai Gopinath");
		
		cll.deletFirst();
		
		cll.addLast("Hari");
		cll.addLast("Hari Haray");
		cll.addLast("Hari Haray Namah");
		
		cll.deletLast();
		cll.display();
		System.out.println(cll.Length());
	}

}
