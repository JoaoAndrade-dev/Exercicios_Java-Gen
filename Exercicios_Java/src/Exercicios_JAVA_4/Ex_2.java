package Exercicios_JAVA_4;

import java.util.Scanner;

public class Ex_2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, media;
		
		System.out.println("\nEntre com o valor das notas ");
	        nota1 = ler.nextFloat();
	        nota2 = ler.nextFloat();
	        nota3 = ler.nextFloat();
	        nota4 = ler.nextFloat();
	 
	        media = (nota1 +  nota2 + nota3 + nota4)/4;
	       
	    System.out.printf("\nO valor da média é: %.1f", media);	      	    

	}

}
