package Java.LinkedList;
//import java.util.Stack;


public class Polynomial{
	Node head;
	Node tail;
	int length;
	
	private static class Node{
		Node next;
		int coefficient;
		int exponent;
		
		public Node(int coef, int expo) {
			 this.coefficient=coef;
			 this.exponent=expo;
		}
	}
	public void addLast(int co, int ex) {
		Node node = new Node(co, ex);
		if(head==null) {
			head=tail=node;
		}
		else {
			tail.next=node;
			tail=node;
		}
		
	}
	public void display() {
		Node tempNode=head;
		while (tempNode!=null) {
			System.out.println(tempNode.coefficient+" "+tempNode.exponent);
			tempNode=tempNode.next;
		}
	}
	


	public static void main(String[] args) {
		Polynomial ply = new Polynomial();
		ply.addLast(2, 3);
		ply.display();

	}

}
