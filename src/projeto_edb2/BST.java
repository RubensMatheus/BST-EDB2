package projeto_edb2;

public class BST {
	
	private Node root;
	private int height;

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
    	this.root = insertRecursive(root, newNode, 1);
    	
    }
    
    private Node insertRecursive(Node node, Node newNode, int currentHeight) {
    	if(node == null) {
    		height = Math.max(height, currentHeight);
    		return newNode;
    	}
    	
    	if(newNode.getValue() < node.getValue()) {
    		node.setLeft(insertRecursive(node.getLeft(), newNode, currentHeight + 1));
    		node.setLeftSize(node.getLeftSize() + 1);
    	} else if(newNode.getValue() > node.getValue()) {
    		node.setRight(insertRecursive(node.getRight(), newNode, currentHeight + 1));
    		node.setRightSize(node.getRightSize() + 1);
    	}
    	
    	return node;
    }
    
    public void imprimeArvore(int s) {
    	if(s == 1) {
    		imprimeFormato1(root);
    	} else {
    		imprimeFormato2();
    	}
    }
    
    // incomopleto
    private void imprimeFormato1(Node node) {
    	
    	if(node == null) {
    		return ;
    	}
    	
    	
    	imprimeFormato1(node.getLeft());
    	imprimeFormato1(node.getRight());
    }
    
    private void imprimeFormato2() {
    	
    }

}


