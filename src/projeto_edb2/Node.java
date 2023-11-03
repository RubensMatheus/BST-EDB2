package projeto_edb2;

public class Node {

	private int value;
	private int leftSize;
	private int rightSize;
	private int subtreeSum;
	private Node left;
	private Node right;
	private int height;
	
	public Node(int value) {
		 this.value = value;
		 this.height = 1;
		 this.subtreeSum = value;
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
	
	public int getSubtreeSum() {
	    return subtreeSum;
	}

	public void setSubtreeSum(int subtreeSum) {
		this.subtreeSum = subtreeSum;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
        return "Node [value=" + value + ", leftSize=" + leftSize + ", rightSize=" 
        		+ rightSize + ", height=" + height +  ", sumValue=" + subtreeSum + "]";
    }
	

}
