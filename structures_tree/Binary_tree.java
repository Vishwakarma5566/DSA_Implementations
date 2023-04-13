package structures_tree;


class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int data) {
		this.data = data;
		this.left=null;
		this.right=null;
	}
}

public class Binary_tree {
	TreeNode root;
	
//	class TreeNode{
//		int data;
//		TreeNode left;
//		TreeNode right;
//		
//		public TreeNode(int data) {
//			this.data = data;
//			this.left=null;
//			this.right=null;
//		}
//	}
	
	public TreeNode Insert(TreeNode root, int data) {
		if (root==null) {
			root = new TreeNode(data);
			return root;
		}
		if (root.data>data) {
			root.left = Insert(root.left, data);
		}
		else if (root.data<data) {
			root.right = Insert(root.right, data);
		}
		return root;
	}
	
	public void Inorder(TreeNode root2) {
		if (root2!=null) {
			System.out.print(root2.data +" ");
			Inorder(root2.left);
			Inorder(root2.right);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binary_tree bnt = new Binary_tree();
		bnt.root=new TreeNode(1);
		bnt.root.left=new TreeNode(2);
		bnt.root.right=new TreeNode(3);
		bnt.root.left.left=new TreeNode(4);
		bnt.root.left.right=new TreeNode(5);
		
		bnt.Insert(bnt.root, 1);
		bnt.Insert(bnt.root.left, 2);
		bnt.Insert(bnt.root.right, 3);
		bnt.Insert(bnt.root.left.left,4);
		bnt.Insert(bnt.root.left.right, 5);
		
		bnt.Inorder(bnt.root);
	}

}
