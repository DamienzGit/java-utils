package Main;

import data_structures.BynaryTree;

public class main {
	
	public static void main(String[] args) {
		BynaryTree<Integer> b = new BynaryTree<>(1);
		b.left = new BynaryTree(2);
		b.right = new BynaryTree(3);
		b.left.left = new BynaryTree(4);
		b.left.right = new BynaryTree(5);
		b.right.left = new BynaryTree(6);
		b.right.right = new BynaryTree(7);
		
		
		b.display(0);
		b.flip();
		b.display(0);
	}
	
}
