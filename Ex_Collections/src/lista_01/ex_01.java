package lista_01;

import java.util.ArrayList;
import java.util.Scanner;

public class ex_01 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();

		System.out.println("Digite as  5 cores : ");

		for (int i = 0; i < 5; i++) {
			
			System.out.println("Digite a " + (i + 1) + " cor" );
			cores.add(ler.nextLine());

		}

		System.out.println("Lista de cores não ordenada : ");

		for (String cor : cores) {
			System.out.println(cor);
		}

		cores.sort(null);

		System.out.println("\nCores ordenadas : ");

		for (String cor : cores) {
			System.out.println(cor);
		}

		ler.close();
	}

}
