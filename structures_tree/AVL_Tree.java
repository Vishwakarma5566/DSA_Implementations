package structures_tree;

class Node{
	int data;
	int height;
	Node left;
	Node right; 
	
	public Node(int data) {
		this.data = data;
		this.height=1;
		this.left=null;
		this.right=null;
	}
}

public class AVL_Tree {
	Node root;
	
	public int height(Node n) {
		if (n==null) {
			return 0;
		}
		return n.height;
	}
	
	public int max(int a, int b) {
		return (a>b)? a: b;
	}
	
	public Node rightRotate(Node y) {
		Node x = y.left;
		Node t2 = x.right;
		x.right=y;
		y.left=t2;
		y.height= max(height(y.left), height(y.right)) +1;
		x.height = max(height(x.left), height(x.right)) +1;
		
		return x;
	}
	public Node leftRotate(Node x) {
		Node y = x.right;
		Node t2 = y.left;
		y.left = x;
		x.right = t2;
		x.height = max(height(x.left), height(x.right)) +1;
		y.height = max(height(y.left), height(y.right)) +1;
		
		return y;
	}
	
	public int getBalanceFactor(Node n) {
		if (n==null) {
			return 0;
		}
		return height(n.left)-height(n.right);
	}

	public static void main(String[] args) {
		
	}

}
