package projeto_edb2;

public class BST {
	
	private Node root;

	public Node search(int value) {
        return searchRec(root, value);
    }

	// auxiliar para busca
    private Node searchRec(Node node, int value) {
        if (node == null || node.getValue() == value) {
            return node;
        }

        if (value < node.getValue()) {
        	return searchRec(node.getLeft(), value);
        } else {
        	return searchRec(node.getRight(), value);
        }
    }

}
