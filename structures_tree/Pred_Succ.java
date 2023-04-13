package structures_tree;

public class Pred_Succ {
	Node root;
	public Pred_Succ() {
		root=null;
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
	public Node inOrderSuccessor(Node node) {
		while (node.left!=null) {
			node=node.left;
		}
		return node;
	}
	public Node inOrderPredecessor(Node node) {
		while (node.right!=null) {
			node=node.right;
		}
		return node;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pred_Succ pd = new Pred_Succ();
		pd.root=new Node(11);
		pd.root.left=new Node(12);
		pd.root.right=new Node(13);
		pd.root.left.left=new Node(14);
		pd.root.left.right=new Node(15);
		pd.root.right.left=new Node(16);
		pd.root =pd.inOrderPredecessor(pd.root.left);
		
		System.out.println(pd.root.data);

	}

}
