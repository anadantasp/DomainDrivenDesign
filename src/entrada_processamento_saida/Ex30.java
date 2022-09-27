package entrada_processamento_saida;

/*
 * Exerc�cio 30 - Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o 
 * pre�o normal de etiqueta e a escolha da condi��o de pagamento. Utilize os c�digos da tabela a seguir
 * para ler qual a condi��o de pagamento escolhida e efetuar o c�lculo adequado e exibir o valor a ser 
 * pago no final.
 * 
 * C�digo Condi��o de pagamento
 *1 - � vista em dinheiro ou cheque, recebe 10% de desconto
 *2 - � vista no cart�o de cr�dito, recebe 15% de desconto
 *3 - Em duas vezes, pre�o normal de etiqueta sem juros
 *4 - Em quatro vezes, pre�o normal de etiqueta mais juros de 10%
 */

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		float a;
		int o;

		System.out.printf("Digite o pre�o do produto:");
		a = ler.nextFloat();

		System.out.println(
				"C�digo Condi��o de pagamento \n1 	� vista em dinheiro ou cheque, recebe 10% de desconto \n2 	� vista no cart�o de cr�dito, recebe 15% de desconto\r\n"
						+ "3 	Em duas vezes, pre�o normal de etiqueta sem juros\r\n"
						+ "4 	Em quatro vezes, pre�o normal de etiqueta mais juros de 10%\r\n" + "");
		System.out.printf("Digite o n�mero da op��o desejada:");
		o = ler.nextInt();

		if (o == 1) {
			System.out.printf("O valor final �: %.2f", a * 0.90);
		}

		else if (o == 2) {
			System.out.printf("O valor final �: %.2f", a * 0.85);
		} else if (o == 3) {
			System.out.printf("O valor final �: %.2f", a);
		} else if (o == 4) {
			System.out.printf("O valor final �: %.2f", a * 1.10);
		} else {
			System.out.print("Op��o inv�lida");
		}

	}

}
