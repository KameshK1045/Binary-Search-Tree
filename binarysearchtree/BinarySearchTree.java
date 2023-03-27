package binarysearchtree;

public class BinarySearchTree {
	 Node root;
	
	 public BinarySearchTree(int value) {
		 root = new Node(value);
	 }
	 
	 public BinarySearchTree() {
		 root = null;
	 }
	 
	 public class Node{
		 int value;
		 Node right;
		 Node left;
		 
		 public Node(int value) {
			 this.value = value;
			 right = left = null;
		 }
	 }
	 
	 public Node insertTheValue(Node root,int value) {
		 if(root == null) {
		 return new Node(value);
		 }
		 else if(value<root.value) {
			 root.left = insertTheValue(root.left,value); 
		 }
		 else {
			 root.right = insertTheValue(root.right,value);
		 }
		 return root;
	 }
	 
	 public Node searchTheValue(Node root, int value) {
		 if(root == null || root.value == value) {
			 return root;
		 }
		 else if(value<root.value) {
			 return searchTheValue(root.left,value);
		 }
		 else {
			 return searchTheValue(root.right,value); 
		 }
	 }
	 
	 public Node deleteTheValue(Node root, int value) {
		 if(root == null) {
			 return root;
		 }
		 else if(value<root.value) {
			 root.left = deleteTheValue(root.left,value);
		 }
		 else if(value>root.value){
			 root.right = deleteTheValue(root.right,value); 
		 }
		 else {
			 if(root.left == null) {
				 return root.right;
			 }
			 else if(root.right == null) {
				 return root.left;
			 }
			 root.value = min(root.right);
			 root.right = deleteTheValue(root.right,root.value);
		 }
		 return root;
	 }
	 
	 public void ascendingOrder(Node root) {
		 if(root != null ) {
			 ascendingOrder(root.left);
			 System.out.print(root.value+" ");
			 ascendingOrder(root.right);
		 }
	 }
	 
	 public int min(Node root) {
		 int minValue = root.value;
		 while(root.left != null) {
			 minValue = root.left.value;
			 root = root.left;
		 }
		 return minValue;
	 }
	 
}
