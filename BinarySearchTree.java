package BinarySearchTree;
class Node{
	int data;
	Node left;
	Node Right;
	
}
class 	BST{
	
	public Node createNewNode(int k) {
	Node a = new Node();
	a.data = k;
	a.left = null;
    a.Right = null;
    return a;
}

	public Node insert(Node node, int val) {
		if(node == null) {
			return createNewNode(val);
			
		}
		if(val < node.data)
		{
			node.left = insert(node.left, val);
		}
		else if(val > node.data)
		{
			node.Right = insert(node.Right, val);
		}
		return node;
	}

	




public void inorder(Node node) {
	
	
}

}



		


	

public class BinarySearchTree {

	public static void main(String[] args) {
	
 BST a = new BST();
 Node root = null;
 root = a.insert(root,  8);
 root = a.insert(root,  3);
 root = a.insert(root,  10);
 a.insert(root, 8);
 
	
	}
}

