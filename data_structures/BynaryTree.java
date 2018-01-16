package data_structures;

public class BynaryTree<T> {
	private T value;
	private BynaryTree left;
	private BynaryTree right;
	
	public BynaryTree(T value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	public void addLeft(int value) {
		this.left = new BynaryTree(value);
	}
	
	public void addRight(int value) {
		this.right = new BynaryTree(value);
	}
	
	public void setLeft(BynaryTree left) {
		this.left = left;
	}
	
	public void setRight(BynaryTree right) {
		this.right = right;
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
	
	public String displayHeight() {
		String res = "Total Height: " + this.getHeight();
		System.out.println(res);
		return res;
	}
	
	public int getHeight() {
		int left = 0;
		int right = 0;
		if (this.left != null) {
			left += 1 + this.left.getHeight();
		}
		if (this.right != null) {
			right += 1 + this.right.getHeight();
		}
		
		return (left > right) ? left: right;
		
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
	
	public void display() {
		this._display(0);
		this.displayHeight();
	}
	
	private void _display(int depthLevel) {
		int copy = depthLevel;
		while (copy>0) {
			System.out.print("--");
			copy--;
		}
		
		System.out.println(this.getValue());
		
		if (this.left != null) {
			this.left._display(depthLevel + 1);
		}
		if (this.right != null) {
			this.right._display(depthLevel + 1);
		}
	}
}
