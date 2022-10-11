package entrada_processamento_saida;

import java.util.Scanner;

public class Ex50For {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		int inicial, numFinal;
		
		System.out.printf("Digite um número inicial: ");
		inicial = scn.nextInt();
		System.out.printf("Digite um número final: ");
		numFinal = scn.nextInt();
		
		for(int i = inicial; i <= numFinal; i++) {
			if(i % 2 == 0 && i > 10) {
				System.out.print(i + ", ");
			}
		}

	}

}
