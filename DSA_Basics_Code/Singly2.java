package Java.LinkedList;

public class Singly2 {
	Node head;
	Node tail;
	private static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
		
	}
	public void addLast(int x) {
		Node node = new Node(x);
		if(head==null) {
			head=tail=node;
		}
		else {
			tail.next=node;
			tail=node;
		}
	}
	public void display() {
		Node p=head;
		while(p!=null) {
			System.out.print(p.data+" -> ");
			p=p.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singly2 sl2 = new Singly2();
		sl2.addLast(1);
		sl2.addLast(2);
		sl2.addLast(3);
		sl2.addLast(4);
		sl2.addLast(5);
		sl2.addLast(6);
		sl2.addLast(5);
		sl2.display();
		

	}

}
