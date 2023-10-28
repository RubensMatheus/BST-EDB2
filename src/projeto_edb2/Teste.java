package projeto_edb2;

public class Teste {

	public Teste() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		BST bst = new BST();
		bst.insert(5);
		bst.insert(3);
		bst.insert(8);
		bst.insert(6);
		//bst.insert(9);
		
		//System.out.println("Buscar 20: " + bst.search(20));
        //System.out.println("Buscar 90: " + bst.search(90));
        //System.out.println("Buscar 10: " + bst.search(10));
        //System.out.println("Buscar 80: " + bst.search(80));
        
        bst.printTree(1);
        bst.printTree(2);

	}

}
