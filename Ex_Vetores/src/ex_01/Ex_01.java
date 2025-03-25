package ex_01;


import java.util.Arrays;
import java.util.Scanner;


public class Ex_01 {
	
	 public static void main(String[] args) {
		 
		 int vetor[] = {2,5,1,3,4,9,7,8,10,6};
		 
		 Scanner sc = new Scanner(System.in);
		
		 System.out.println("Digite o número a ser buscado no vetor: ");
		 
		 int num = sc.nextInt();
		 int armazena = -1;
		 
		 for (int i = 0; i < vetor.length; i++) {

			 if(vetor[i] == num) {
				 
				 armazena = i ;
			 }				
				 
		}
		 if(armazena != -1) {
		 System.out.println("O número " + num + " está localizado na posição: " + armazena);
		 }
		 
		 else {
			 System.out.println("Número não encontrado");
		 }
	}
}
