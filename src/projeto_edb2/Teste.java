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
		bst.insert(6);
	
	
		
		System.out.println("Buscar 5: " + bst.search(5));
        System.out.println("Buscar 3: " + bst.search(3));
        System.out.println("Buscar 8: " + bst.search(8));
        System.out.println("Buscar 6: " + bst.search(6));
        
       bst.printTree(1);
        //bst.printTree(2);
        
        System.out.println("Média a partir do 5 "+bst.average(5));

	}

}
