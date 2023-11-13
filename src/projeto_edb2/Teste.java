<<<<<<< HEAD
//package projeto_edb2;
//
//public class Teste {
//
//	public Teste() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public static void main(String[] args) {
//		BST bst = new BST();
//		bst.insert(5); 
//		System.out.println("\nMédia a partir do 5 "+bst.average(5));
//		 bst.printTree(1);
//		bst.insert(3);
//		bst.insert(4);
//		bst.insert(8);
//		bst.insert(6);
//		bst.insert(6);
//		bst.insert(2);
//		bst.insert(9);
////		bst.insert(11);
////		bst.insert(12);
////		bst.insert(13);
//
//		
//	    bst.printTree(1);
//	
//	
//	    System.out.println("\nMédia a partir do 5 "+bst.average(5));
//		System.out.println("Buscar 5: " + bst.search(5));
//        System.out.println("Buscar 3: " + bst.search(3));
//        System.out.println("Buscar 4: " + bst.search(4));
//        System.out.println("Buscar 6: " + bst.search(6));
//        
//       //bst.remove(5);
//       //bst.remove(20);
//       //bst.remove(20);
//       //bst.remove(20);
//       
//       System.out.println("\nMédia a partir do 4 "+bst.average(4));
//       bst.printTree(1);
//       
//       
//       //bst.remove(3);
//		//bst.remove(10);
//		// bst.remove(9);
//       //bst.insert(3);
//        
//        bst.printTree(1);
//       	bst.printTree(2);
//        
//       	System.out.println("Buscar 9: " + bst.search(9));
//        System.out.println("Buscar 4: " + bst.search(4));
//        System.out.println("Buscar 8: " + bst.search(8));
//        System.out.println("Buscar 6: " + bst.search(6));
//        
//        
//        System.out.println("bucando o primeiro elemento: " + bst.nthElement(1));
//        System.out.println("bucando o segundo elemento: " + bst.nthElement(2));
//        System.out.println("bucando o teceiro elemento: " + bst.nthElement(3));
//        System.out.println("bucando o quarto elemento: " + bst.nthElement(4));
//        System.out.println("bucando elemento inexistente: " + bst.nthElement(5));
//
//        System.out.println("position do 5: " + bst.position(5));
//        System.out.println("position do 3: " + bst.position(3));
//        System.out.println("position do 8: " + bst.position(8));
//        System.out.println("position do 6: " + bst.position(6));
//        System.out.println("position do 9: " + bst.position(9));
//        System.out.println("position do 7: " + bst.position(7));
//        System.out.println("position do 45: " + bst.position(45));
//        System.out.println("position do 60: " + bst.position(60));
//        System.out.println("position do 55: " + bst.position(55));
//        
//        System.out.println("A mediana é: " + bst.median());
//        
//        String testando = bst.pre_ordem();
//        System.out.println(testando);
//        
//        if(bst.itsFull()) {
//        	System.out.println("a arvore é cheia");
//        }else {
//        	System.out.println("a arvore n é cheia");
//        }
//        
//        if(bst.itsComplete()) {
//        	System.out.println("a arvore é do tipo completa");
//        }else {
//        	System.out.println("a arvore n é do tipo completa");
//        }
//	}
//
//}
=======
package projeto_edb2;

public class Teste {

	public Teste() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		BST bst = new BST();
		System.out.println(bst.insert(20)); 
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
//		bst.insert(5);
//		bst.insert(9);
//		bst.insert(11);
//		bst.insert(12);
//		bst.insert(13);
//		bst.insert(14);
//		bst.insert(15);
//		bst.insert(16);
//		bst.insert(17);
//		bst.insert(18);
//		bst.insert(19);

		
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
        
       bst.remove(5);
       System.out.println(bst.remove(20));
       System.out.println(bst.remove(20));
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
>>>>>>> branch 'main' of https://github.com/wislaargolo/BST-EDB2.git
