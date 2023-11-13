package projeto_edb2;

public class BST {
	
	private Node root;
	
	public Node search(int value) {
		return searchRecursive(root, value);
	}

    private Node searchRecursive(Node node, int value) {
        if (node == null || node.getValue() == value) {
            return node;
        }

        if (value < node.getValue()) {
        	return searchRecursive(node.getLeft(), value);
        } 
        
        return searchRecursive(node.getRight(), value);
       
    }

    
    public boolean insert(int value) {
    	if(root == null) {
    		root = new Node(value);
    		return true;
    	} 
    	
    	return insertRecursive(root, value);
    	
    }

   private boolean insertRecursive(Node node, int value) {
	   
	   if (value < node.getValue()) {
		   
	        if (node.getLeft() == null) {
	            node.setLeft(new Node(value));
	        } else if (!insertRecursive(node.getLeft(), value)) {
	            return false;
	        }
	        
	        node.setLeftSize(node.getLeftSize() + 1);
	        
	    } else if (value > node.getValue()) {
	    	
	        if (node.getRight() == null) {
	            node.setRight(new Node(value));
	        } else if (!insertRecursive(node.getRight(), value)) {
	            return false;
	        }
	        
	        node.setRightSize(node.getRightSize() + 1);
	        
	    } else {
	        return false;
	    }
	   
	   	node.updateSubtreeSum();
	    node.updateHeight();
	    
	    return true;
    }


    
    public boolean remove(int value) {
        return removeRecursive(this.root,null, value);
    }
  

    private boolean removeRecursive(Node node, Node parent, int value) {
    	if(node == null) {
    		return false;
    	}

		if (value < node.getValue()) {
			
			if(removeRecursive(node.getLeft(), node, value)) {
				node.setLeftSize(node.getLeftSize() - 1);
			}
			
		} else if (value > node.getValue()) {
			if(removeRecursive(node.getRight(), node, value)) {
				node.setRightSize(node.getRightSize() - 1);
			}
		} else {
			// 1: Tem dois filhos
			if (node.getRight() != null && node.getLeft() != null) { 
				
				Node predecessor = findPredecessor(node.getLeft());
		    	node.setValue(predecessor.getValue());
		    	removeRecursive(node.getLeft(), node, predecessor.getValue());
				node.setLeftSize(node.getLeftSize() - 1);
				
		    } else { //2: Folha ou tem um filho		 
		    	Node childNode = (node.getLeft() != null) ? node.getLeft() : node.getRight();
			        
	    		if (parent == null) {
		            root = childNode;
		        } else if (parent.getLeft() == node) {
		            parent.setLeft(childNode);
		        } else if (parent.getRight() == node) {
		            parent.setRight(childNode);
		        }
		    	
		    }
			
	        return true;

		}
		
		node.updateSubtreeSum();
		node.updateHeight();
		
		return false;
		
    }


    private Node findPredecessor(Node node) {
        while (node.getRight() != null) {
            node = node.getRight();
        }
        return node;
    }
    
    public void printTree(int s) {
    	if(s == 1) {
    		printFormat1(root, "", root.getHeight()*10); 
    	} else {
    		printFormat2(root);
    		System.out.println();
    	}
    }
    
    private void printFormat1(Node node, String space, int quantityDashes) {
    	
    	if(node == null) {
    		return ;
    	}

    	int quantityDigits = Integer.toString(Math.abs(node.getValue())).length();
    	String dashes = String.valueOf('-').repeat(quantityDashes - quantityDigits);
    	
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
    
   /* public double average(int x) {
    	Node node = search(x);
    	
    	if(node == null) {
    		return 0;
    	}
    	
    	int totalNode = node.getLeftSize() + node.getRightSize() + 1;
    	double totalSum = calculateSum(node);
    	
    	return (double) totalSum/totalNode;
    }
    
    private int calculateSum(Node node) {
    	if(node == null) {
    		return 0;
    	}
    	
    	int totalLeft = calculateSum(node.getLeft());
    	int totalRight = calculateSum(node.getRight());
    	
    	return node.getValue() + totalLeft + totalRight;
    }*/
    
    
      public double average(int x) {
    	Node node = search(x);
    	
    	if(node == null) {
    		return 0;
    	}
    	int totalNode = node.getLeftSize() + node.getRightSize() + 1;
    	return (double) node.getSubtreeSum() / totalNode;
    }
     
    
  //---------------Rubens--------------------------------------
    
    public int nthElement(int n) {
        return nthElementRecursive(root, n);
    }

    private int nthElementRecursive(Node node, int n) {
        if (node == null) {
            return -1;
        }

        if (node.getLeftSize() >= n) {
            return nthElementRecursive(node.getLeft(), n);
        } else if (node.getLeftSize() + 1 == n) {
            return node.getValue();
        } else {
            return nthElementRecursive(node.getRight(), n - node.getLeftSize() - 1);
        }
    }
    
 
    public int position(int x) {
        return positionRecursive(root, x);
    }

    private int positionRecursive(Node node, int x) {
        if (node == null) {
            return -1; 
        }

        if(node.getValue() > x) {
        	int leftPosition = positionRecursive(node.getLeft(), x);
	        if (leftPosition != -1) {
	            return leftPosition;
	        }
        } else if (node.getValue() == x) {
            return subtreeSize(node.getLeft()) + 1;
        }else {
	        int rightPosition = positionRecursive(node.getRight(), x);
	        if (rightPosition != -1) {
	            return subtreeSize(node.getLeft()) + 1 + rightPosition;
	        }
        }

       return -1;
    }

    private int subtreeSize(Node node) {
        if (node == null) {
            return 0;
        }
        return node.getLeftSize() + 1 + node.getRightSize();
    }
    
    public int median() {
    	int numberOfElements = subtreeSize(root);
    	if(numberOfElements % 2 == 0) {
        	return nthElement((numberOfElements)/2);
    	}else {
    		return nthElement((numberOfElements+1)/2);
    	}
    }
    
    
    public boolean itsFull() {
    	if(root == null) {
    		return false;
    	}
    	double doubleResult = Math.pow(2, root.height);
    	if(doubleResult-1 == subtreeSize(root)) {
    		return true;
    	}else {
    		return false;
    	}
    }
    
    public boolean itsComplete() {
    	if(root == null) {
    		return false;
    	}
    	int numberOfUs = subtreeSize(root);
    	if(Math.pow(2, root.height-1) <= numberOfUs && numberOfUs <= Math.pow(2, root.height) -1) {
    		return true;
    	}else {
    		return false;
    	}
    	
    }
    
    public String pre_ordem() {
        StringBuilder result = new StringBuilder();
        preOrdemRecursive(root, result);
        return result.toString();
    }

    private void preOrdemRecursive(Node node, StringBuilder result) {
        if (node != null) {
            result.append(node.getValue()).append(" ");

            preOrdemRecursive(node.getLeft(), result);

            preOrdemRecursive(node.getRight(), result);
        }
    }

}


