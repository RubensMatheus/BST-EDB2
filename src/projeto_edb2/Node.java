package projeto_edb2;

public class Node {

	private int value;
	private int leftSize;
	private int rightSize;
	//private int sumValue;
	private Node left;
	private Node right;
	int height;
	
	public Node(int value) {
		 this.value = value;
		 this.height = 1;
	 }
	
	public Node(int value, int leftSize, int rightSize, Node left, Node right, int height) {
		super();
		this.value = value;
		this.leftSize = leftSize;
		this.rightSize = rightSize;
		this.left = left;
		this.right = right;
		this.height = height;
	}
	

	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getLeftSize() {
		return leftSize;
	}
	public void setLeftSize(int leftSize) {
		this.leftSize = leftSize;
	}
	public int getRightSize() {
		return rightSize;
	}
	public void setRightSize(int rightSize) {
		this.rightSize = rightSize;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public void updateHeight() {
		this.height = 1 + Math.max(height(left), height(right));
	}

	private int height(Node node) {
		if(node == null) {
			return 0;
		} 
		
		return node.getHeight();
		
	}

	@Override
	public String toString() {
        return "Node [value=" + value + ", leftSize=" + leftSize + ", rightSize=" + rightSize + "]";
    }
	

}
