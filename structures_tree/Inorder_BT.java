package structures_tree;


public class Inorder_BT {
	Node root;
	
	class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	// Function to insert elements in In order manner
	
	public Node Inorder(int[] arr, int pos) {
		
		Node root=null;
		if (pos<arr.length) {
			root = new Node(arr[pos]);
			
			//left 
			root.left=Inorder(arr, 2*pos+1);
			
			//right
			root.right=Inorder(arr, 2*pos+2);
		}
		return root;
	}
	//function to print tree nodes in In order fashion
	public void inOrder(Node root) {
		if (root!=null) {
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}
	public void preorder(Node root) {
		if (root!=null) {
			System.out.print(root.data+" ");
			inOrder(root.left);
			inOrder(root.right);
		}
	}
	public void postorder(Node root) {
		if (root!=null) {
			inOrder(root.left);
			inOrder(root.right);
			System.out.print(root.data+" ");
		}
	}
	

	public static void main(String[] args) {
		 
		Inorder_BT inBt = new Inorder_BT();
		int arr[]= {1,2,3,4,5,6,7};
		
		inBt.root = inBt.Inorder(arr, 0);
		
		inBt.preorder(inBt.root);
		System.out.println();
		inBt.inOrder(inBt.root);
		System.out.println(); 
		inBt.postorder(inBt.root);

	}

}
