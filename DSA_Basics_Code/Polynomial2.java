package Java.LinkedList;

public class Polynomial2 {
	Node head;
	int length;
	class Node{
		int coefficient;
		int exponent;
		Node next;
		
		public Node(int coef, int pow) {
			coefficient=coef;
			exponent=pow;
		}
	}
	public void addLast(int c, int p) {
		Node newNode = new Node(c, p);
		if (head==null) {
			head=newNode;
			length++;
		}
		else {
			Node curNode=head;
			while (curNode.next!=null) {
				curNode=curNode.next;
			}
			curNode.next=newNode;
			length++;
		}
	}
	public void display() {
		if (head==null) {
			System.out.println();
		}
		else {
			Node curNode=head;
			while (curNode!=null) {
				System.out.print(curNode.coefficient+"x^"+curNode.exponent);
				if (curNode.next!=null) {
					System.out.print("+");
				}
				curNode=curNode.next;
			}
		}
	}
//	public Polynomial2 AddingTwoPolynomials(Polynomial2 pl1, Polynomial2 pl2) {
//		Polynomial2 poly = new Polynomial2();
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polynomial2 pl1 = new Polynomial2();
		pl1.addLast(8, 3);
		pl1.addLast(3, 2);
		pl1.addLast(6, 1);
		pl1.addLast(2, 0);
		
		pl1.display();
		
//		Polynomial2 pl2 = new Polynomial2();
//		pl2.addLast(5, 2);
//		pl2.addLast(3, 1);
//		pl2.addLast(7, 0);
//		
//		Polynomial2 pl3 = AddingTwoPolynomials(pl1, pl2);
//		pl3.display();
		
	}

}
