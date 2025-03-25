package lista_02;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

public class ex_01 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		HashSet<Integer> setNum = new HashSet<Integer>();

		System.out.println("Digite 10 números inteiros sem repeti-los : ");

		for(int i = 0; i <10 ; i++) {
					
			setNum.add(ler.nextInt());
			
		}
				

		Iterator<Integer> iSetNum = setNum.iterator();

		while (iSetNum.hasNext()) {

			System.out.println(iSetNum.next());

		}

	}

}
