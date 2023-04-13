package structures_tree;

import java.util.ArrayList;
import java.util.Stack;

import structures_tree.preorder_list.Node;

public class Inorder_List {
	Node root;
	
	public Inorder_List() {
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
	
	public ArrayList<Integer> Inorder(Node node) {
		
		ArrayList<Integer> aList = new ArrayList<>();
		Stack<Node> stack = new Stack<>();
		stack.push(node);
		Node n = node;
		
		while (!stack.isEmpty()) {
			
			if (n.left!=null) {
				stack.push(n.left);
				n=n.left;
			}
			else {
				n=stack.pop();
				aList.add(n.data);
				if (n.right!=null) {
					stack.push(n.right);
					n=n.right;
				}
			}
		}
		return aList;
	}

	public static void main(String[] args) {
		 
		Inorder_List inol = new Inorder_List();
		inol.root=new Node(1);
		inol.root.left=new Node(2);
		inol.root.right=new Node(3);
		inol.root.left.left=new Node(4);
		inol.root.left.right=new Node(5);
		inol.root.right.left=new Node(6);
		
		 
		inol.Inorder(inol.root);
		System.out.println(inol.Inorder(inol.root));

	}

}
