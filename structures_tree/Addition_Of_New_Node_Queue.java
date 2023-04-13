package structures_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Addition_Of_New_Node_Queue {
	Node root;
	public Addition_Of_New_Node_Queue() {
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
	
	public void insertInLevel(int data) {
		if (root==null) {
			root=new Node(data);
			return;
		}
		Queue<Node> queue = new LinkedList<>();
		queue.offer(root);
		
		while (!queue.isEmpty()) {
			Node node = queue.poll();
			if (node.left!=null) {
				queue.offer(node.left);
				
			}
			else {
				node.left=new Node(data);
				return;
			}
			if (node.right!=null) {
				queue.offer(node.right);
				
			}
			else {
				node.right=new Node(data);
				return;
			}
		}
	}
	
	public void inOrder(Node root) {
		if (root!=null) {
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
		
	}
	
	public static ArrayList<Integer> levelOrder(Node node) {
		if (node==null ) {
			return null;
		}
		Queue<Node> queue = new LinkedList<>();
		ArrayList<Integer> al = new ArrayList<>();
		queue.offer(node);
		
		while (!queue.isEmpty()) {
			Node node2 = queue.poll();
			al.add(node2.data);
			
			if (node2.left!=null) {
				queue.offer(node2.left);
			}
			if (node2.right!=null) {
				queue.offer(node2.right);
			}
		}
		return al;
		
	}
	
	public static int maxValue(Node node) {
		if (node==null ) {
			return 0;
		}
		int max=Integer.MIN_VALUE;
		Queue<Node> queue = new LinkedList<>();
		queue.offer(node);
		
		while (!queue.isEmpty()) {
			Node node2 = queue.poll();
			if (node2.data>max) {
				max=node2.data;
			}
			if (node2.left!=null) {
				queue.offer(node2.left);
			}
			if (node2.right!=null) {
				queue.offer(node2.right);
			}
		}
		return max;
		
	}
	
	public static int countLeaf(Node node) {
		if (node==null ) {
			return 0;
		}
		int max=0;
		Queue<Node> queue = new LinkedList<>();		 
		queue.offer(node);
		
		while (!queue.isEmpty()) {
			Node node2 = queue.poll();
			if (node2.left==null && node2.right==null) {
				max++;
			}
			if (node2.left!=null) {
				queue.offer(node2.left);
			}
			if (node2.right!=null) {
				queue.offer(node2.right);
			}
		}
		return max;
		
	}
	

	public static boolean search(Node node, int key) {
		if (node==null) {
			return false;
		}		
		Queue<Node> queue = new LinkedList<>();
		queue.offer(node);
		
		while (!queue.isEmpty()) {
			Node node2 = queue.poll();
			if (node2.data==key) {
				return true;
			}
			if (node2.left!=null) {
				queue.offer(node2.left);
			}
			if (node2.right!=null) {
				queue.offer(node2.right);
			}
		}
		return false;
		
	}
	

	public static int Levelcount(Node node) {
		if (node==null ) {
			return 0;
		}
		int levelcount=1;
		Queue<Node> queue = new LinkedList<>();
		queue.offer(node);
		queue.offer(null);
		
		while (!queue.isEmpty()) {
			Node node2 = queue.poll();			
			if (node2!=null) {
				
				if (node2.left!=null) {
					queue.offer(node2.left);
				}
				if (node2.right!=null) {
					queue.offer(node2.right);
				}
			}
			else {
				if (!queue.isEmpty()) {
					levelcount++;
					queue.offer(null);
				}
			}
		}
		return levelcount;
		
	}

	public static void main(String[] args) {
		
		Addition_Of_New_Node_Queue adib = new Addition_Of_New_Node_Queue();
		adib.insertInLevel(10);
		adib.insertInLevel(20);
		adib.insertInLevel(30);
		adib.insertInLevel(40);
		adib.insertInLevel(50);
		adib.insertInLevel(60);
		adib.insertInLevel(70);
//		adib.insertInLevel(80);
		
		adib.inOrder(adib.root);
		System.out.println();
		
		System.out.println(levelOrder(adib.root)); //to print value in a array list
		
		System.out.println(maxValue(adib.root));  //to print maximum of the binary tree
		
		System.out.println(countLeaf(adib.root)); //to count number of leaf nodes in a binary tree
		
		System.out.println(search(adib.root, 70)); //to search an element in the binary tree
		
		System.out.println(Levelcount(adib.root)); //to count the level(or depth) of a binary
	}

}
