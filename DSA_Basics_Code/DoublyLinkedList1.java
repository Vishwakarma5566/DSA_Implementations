package Java.LinkedList;

public class DoublyLinkedList1 {
	ListNode head;
	ListNode tail;
	private static class ListNode{
		ListNode previous;
		ListNode next;
		int data;
		public ListNode(int data) {
			this.data=data;
			// TODO Auto-generated constructor stub
		}
	}
	public DoublyLinkedList1() {
		this.head=null;
		this.tail=null;
	}
//	public void addLast(int x) {
//		ListNode node = new ListNode(x);
//		if(head==null) {
//			head=tail=node;
//		}
//		else {
//			tail.next=node;
//			node.previous=tail;
//			tail=node;
//		}
//	}
	public void addLast(int x) {
		ListNode node = new ListNode(x);
		ListNode current = head;
		if (head==null) {
			head=node;
			return;
		}
		while (current.next!=null) {
			current=current.next;
		}
		current.next=node;
		node.previous=current;
	}
	public void deleteLast() {
		if(head==tail) {
			head=null;
		}
		else {
			tail=tail.previous;
			tail.next=null;
		}
	}
	public void insertAt(int i, int value) {
		ListNode node = new ListNode(value);
		ListNode p1 = head;
		int count=1;
		if(count<i-1) {
			p1=p1.next;
			count++;
		}
		ListNode temp=p1.next;
		p1.next=node;
		node.previous=p1;
		node.next=temp;
		temp.previous=node;
		
	}
	public void addFirstIndex(int value) {
		ListNode node = new ListNode(value);
		node.next=head;
		head.previous=node;
		head=node;
	}
	public void addLastIndex(int value) {
		ListNode node = new ListNode(value);
		tail.next=node;
		node.previous=tail;
		tail=node;
		
	}
	public void dispBackward() {
		ListNode p2 = head ;
		System.out.print("Backward Data : ");
		while(p2!=null) {
			System.out.print(p2.data+" --> ");
			p2=p2.next;
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		DoublyLinkedList1 dbl = new DoublyLinkedList1();
		dbl.addLast(32);
		dbl.addLast(41);
		dbl.addLast(56);
		dbl.addLast(38);
		
		dbl.dispBackward();
//		dbl.deleteLast();
////		dbl.insertAt(4,49);
//		dbl.addFirstIndex(67);
//		dbl.addLastIndex(98);
//		dbl.dispBackward();
		// TODO Auto-generated method stub

	}

}
