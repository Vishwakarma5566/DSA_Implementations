package Java.LinkedList;

public class Node {
	    Node headNode;
	    Node tailNode;
		int data;
		Node nextNode;
		Node(int data) {
			this.data=data;
		}
public static Node mid(Node head) {
	Node slow=head;
	Node fast=head;
	while(fast.nextNode!=null) {
		slow=slow.nextNode;
		fast=fast.nextNode.nextNode;
		}
	    return slow;
			}
public void add(int data) {
		Node node=new Node(data);
		if(headNode==null ) {
			headNode=tailNode=node;
		}
		else {
			node.nextNode=headNode;
			headNode=node;
		}
}

public static void main(String[] args) {
	Node sl=new Node(5);
	sl.add(23);
	sl.add(24);
	sl.add(25);
	sl.add(26);
	System.out.println(sl.nextNode.data);
	Node head1=mid(sl);
	System.out.println(head1.data);
		// TODO Auto-generated method stub

	}

}
