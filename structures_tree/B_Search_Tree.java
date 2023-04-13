package structures_tree;

public class B_Search_Tree { 
	Node root;
	public B_Search_Tree() {
		root=null;
	}
	static class Node{
		int data;
		Node left;
		Node right;		
		public Node(int data) {
			this.data=data;
			left=null;
			this.right=null;
		}
	}
	
	public static Node Insert(Node node, int key) {		
		if (node==null) {
			node = new Node(key);
			return node;
		}
		if (key<node.data) {
			node.left = Insert(node.left, key);
		}
		if (key>node.data) {
			node.right = Insert(node.right, key);
		}
		
		return node;
	}
	
	public static Node delete(Node node, int val ){
		
		if (val<node.data) {
			node.left=delete(node.left, val);
		}
		else if (val>node.data) {
			node.right=delete(node.right, val);
		}
		else {
			if (node.left==null && node.right==null) {
				return null;
			}
			else if (node.left==null) {
				return node.right;
			}
			else if (node.right==null) {
				return node.left;
			}
			
			Node temp = inOrderSuccessor(node.right);
			node.data=temp.data;
			delete(node.right, temp.data);
			
		}
		
		return node;
	}
	
	public static Node inOrderSuccessor(Node root) {
		while (root.left!=null) {
			root=root.left;
		}
		return root;
	}
	
	public void Inorder(Node root2) {
		if (root2!=null) {
			Inorder(root2.left);
			System.out.print(root2.data +" ");
			Inorder(root2.right);
		}
	}
	
	

	public static void main(String[] args) {
		
		B_Search_Tree bst = new B_Search_Tree();
		bst.root = Insert(bst.root,2);
		bst.root = Insert(bst.root,4);
		bst.root = Insert(bst.root,3);
		bst.root = Insert(bst.root,9);
		bst.root = Insert(bst.root,12);
		bst.root = Insert(bst.root,14);
		
		bst.Inorder(bst.root);
		System.out.println();
		bst.root= delete(bst.root,4);
		bst.Inorder(bst.root);

	}

}
