package ex_02;

import java.util.Arrays;
import java.util.Scanner;

public class ex_02 {

	public static void main(String[] args) {

		double soma = 0;
		double media;
		int vetor[] = new int[10];

		Scanner sc = new Scanner(System.in);
		
		//entrada de dados

		System.out.println("Digite 10 números a serem armazenados no vetor: ");

		for (int i = 0; i < vetor.length; i++) {

			vetor[i] = sc.nextInt();
		}
		
		//Funções para separar cada demanda

		System.out.println("Elementos nos indices impares: ");

		for (int i = 0; i < vetor.length; i++) {

			if (i % 2 != 0) {

				System.out.print("  " + vetor[i]);
			}

		}
		System.out.println("\nElementos pares: ");

		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] % 2 == 0) {

				System.out.print("  " + vetor[i]);
			}

		}	

		for (int i = 0; i < vetor.length; i++) {

         soma += vetor[i];

		}
		
		System.out.println("\nSoma : " + soma);
		System.out.println("\nMédia : " + soma/vetor.length);
					
	}
}
