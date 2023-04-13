package Java.LinkedList;


public class SinglyListDemo {
	Node head;
	Node tail;
	private static class Node{
		Node next;
		int data;
		public Node(int data) {
			this.data = data;
		}
	}
	public void addSorted(int x) {
		Node node = new Node(x);
		Node pNode=head;
//		Node tempNode;
		if(head==null) {
			head=tail=node;
		}
		else {
			while(pNode!=null) {
				if(node.data>pNode.data) {
					node.next=head;
					head=node;
				}
				else if(node.data<=pNode.data) {
					tail.next=node;
					tail=node;
				}
				pNode=pNode.next;
			}
		}
		 
	}
	public int length() {
		Node pNode=head;
		int count=1;
		while(pNode!=null) {
			pNode=pNode.next;
			count++;
		}
		return count;
	}
	public void insertAt(int i, int value) {
		Node node=new Node(value);
		Node p = head;
		if(i<1 || i>length()) {
			System.out.println("Can't insert data");
		}
		while(--i>0) {
			p=p.next;
		}
		node.next=p.next;
		p.next=node;
	}
	public void display(){
		Node p = head;
		while(p!=null) {
			System.out.print(p.data+" --> ");
		}
	}

	public static void main(String[] args) {
		SinglyListDemo sld = new  SinglyListDemo();
//		sld.addSorted(23);
//		sld.addSorted(27);
//		sld.addSorted(20);
		sld.insertAt(2,23);
		sld.display();
		
		

	}

}
