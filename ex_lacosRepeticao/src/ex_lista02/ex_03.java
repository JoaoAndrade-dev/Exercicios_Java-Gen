package ex_lista02;

import java.util.Scanner;


public class ex_03 {

	public static void main(String[] args) {
		// Declarando as variáveis
		int idade = 0, menores = 0, maiores = 0;
		boolean novaTentativa = true;
		Scanner ler = new Scanner(System.in);

		System.out.print("Pressione 'S' para sair e obter os resultados. ");
		System.out.print("\nEntre com as idades:");
		
		// Laço while para entrada de dados
		while (novaTentativa) {
			
        //Conferindo se a entrada foi uma idade ou comando para sair
			
			if (ler.hasNextInt()) {
				idade = ler.nextInt();
				
		//Segunda opção para finalizar o programa com input de número negativo
				
				if (idade < 0){
					
					novaTentativa = false;			
				}

				if (idade > 50 && idade > 0) {
					maiores++;
					
				} else if (idade < 21 && idade > 0) {
					menores++;
				}
			} 
				
			else {

				String continua = ler.next().toUpperCase();

				if (continua.equals("S")) {
					novaTentativa = false;
				}

				else {
					novaTentativa = true;
					System.out.print("Digite um caracter válido! (Idade ou 'S' (Para sair)");
				}
			}
		}
		//exibinbdo resultado para o usuario
		System.out.println("\nTotal de pessoas menores de 21 anos: " + menores);
		System.out.println("Total de pessoas maiores de 50 anos: " + maiores);
		ler.close();
	}
}
