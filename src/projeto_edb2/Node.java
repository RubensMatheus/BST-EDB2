package projeto_edb2;

public class Node {

	private int value;
	private int leftSize;
	private int rightSize;
	private Node left;
	private Node right;
	
	 public Node(int value) {
		 this.value = value;
	 }
	
	public Node(int value, int leftSize, int rightSize, Node left, Node right) {
		super();
		this.value = value;
		this.leftSize = leftSize;
		this.rightSize = rightSize;
		this.left = left;
		this.right = right;
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
	
	@Override
	public String toString() {
        return "Node [value=" + value + ", leftSize=" + leftSize + ", rightSize=" + rightSize + "]";
    }
	

}
