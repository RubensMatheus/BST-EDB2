package projeto_edb2;

public class Teste {

	public Teste() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		BST bst = new BST();
		bst.insert(10);
		bst.insert(2);
		bst.insert(1);
		bst.insert(29);
		bst.insert(27);
		bst.insert(15);
		bst.insert(2);
		bst.insert(15);
		System.out.println(bst.insert(2));
		bst.insert(15);
		bst.insert(2);
		bst.insert(5);
		bst.insert(9);
		bst.insert(11);
		bst.insert(12);
		bst.insert(13);
		bst.insert(14);
		bst.insert(15);
		bst.insert(16);
		bst.insert(17);
		bst.insert(18);
		bst.insert(19);

		
	    bst.printTree(1);
	    bst.printTree(2);
	
	
	    System.out.println("\nMédia a partir do 20 "+bst.average(20));
		System.out.println("Buscar 20: " + bst.search(20));
        System.out.println("Buscar 10: " + bst.search(10));
        System.out.println("Buscar 2: " + bst.search(2));
        System.out.println("Buscar 1: " + bst.search(1));
        System.out.println("Buscar 15: " + bst.search(15));
        System.out.println("Buscar 29: " + bst.search(29));
        System.out.println("Buscar 27: " + bst.search(27));
        
       System.out.println(bst.remove(27));
       //System.out.println(bst.remove(15));
       //bst.remove(20);
       

       bst.printTree(1);
       
       
       
       System.out.println("\nMédia a partir do 15 "+bst.average(15));
   		System.out.println("Buscar 20: " + bst.search(20));
           System.out.println("Buscar 10: " + bst.search(10));
           System.out.println("Buscar 2: " + bst.search(2));
           System.out.println("Buscar 1: " + bst.search(1));
           System.out.println("Buscar 15: " + bst.search(15));
           System.out.println("Buscar 29: " + bst.search(29));
           System.out.println("Buscar 27: " + bst.search(27));
       
       
       bst.remove(3);
		//bst.remove(10);
		bst.remove(9);
       //bst.insert(3);
        
       // bst.printTree(1);
       	bst.printTree(2);

        
        
	}

}