package ex_lista01;

import java.util.Scanner;

public class ex_01 {
	public static void main(String[] args) {

		// Declarando as variaveis globais

		int num1, num2;
		boolean continua = true;
		Scanner ler = new Scanner(System.in);

		// Laço while para ter controle das tentativas

		while (continua == true) {

			// Requistando os inputs do usuario

			System.out.println("Digite dois valores para determinarmos o intervalo: ");
			num1 = ler.nextInt();
			num2 = ler.nextInt();

			if (num1 < num2) {
				System.out.println("Os valores multiplos de 3 e 5:");

				for (int i = num1; i <= num2; i++) {

					if (i % 3 == 0 && i % 5 == 0) {

						System.out.println(i);

					}
					continua = false;
				}
			} else {
				System.out.println("Digite um intervalo valido \n(Primeiro  valor menor que segundo)");
				System.out.println("Deseja tentar novamente ? (S/N)");
				continua = ler.next().equalsIgnoreCase("s");
			}
		}
		ler.close();
	}
}