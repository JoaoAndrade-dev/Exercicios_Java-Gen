package lista_02;

import java.util.Scanner;

public class ex_01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int quantidade;
		int opcao;
			
		System.out.println("### ### #### ### ### ### ###  ### ###");
		System.out.println("--Digite o número para escolher o produto--");
		System.out.println("1 - Cachorro Quente - R$ 10,00");
		System.out.println("2 - X-Salada -------- R$ 15,00");
		System.out.println("3 - X-Bacon --------- R$ 18,00");
		System.out.println("4 - Bauru  ---------- R$ 12,00");
		System.out.println("5 - Refrigerante ---- R$ 8,00");
		System.out.println("6 - Suco de laranja - R$ 13,00");
		System.out.println("### ### #### ### ### ### ###  ### ###");
		opcao = ler.nextInt();
		
		System.out.println("Agora digite a quantidade:");
		quantidade = ler.nextInt();
		
		switch (opcao) {
		
		case 1: 
			
			System.out.println("O valor total foi de R$ " + quantidade * 10.00);
			
			break;
		case 2: 
			
			System.out.println("O valor total foi de R$ " + quantidade * 15.00);
			
			break;
			
		case 3: 
			
			System.out.println("O valor total foi de R$ " + quantidade * 18.00);
			
			break;
			
         case 4: 
			
			System.out.println("O valor total foi de R$ " + quantidade * 12.00);
			
			break;
			
         case 5: 
 			
 			System.out.println("O valor total foi de R$ " + quantidade * 8.00);
 			
 			break;
			
         case 6: 
 			
 			System.out.println("O valor total foi de  R$ " + quantidade * 13.00);
 			
 			break;
 			
			default: 
				
		    System.out.println("Selecione uma opção valida!");
				
		    break;
	}

	}
}
