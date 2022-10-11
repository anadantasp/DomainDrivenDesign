package entrada_processamento_saida;

import java.util.Scanner;

public class Ex50DoWhile {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		int inicial, numFinal;
		
		System.out.printf("Digite um número inicial: ");
		inicial = scn.nextInt();
		System.out.printf("Digite um número final: ");
		numFinal = scn.nextInt();
		
		do {
			if(inicial % 2 == 0 && inicial > 10) {
				System.out.print(inicial + ", ");
			}
			inicial++;
		}while(inicial <= numFinal);
	}

}
