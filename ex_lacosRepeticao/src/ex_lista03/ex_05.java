package ex_lista03;

import java.util.Scanner;

public class ex_05 {

	public static void main(String[] args) {
		// Declarando as variáveis
		Scanner ler = new Scanner(System.in);

		int numInput, soma = 0;
		boolean novaTentativa = true;

		System.out.println("Pressione 'S' ou '0' para finalizar o programa.");
		System.out.println("Digite os números positivos a serem somados:");

		do {
			// Conferindo se a entrada foi um numero ou comando para sair

			if (ler.hasNextInt()) {
				numInput = ler.nextInt();
				ler.nextLine();
				
            //validando se o número é negativo ou se é 0;
				
				if (numInput > 0) {
					soma += numInput;
				} else if (numInput == 0) {
					novaTentativa = false;
				}

			} else {
				String continua = ler.next().toUpperCase();
				ler.nextLine();

				if (continua.equals("S")) {
					novaTentativa = false;
				} else {
					System.out.println("Entrada inválida! Digite um número positivo, '0' ou 'S' para sair.");
				}
			}

		} while (novaTentativa);
		
		//exibinbdo resultado para o usuario

		System.out.println("\nA soma dos números positivos é: " + soma);
		ler.close();
	}
}
