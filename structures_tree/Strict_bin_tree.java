package structures_tree;

class Node{
	int data;
	Node left;
	Node right;
	
	public Node(int data) {
		// TODO Auto-generated constructor stub
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
public class Strict_bin_tree {
	Node root;
	
//	class Node{
//		int data;
//		Node left;
//		Node right;
//		
//		public Node(int data) {
//			// TODO Auto-generated constructor stub
//			this.data=data;
//			this.left=null;
//			this.right=null;
//		}
//	}
	
	public boolean isFullbinarytree(Node node) {
		if(node == null) {
			return true;
		}
		if(node.left==null && node.right==null) {
			return true;
		}
		if ((node.left!=null) && (node.right!=null)) 
			return (isFullbinarytree(node.left) && isFullbinarytree(node.right));
		return false;
		
		
	}

	public static void main(String[] args) {
		Strict_bin_tree sbt = new Strict_bin_tree();
		sbt.root=new Node(1);
		sbt.root.left=new Node(2);
		sbt.root.right=new Node(3);
		sbt.root.left.left=new Node(4);
		sbt.root.left.right=new Node(5);
		
		System.out.println(sbt.isFullbinarytree(sbt.root));

	}

}
