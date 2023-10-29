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
    
    /*public void insert(int value) {
    	if(root == null) {
    		root = new Node(value);
    		height = 1;
    	} else {
    		insertRecursive(root, value, 1);
    	}
    }*/

    /*private boolean insertRecursive(Node node, int value, int nodeHeight) {
    	boolean inserted = false;

        if (value < node.getValue()) {
        	if(node.getLeft() == null) {
        		node.setLeft(new Node(value));
        		height = Math.max(height, nodeHeight + 1);
                inserted = true;
        	} else {
        		inserted = insertRecursive(node.getLeft(), value, nodeHeight+1);
        	}
        	
        	if(inserted) {
        		node.setLeftSize(node.getLeftSize()+ 1);
        		node.setSumValue(value + node.getSumValue());
        	}
            
        } else if (value > node.getValue()){
        	if(node.getRight() == null) {
        		node.setRight(new Node(value));
        		height = Math.max(height, nodeHeight + 1);
                inserted = true;
        	}else {
        		inserted = insertRecursive(node.getRight(), value, nodeHeight+1);
        	}
        	
        	if(inserted) {
        		node.setRightSize(node.getRightSize() + 1);
        		node.setSumValue(value + node.getSumValue());
        	}
        }

        return inserted;
    }*/

    public void remove(int value) {
    	removeRecursive(root, value);
    }
    
    private void removeRecursive(Node node, int value) {
    	if(node.getValue() == value) {
    		
    	}
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


