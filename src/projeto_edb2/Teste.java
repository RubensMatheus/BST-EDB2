package projeto_edb2;

public class Teste {

	public Teste() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		BST bst = new BST();
		bst.insert(80);
		bst.insert(20);
		bst.insert(10);
		
		System.out.println("Buscar 20: " + bst.search(20));
        System.out.println("Buscar 90: " + bst.search(90));
        System.out.println("Buscar 10: " + bst.search(10));
        System.out.println("Buscar 80: " + bst.search(80));
        
        bst.imprimeArvore(1);

	}

}
