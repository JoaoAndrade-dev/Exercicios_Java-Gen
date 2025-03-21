package lista_01;

import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
	    float A,B,C;
	    
	    System.out.println("Digite os valores de A,B e C respectivamente:");
	    A = ler.nextFloat();
	    B = ler.nextFloat();
	    C = ler.nextFloat();
	    
	    if (A + B < C) {
	    	
	    	System.out.println("A Soma de A + B é Menor do que C!");
			
		}
	    else if(A + B == C) {
	    	System.out.println("A Soma de A + B é igual a C!");
	    }
	    
	    else {
	    	System.out.println("\nA Soma de A + B é Maior do que C!");
			
		}
		
	}

}
