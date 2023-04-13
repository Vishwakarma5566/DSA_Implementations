package structures_tree;

public class Balanced_BT {
	Node root;
	public Balanced_BT() {
		this.root=null;
	}
	
	static class Node {
		int data;
		Node left;
		Node right;
		
		public Node(int value) {
			this.data=value;
			this.left=null;
			this.right=null;
		}
	}
	
	public int height(Node node) {
		if (node==null) {
			return 0;
		}
		return (1+ Math.max(height(node.left),height(node.right)));
	}
	
	public boolean isBalanced(Node node) {
		if (node==null) {
			return true;
		}
		int lh=height(node.left);
		int rh=height(node.right);
		
		if (Math.abs(lh-rh)<=1) {
			return true;
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		Balanced_BT bt = new Balanced_BT();
		bt.root=new Node(11);
		bt.root.left=new Node(12);
		bt.root.right=new Node(13);
		bt.root.left.left=new Node(14);
		bt.root.left.right=new Node(15);
		bt.root.left.left.left=new Node(16);
		bt.root.left.left.right=new Node(17);
		
		System.out.println(bt.height(bt.root));
		
		if (bt.isBalanced(bt.root)) {
			System.out.println("Tree is Balanced");
		}
		else {
			System.out.println("Tree is not Balanced");
		}

	}

}
