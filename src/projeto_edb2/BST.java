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
    	} else {
    		return insertRecursive(root, value);
    	}
    }

   private boolean insertRecursive(Node node, int value) {
    	boolean inserted = false;

        if (value < node.getValue()) {
        	if(node.getLeft() == null) {
        		node.setLeft(new Node(value));
                inserted = true;
        	} else {
        		inserted = insertRecursive(node.getLeft(), value);
        	}
        	
        	if(inserted) {
        		node.setLeftSize(node.getLeftSize()+ 1);
        	}
            
        } else if (value > node.getValue()){
        	if(node.getRight() == null) {
        		node.setRight(new Node(value));
                inserted = true;
        	}else {
        		inserted = insertRecursive(node.getRight(), value);
        	}
        	
        	if(inserted) {
        		node.setRightSize(node.getRightSize() + 1);
        	}
        }
        
        node.updateHeight();

        return inserted;
    }


    
    public boolean remove(int value) {
        return removeRecursive(this.root,null, value);
    }
  

    private boolean removeRecursive(Node node, Node parent, int value) {
    	if(node == null) {
    		return false;
    	}
    	
		boolean removed = false;

		if (value < node.getValue()) {
			removed = removeRecursive(node.getLeft(), node, value);
			
			if(removed) {
				node.setLeftSize(node.getLeftSize() - 1);
			}
		} else if (value > node.getValue()) {
			removed = removeRecursive(node.getRight(), node, value);
			
			if(removed) {
				node.setRightSize(node.getRightSize() - 1);
			}
		} else {
			// 1: Folha ou tem um filho
			if (node.getRight() == null || node.getLeft() == null) { 
		        Node childNode = (node.getLeft() != null) ? node.getLeft() : node.getRight();
		        
		        if (parent == null) {
		            root = childNode;
		        } else if (parent.getLeft() == node) {
		            parent.setLeft(childNode);
		        } else if (parent.getRight() == node) {
		            parent.setRight(childNode);
		        }
		    } else { //2: Tem dois filhos
		    	Node predecessor = findPredecessor(node.getLeft());
		    	node.setValue(predecessor.getValue());
		    	removeRecursive(node.getLeft(), node, predecessor.getValue());
				node.setLeftSize(node.getLeftSize() - 1);
		    	
		    }
			
	        return true;

		}
		
		node.updateHeight();
		return removed;
		
    }


    private Node findPredecessor(Node node) {
        while (node.getRight() != null) {
            node = node.getRight();
        }
        return node;
    }
    
    public void printTree(int s) {
    	
    	System.out.println("altura: "+root.getHeight());
    	if(s == 1) {
    		printFormat1(root, "", root.getHeight()*10); 
    	} else {
    		printFormat2(root);
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
    
    public double average(int x) {
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
    }
    
    /*
      public double average(int x) {
    	Node node = search(x);
    	
    	if(node == null) {
    		return 0;
    	}
    	int totalNode = node.getLeftSize() + node.getRightSize() + 1;
    	return (double) (node.getSumValue() + node.getValue()) / totalNode;
    }
     */
    
  //---------------Rubens--------------------------------------
    
    public int enesimoElemento(int n) {
        return enesimoElementoRecursivo(root, n);
    }

    private int enesimoElementoRecursivo(Node node, int n) {
        if (node == null) {
            return -1;
        }

        if (node.getLeftSize() >= n) {
            return enesimoElementoRecursivo(node.getLeft(), n);
        } else if (node.getLeftSize() + 1 == n) {
            return node.getValue();
        } else {
            return enesimoElementoRecursivo(node.getRight(), n - node.getLeftSize() - 1);
        }
    }
    
 
    public int posicao(int x) {
        return posicaoRecursiva(root, x);
    }

    private int posicaoRecursiva(Node node, int x) {
        if (node == null) {
            return -1; 
        }

        if(node.getValue() > x) {
        	int posicaoEsquerda = posicaoRecursiva(node.getLeft(), x);
	        if (posicaoEsquerda != -1) {
	            return posicaoEsquerda;
	        }
        } else if (node.getValue() == x) {
            return tamanhoSubarvore(node.getLeft()) + 1;
        }else {
	        int posicaoLadoDireito = posicaoRecursiva(node.getRight(), x);
	        if (posicaoLadoDireito != -1) {
	            return tamanhoSubarvore(node.getLeft()) + 1 + posicaoLadoDireito;
	        }
        }

       return -1;
    }

    private int tamanhoSubarvore(Node node) {
        if (node == null) {
            return 0;
        }
        return node.getLeftSize() + 1 + node.getRightSize();
    }
    
    public int mediana() {
    	int quantidadeElementos = root.getLeftSize() + root.getRightSize() + 1;
    	return enesimoElemento((quantidadeElementos+1)/2);
    }
    
    public String pre_ordem() {
        StringBuilder result = new StringBuilder();
        preOrdemRecursiva(root, result);
        return result.toString();
    }

    private void preOrdemRecursiva(Node node, StringBuilder result) {
        if (node != null) {
            result.append(node.getValue()).append(" ");

            preOrdemRecursiva(node.getLeft(), result);

            preOrdemRecursiva(node.getRight(), result);
        }
    }


}


