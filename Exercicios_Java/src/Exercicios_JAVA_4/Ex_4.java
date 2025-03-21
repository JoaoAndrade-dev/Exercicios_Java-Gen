package Exercicios_JAVA_4;

import java.util.Scanner;

public class Ex_4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float n1, n2, n3, n4, dif;
		
		System.out.println("\nEntre com o valor das variaveis: ");
	        n1 = ler.nextFloat();
	        n2 = ler.nextFloat();
	        n3 = ler.nextFloat();
	        n4 = ler.nextFloat();
	 
	        dif = (n1 * n2) - (n3 * n4);
	       
	    System.out.printf("\nO valor da média é: %.1f", dif);	      	    

	}

}
