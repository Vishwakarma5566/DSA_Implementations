package Java.LinkedList;

public class Singly {
	Node headNode;
//	Node tailNode;
	int size;
	public Singly() {
		this.headNode=null;
		this.size=0;
	}
	
	class Node{
		int data;
		Node nextNode;
		Node(int data) {
			this.data=data;
			this.nextNode=null;
			size++;
		}
		
	}
	public void addFirst(int x) {
		Node node=new Node(x);
		if(headNode==null ) {
			headNode=node;
		}
		else {
			node.nextNode=headNode;
			headNode=node;
		}
		
	}
	public void addLast(int x) {
		Node lasNode = new Node(x);
		Node curNode = headNode;
		if (headNode==null) {
			headNode=lasNode;
			return;
		}
		while (curNode.nextNode!=null) {
			curNode=curNode.nextNode;
		}
		curNode.nextNode=lasNode;
		
	}
	public void deletFirst() {
		if(headNode==null) {
			System.out.println("Empty hai Bhai");
			return;
		}
		
		else {
			headNode=headNode.nextNode;
			size--;
		}
	}
	public void deletLast() {
		if (headNode==null) {
			System.out.println("Empty hai Bhai!");
			return;
		}
		else if (headNode.nextNode==null) {
			headNode=null;
			size--;
			return;
		}
		Node slasNode=headNode;
		Node lasNode=headNode.nextNode;
		while (lasNode.nextNode!=null) {
			slasNode=slasNode.nextNode;
			lasNode=lasNode.nextNode;
		}
		slasNode.nextNode=null;
		size--;
	}
	public int Size() {
		return size;
	}
//	public int length() {
//		if(headNode==null) {
//			return 0;
//		}
//		Node p = headNode;
//		int count=0;
//		while(p!=null) {
//			count++;
//			p=p.nextNode;
//		}
//		return count;
//	}
	
	public void display() {
		Node p=headNode;
		while(p!=null) {
			System.out.print(p.data+ " -> ");
			p=p.nextNode;
		}
	}
	
//	Public Node mid(Node head) {
//		Singly slow=head;
//		Singly fast=head;
//		while(fast!=null) {
//			slow=slow.nextNode;
//			fast=fast.nextNode.nextNode;
//		}
//		return slow;
//		}

	

	public static void main(String[] args) {
		Singly sl = new Singly();
		sl.addFirst(23);
		sl.addFirst(24);
		sl.addFirst(25);
		sl.addFirst(26);
		
		sl.addLast(5);
		sl.addLast(4);
		sl.addLast(3);
		sl.addLast(2);
		sl.addLast(1);
		
		System.out.println(sl.Size());
		
		sl.deletFirst();
		sl.deletLast();
		System.out.println(sl.Size());
		sl.display();

	}

}
