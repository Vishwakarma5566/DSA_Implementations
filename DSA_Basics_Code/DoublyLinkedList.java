package Java.LinkedList;


public class DoublyLinkedList {
	ListNode head;
//	ListNode tail;
	int length;
	class ListNode{
		ListNode previous;
		ListNode next;
		int data;
		public ListNode(int data){
			this.data=data;
			this.next=null;
			this.previous=null;
			length++;
		}
	}
	public DoublyLinkedList() {
		this.head=null;
//		this.tail=null;
		this.length=0;
	}
	public void addFirst(int x) {
		ListNode node = new ListNode(x);
		if(head==null) {
			head=node;
		}
		else {
			node.next=head;
			head.previous=node;
			head=node;
		}
	}
	public void addLast(int x) {
		ListNode newNode=new ListNode(x);
		if (head==null) {
			head=newNode;
		}
		else {
			ListNode curListNode=head;
			while (curListNode.next!=null) {
				curListNode=curListNode.next;
			}
			curListNode.next=newNode;
			newNode.previous=curListNode;
		}
	}
	public void deleteFirst() {
		 if(head==null) {
			 System.out.println("Empty hai Bhai");
		 }
		 else {
			 head=head.next;
			 head.previous=null;
			 length--;
		}	 	
	}
	public void deletLast() {
		if (head==null) {
			System.out.println("Empty hai Bhai!!");
			return;
		}
		else if(head.next==null) {
			head=null;
			length--;
			return;
		}
		else {
			ListNode slListNode = head;
			ListNode lasListNode=head.next;
			while (lasListNode.next!=null) {
				slListNode=slListNode.next;
				lasListNode=lasListNode.next;
			}
			lasListNode.previous=null;
			slListNode.next=null;
			length--;
		}
	}
	
	public int Size() {
		return length;
	}
	public void dispForward() {
		ListNode p1 = head;
		System.out.print("Forward Data : ");
		while(p1!=null) {
			System.out.print(p1.data+" --> ");
			p1=p1.next;
		}
		System.out.println();
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList dbl = new DoublyLinkedList();
		dbl.addFirst(32);
		dbl.addFirst(41);
		dbl.addFirst(56);
		dbl.addFirst(38);
		
		dbl.dispForward();
		dbl.deleteFirst();
		dbl.addLast(1);
		dbl.addLast(2);
		dbl.addLast(3);
		dbl.addLast(4);
		dbl.addLast(5);
		dbl.deletLast();
		dbl.dispForward();
		System.out.println(dbl.Size());
		
		
	}

}
