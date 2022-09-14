package entrada_processamento_saida;

import java.util.Scanner;

public class Ex49While {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int inicial, numFinal, soma=0, i;
		
		System.out.printf("Digite um número inicial: ");
		inicial = scn.nextInt();
		System.out.printf("Digite um número final: ");
		numFinal = scn.nextInt();
		
		i = inicial;
		
		while(i <= numFinal) {
			soma = soma + i;
			i++;
		}
		
		System.out.println("Soma: " + soma);

	}

}
