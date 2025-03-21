package Exercicios_JAVA_4;

import java.util.Scanner;

public class Ex_3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float salBruto, adNoturno, horaExtra, desconto, salFinal;
		
		System.out.println("\nEntre com o valor do salário bruto: ");
	        salBruto = ler.nextFloat();

	        System.out.println("\nEntre com o valor do adicional noturno: ");
	        adNoturno = ler.nextFloat();
	        
	        System.out.println("\nEntre com o valor das horas extras: ");
	        horaExtra = ler.nextFloat();
	        
	        System.out.println("\nEntre com o valor dos descontos: ");
	        desconto = ler.nextFloat();
	 
	        salFinal = (salBruto +  adNoturno + (horaExtra * 5) - desconto);
	       
	    System.out.printf("\nO valor do seu salário liquido: %.2f", salFinal);	      	    

	}

}
