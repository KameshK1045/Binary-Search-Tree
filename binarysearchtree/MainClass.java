package binarysearchtree;

import binarysearchtree.BinarySearchTree.Node;

public class MainClass {

	public static void main(String[] args) {
		
		BinarySearchTree bin = new BinarySearchTree(10);
		bin.insertTheValue(bin.root, 5);
		bin.insertTheValue(bin.root, 3);
		bin.insertTheValue(bin.root, 1);
		bin.insertTheValue(bin.root, 2);
		bin.insertTheValue(bin.root, 4);
		bin.insertTheValue(bin.root, 9);
		bin.insertTheValue(bin.root, 7);
		bin.ascendingOrder(bin.root);
		
		if(bin.searchTheValue(bin.root,4) != null) {
			System.out.println("Its found");
		}
		else {
			System.out.println("Its not found");
		}
		
		bin.deleteTheValue(bin.root, 4);
		bin.ascendingOrder(bin.root);
	}
	
}
