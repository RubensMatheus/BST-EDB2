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
        root = insertRecursive(root, value, 1);
    }

    private Node insertRecursive(Node node, int value, int currentHeight) {
        if (node == null) {
            height = Math.max(height, currentHeight);
            return new Node(value);
        }

        if (value < node.getValue()) {
            node.setLeft(insertRecursive(node.getLeft(), value, currentHeight + 1));
            node.setLeftSize(node.getLeft().getLeftSize() + node.getLeft().getRightSize() + 1);
            
        } else if (value > node.getValue()){
            node.setRight(insertRecursive(node.getRight(), value, currentHeight + 1));
            node.setRightSize(node.getRight().getLeftSize() + node.getRight().getRightSize() + 1);
        }

        return node;
    }


    
    public void printTree(int s) {
    	if(s == 1) {
    		printFormat1(root, "", height*10);
    	} else {
    		printFormat2(root);
    	}
    }
    
    private void printFormat1(Node node, String space, int quantityDashes) {
    	
    	if(node == null) {
    		return ;
    	}
    	
    	String dashes = String.valueOf('-').repeat(quantityDashes);
    	
    	System.out.println(space + node.getValue() + dashes);
    	
    	printFormat1(node.getLeft(), space + "\t", quantityDashes - 8);
    	printFormat1(node.getRight(), space + "\t", quantityDashes - 8);
    }
    
    private void printFormat2(Node node) {
    	if(node == null) {
    		return ;
    	}
    	
    	System.out.print("(" + node.getValue());
    	
    	if(node.getLeft() != null) {
    		System.out.print(" ");
    		printFormat2(node.getLeft());
    	} 
    	
    	if(node.getRight() != null) {
    		System.out.print(" ");
    		printFormat2(node.getRight());
    	}
    	
    	System.out.print(")");
    	
    }
    
    public double average(int x) {
    	Node node = search(x);
    	
    	if(node == null) {
    		return 0;
    	}
    	
    	int totalNode = node.getLeftSize() + node.getRightSize() + 1;
    	int totalSum = calculateSum(node);
    	
    	return (double) totalSum / totalNode;
    }
    
    private int calculateSum(Node node) {
    	if(node == null) {
    		return 0;
    	}
    	return node.getValue() + calculateSum(node.getLeft()) + calculateSum(node.getRight());
    }
    
  
    
    

}


