 package structures_tree;

import java.util.ArrayList;
import java.util.Stack;

public class preorder_list {
	Node root;
	public preorder_list() {
		this.root=null;
	}
	static class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	public ArrayList<Integer> preorder(Node node) {
		
		ArrayList<Integer> aL = new ArrayList<>();
		Stack<Node> st = new Stack<>();
		st.push(node);
		
		while (!st.isEmpty()) {
			Node n = st.pop();
			aL.add(n.data);
			
			if (n.right!=null) {
				st.push(n.right);
			}
			if (n.left!=null) {
				st.push(n.left);
			}
		}
		return aL;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		preorder_list prL = new preorder_list();
		prL.root=new Node(1);
		prL.root.left=new Node(2);
		prL.root.right=new Node(3);
		prL.root.left.left=new Node(4);
		prL.root.left.right=new Node(5);
		prL.root.right.left=new Node(6);
		
		prL.preorder(prL.root);
		System.out.println(prL.preorder(prL.root));
		

	}

}
