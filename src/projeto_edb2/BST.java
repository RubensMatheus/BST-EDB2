package projeto_edb2;

public class BST {
	
	private Node root;

	public Node search(int value) {
        return searchRecursive(root, value);
    }

	// auxiliar para busca
    private Node searchRecursive(Node node, int value) {
        if (node == null || node.getValue() == value) {
            return node;
        }

        if (value < node.getValue()) {
        	return searchRecursive(node.getLeft(), value);
        } 
        
        return searchRecursive(node.getRight(), value);
       
    }
    
    public void insert(int value) {
    	Node newNode = new Node(value);
    	this.root = insertRecursive(root, newNode);
    	
    }
    
    private Node insertRecursive(Node node, Node newNode) {
    	if(node == null) {
    		return newNode;
    	}
    	
    	if(newNode.getValue() < node.getValue()) {
    		node.setLeft(insertRecursive(node.getLeft(), newNode));
    		node.setLeftSize(node.getLeftSize() + 1);
    	} else if(newNode.getValue() > node.getValue()) {
    		node.setRight(insertRecursive(node.getRight(), newNode));
    		node.setRightSize(node.getRightSize() + 1);
    	}
    	
    	return node;
    }

}


