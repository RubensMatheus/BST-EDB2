package projeto_edb2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {	
		
		 if (args.length < 2) {
	            System.out.println("ERROR >> Arquivos não fornecidos");
	            return;
	        }

	    String filePath1 = args[0];
	    String filePath2 = args[1];

        List<String> initialTree = new ArrayList<>();
		
		try {
            File file = new File(filePath1);
            FileReader fileReader = new FileReader(file);
            BufferedReader buffer = new BufferedReader(fileReader);

            String line;
            while ((line = buffer.readLine()) != null) {
            	String[] words = line.split(" ");
            	for (String word : words) {
            		initialTree.add(word);
                }
            }

            buffer.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	

        List<String> commands = new ArrayList<>();

        try {
            File file = new File(filePath2);
            FileReader fileReader = new FileReader(file);
            BufferedReader buffer = new BufferedReader(fileReader);

            String line;
            while ((line = buffer.readLine()) != null) {
            	String[] words = line.split(" ");
            	for (String word : words) {
            		commands.add(word);
                }
            }

            buffer.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        BST tree = new BST();
        
        for( String node : initialTree) {
        	int intNode = Integer.parseInt(node);
        	tree.insert(intNode);
        }  
        
        
        String comand = "";
        int param, result;
        for (int i = 0; i < commands.size(); i++) {
        	comand = commands.get(i);
        	switch (comand) {
        		case "BUSCAR":
        			param = Integer.parseInt(commands.get(i+1));
        			Node node = tree.search(param);
        			i++;
        			if(node != null) {
        				System.out.println("Chave encontrada");
        			}else {
        				System.out.println("Chave não encontrada");        
        			}
        			break;
   
        		case "INSIRA":
        			param = Integer.parseInt(commands.get(i+1));
        			i++;
        			if(tree.insert(param)) {
        				System.out.println(param + " adicionado");
        			}else {
        				System.out.println(param + " já está na árvore, não pode ser inserido");        
        			}
        			break;
        		
        		case "REMOVA":
        			param = Integer.parseInt(commands.get(i+1));
        			i++;
        			if(tree.remove(param)) {
        				System.out.println(param + " removido");
        			}else {
        				System.out.println(param + " não está na árvore, não pode ser removido");        
        			}
        			break;
        			
        		case "ENESIMO":
        			param = Integer.parseInt(commands.get(i+1));
        			i++;
        			result = tree.nthElement(param);
        			if(result >= 1) {
        				System.out.println(result);
        			}else {
        				System.out.println("Não sxiste elemento para essa posição");        
        			}
        			break;	
        		
        		case "POSICAO":
        			param = Integer.parseInt(commands.get(i+1));
        			i++;
        			result = tree.position(param);
        			if(result >= 1) {
        				System.out.println(result);
        			}else {
        				System.out.println("Esse elemento não está presente na árvore");        
        			}
        			break;
        			
        		case "MEDIANA":
    				System.out.println(tree.median());
        			break;
        			
        		case "MEDIA":
        			param = Integer.parseInt(commands.get(i+1));
        			i++;
        			System.out.println(tree.average(param));
        			break;
        			
        		case "CHEIA":
        			if(tree.itsFull()) {
        				System.out.println("A árvore é cheia");
        			}else {
        				System.out.println("A árvore não é cheia");        
        			}
        			break;
        			
        		case "COMPLETA":
        			if(tree.itsComplete()) {
        				System.out.println("A árvore é completa");
        			}else {
        				System.out.println("A árvore não é completa");        
        			}
        			break;
        			
        		case "PREORDEM":
        			System.out.println(tree.pre_ordem());
        			break;
        			
        		case "IMPRIMA":
        			param = Integer.parseInt(commands.get(i+1));
        			i++;
        			tree.printTree(param);
        			break;
        			
        		default:
        			System.out.println("Dia inválido");
        	}
        }

	}

}
