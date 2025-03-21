package lista_01;

import java.util.Scanner;

public class ex_02 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
	    float A;
	    
	    System.out.println("Digite os valor a ser analisado:");
	    A = ler.nextFloat();
	   
	    
	    if (A % 2 != 0 && A < 0 ) {
	    	
	    	System.out.println("O número " + A + " é impar e negativo!");
			
		}
	    else if(A % 2 != 0 && A > 0) {
	    	
	    	System.out.println("O número " + A + " é impar e positivo!");
	    }
	    
	    else if(A % 2 == 0 && A < 0){
	    	System.out.println("O número " + A + " é -5par e negativo!");
			
		}
	    else {
	    	System.out.println("O número " + A + " é par e positivo!");
		}
		
	}

}
