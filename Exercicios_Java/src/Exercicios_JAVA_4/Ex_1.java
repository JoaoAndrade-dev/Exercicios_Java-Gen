package Exercicios_JAVA_4;

import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float salario, abono, novoSalario;
		
		System.out.println("\nEntre com o valor do sálario: ");
	        salario = ler.nextFloat();
	 
	    System.out.println("\nQual valor do abono: ");
	        abono = ler.nextFloat();
	      
	        novoSalario = salario + abono;
	        
	    System.out.printf("\nO novo salário é: %.2f",novoSalario);
	    

	}

}
