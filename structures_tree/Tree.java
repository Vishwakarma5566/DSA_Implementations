package structures_tree;
import java.util.LinkedList;
import java.util.Queue;

public class Tree {
	Node root;
	class Node{
		int data;
		Node left;
		Node right;
		public Node(int d) {
			data=d;
			left=null;
			right=null;
		}
	}
	public void addInLevel(int data) {
		Node p=new Node(data);
		if (root==null) {
			root=p; 
			return;
		}
		Queue<Node> q = new LinkedList<>();
		Node c = root;
		q.offer(c);
		boolean f=true;
		while (f) {
			c=q.poll();
			if (c.left==null) {
				c.left=p;
				return;
			}
			else if (c.right==null) {
				c.right=p;
				return;
			}
			else {
				if (c.left!=null) {
					q.offer(c.left);
				}
				if (c.right!=null) {
					q.offer(c.right);
				}
			}
		}
	}
	
	public static void main(String[] args) {
	
		
		
		

	}

}





 