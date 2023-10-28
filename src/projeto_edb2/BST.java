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

}
