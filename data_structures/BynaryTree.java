package data_structures;

public class BynaryTree<T> {
	public T value;
	public int height;
	public BynaryTree left;
	public BynaryTree right;
	
	public BynaryTree(T value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public BynaryTree getLeft() {
		return left;
	}
	
	public void setLeft(BynaryTree left) {
		this.left = left;
	}
	
	public BynaryTree getRight() {
		return right;
	}
	
	public void setRight(BynaryTree right) {
		this.right = right;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void flip() {
		// swap siblings
		BynaryTree<T> newnode = this.left;
		this.left = this.right;
		this.right = newnode;
		if (this.left !=  null)
			this.left.flip();
		if (this.right != null)
			this.right.flip();
	}
	
	
	
	
	public void display(int level) {
		int copy = level;
		while (copy>0) {
			System.out.print("--");
			copy--;
		}
		
		System.out.println(this.getValue());
		
		if (this.left != null) {
			this.left.display(level + 1);
		}
		if (this.right != null) {
			this.right.display(level + 1);
		}
	}
}
