package ex_pilha;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ex_pilha {

	 public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);
	        Stack<String> pilha = new Stack<String>();

	        int opcao = 4;
	        boolean valida = true;

	        while (valida) {
	            switch (opcao) {
	                case 1:
	                    System.out.println("Escreva o nome do livro");
	                    ler.nextLine(); 
	                    pilha.push(ler.nextLine());
	                    break;

	                case 2:
	                	Iterator<String> iPilha = pilha.iterator();
	            		
	            		while(iPilha.hasNext()){
	            		   System.out.println(iPilha.next());
	            		}
	            		
	            		break;

	                case 3:
	                    if (!pilha.isEmpty()) {
	                        System.out.println("Livro removido: " + pilha.pop());
	                    } else {
	                        System.out.println("A fila está vazia!");
	                    }
	                    break;

	                case 0:
	                    valida = false;
	                    continue; 

	                default:
	                    System.out.println("*************************************");
	                    System.out.println("\n 1 - Adicionar livro a pilha");
	                    System.out.println("\n 2 - Listar todos os livros");
	                    System.out.println("\n 3 - Retirar livro da pilha");
	                    System.out.println("\n 0 - Sair");
	                    System.out.println("\n*************************************");
	            }

	          
	            System.out.print("\nEscolha uma opção: ");
	            if (ler.hasNextInt()) {
	                opcao = ler.nextInt();
	            } else {
	                System.out.println("Opção inválida! Digite uma das opções.");
	                ler.next();
	                opcao = 4; 
	            }
	        }

	        System.out.println("Obrigado por utilizar nosso programa!");
	    }
	}