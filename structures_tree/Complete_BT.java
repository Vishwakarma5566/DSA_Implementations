package structures_tree;

public class Complete_BT {
	Node root;
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
	
	public int NumberOfNode(Node node) {
		if(node==null) {
			return 0;
		}
		return (1+ NumberOfNode(node.left) + NumberOfNode(node.right));
	}
	
//	public boolean IsCompleteBinaryTrree(Node node) {
//		if(node==null) {
//			return true;
//		}
//		if(index>=NumberOfNode(node)) {
//			
//		}
//	}

	public static void main(String[] args) {
		Complete_BT cBt = new Complete_BT();
		cBt.root=new Node(1);
		cBt.root.left=new Node(2);
		cBt.root.right=new Node(3);
		cBt.root.left.left=new Node(4);
		cBt.root.left.right=new Node(5);
		
		System.out.println(cBt.NumberOfNode(cBt.root));
	}

}
