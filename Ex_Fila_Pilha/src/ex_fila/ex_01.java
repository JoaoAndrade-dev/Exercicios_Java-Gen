package ex_fila;

import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ex_01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Queue<String> fila = new LinkedList<>();

        int opcao = 4;
        boolean valida = true;

        while (valida) {
            switch (opcao) {
                case 1:
                    System.out.println("Escreva o nome do cliente:");
                    ler.nextLine(); 
                    fila.add(ler.nextLine());
                    break;

                case 2:
                    System.out.println("\nClientes na fila:");
                    Iterator<String> iFila = fila.iterator();
                    while (iFila.hasNext()) {
                        System.out.println(iFila.next());
                    }
                    break;

                case 3:
                    if (!fila.isEmpty()) {
                        System.out.println("Cliente removido: " + fila.poll());
                    } else {
                        System.out.println("A fila está vazia!");
                    }
                    break;

                case 0:
                    valida = false;
                    continue; 

                default:
                    System.out.println("*************************************");
                    System.out.println("\n 1 - Adicionar cliente à fila");
                    System.out.println("\n 2 - Listar todos os clientes");
                    System.out.println("\n 3 - Retirar cliente da fila");
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
