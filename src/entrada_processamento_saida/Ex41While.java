package entrada_processamento_saida;

/*
 * Exercício 41 - Calcular e exibir a soma dos “N” primeiros valores da seqüência abaixo. O valor “N” 
 * será digitado, deverá ser positivo, mas menor que cem. Caso o valor não satisfaça a restrição, 
 * enviar mensagem de erro e solicitar o valor novamente.A seqüência: 2, 5, 10, 17, 26, ....
 */

import java.util.Scanner;

public class Ex41While {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n;
		int i=1, a = 1, b = 1, soma = 0;
		
		
		System.out.printf("Sequência: 2, 5, 10, 17, 26, ....");
		System.out.printf("Quantos números da sequência acima você gostaria de somar? ");
		n = scn.nextInt();
		
		while(n < 0 || n >= 100) {
			System.out.printf("O número digitado deverá ser POSITIVO e MENOR que cem");
			System.out.printf("Entre com outro número: ");
			n = scn.nextInt();
		}
		
		while(i <= n) {
			a = a + b;
			soma = soma + a;
			b = b + 2;
			i++;
		}
		
		System.out.println("A soma dos primeiros " + n + " números da sequência é " + soma);

	}

}
