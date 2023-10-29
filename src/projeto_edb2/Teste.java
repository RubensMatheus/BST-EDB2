package projeto_edb2;

public class Teste {

	public Teste() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		BST bst = new BST();
		bst.insert(5);
		bst.insert(3);
		//bst.insert(4);
		//bst.insert(8);
		//bst.insert(6);
		bst.insert(2);
		//bst.insert(9);
		//bst.insert(7);
		
		
	    bst.printTree(1);
	
	
		
		System.out.println("Buscar 5: " + bst.search(5));
        System.out.println("Buscar 3: " + bst.search(3));
        System.out.println("Buscar 8: " + bst.search(8));
        System.out.println("Buscar 6: " + bst.search(6));
        
        bst.remove(5);
       bst.remove(20);
		//bst.remove(10);
		// bst.remove(9);
        
        bst.printTree(1);
       	bst.printTree(2);
        
       	System.out.println("Buscar 5: " + bst.search(5));
        System.out.println("Buscar 3: " + bst.search(3));
        System.out.println("Buscar 8: " + bst.search(8));
        System.out.println("Buscar 6: " + bst.search(6));
        
        System.out.println("\nMédia a partir do 5 "+bst.average(5));
        
        System.out.println("bucando o primeiro elemento: " + bst.enesimoElemento(1));
        System.out.println("bucando o segundo elemento: " + bst.enesimoElemento(2));
        System.out.println("bucando o teceiro elemento: " + bst.enesimoElemento(3));
        System.out.println("bucando o quarto elemento: " + bst.enesimoElemento(4));
        System.out.println("bucando elemento inexistente: " + bst.enesimoElemento(5));

        System.out.println("posicao do 5: " + bst.posicao(5));
        System.out.println("posicao do 3: " + bst.posicao(3));
        System.out.println("posicao do 8: " + bst.posicao(8));
        System.out.println("posicao do 6: " + bst.posicao(6));
        System.out.println("posicao do 9: " + bst.posicao(9));
        System.out.println("posicao do 7: " + bst.posicao(7));
        System.out.println("posicao do 45: " + bst.posicao(45));
        System.out.println("posicao do 60: " + bst.posicao(60));
        System.out.println("posicao do 55: " + bst.posicao(55));
        
        System.out.println("A mediana é: " + bst.mediana());
        
        String testando = bst.pre_ordem();
        System.out.println(testando);
	}

}
