package entrada_processamento_saida;

import java.util.Scanner;

public class Ex49DoWhile {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int inicial, numFinal, soma=0, i;
		
		System.out.printf("Digite um número inicial: ");
		inicial = scn.nextInt();
		System.out.printf("Digite um número final: ");
		numFinal = scn.nextInt();
		
		i = inicial;
		
		do {
			soma = soma + i;
			i++;
		}while(i <= numFinal);
		
		System.out.println("Soma: " + soma);

	}

}
