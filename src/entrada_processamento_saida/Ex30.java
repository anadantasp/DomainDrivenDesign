package entrada_processamento_saida;

/*
 * Exercício 30 - Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o 
 * preço normal de etiqueta e a escolha da condição de pagamento. Utilize os códigos da tabela a seguir
 * para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado e exibir o valor a ser 
 * pago no final.
 * 
 * Código Condição de pagamento
 *1 - À vista em dinheiro ou cheque, recebe 10% de desconto
 *2 - À vista no cartão de crédito, recebe 15% de desconto
 *3 - Em duas vezes, preço normal de etiqueta sem juros
 *4 - Em quatro vezes, preço normal de etiqueta mais juros de 10%
 */

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		float a;
		int o;

		System.out.printf("Digite o preço do produto:");
		a = ler.nextFloat();

		System.out.println(
				"Código Condição de pagamento \n1 	À vista em dinheiro ou cheque, recebe 10% de desconto \n2 	À vista no cartão de crédito, recebe 15% de desconto\r\n"
						+ "3 	Em duas vezes, preço normal de etiqueta sem juros\r\n"
						+ "4 	Em quatro vezes, preço normal de etiqueta mais juros de 10%\r\n" + "");
		System.out.printf("Digite o número da opção desejada:");
		o = ler.nextInt();

		if (o == 1) {
			System.out.printf("O valor final é: %.2f", a * 0.90);
		}

		else if (o == 2) {
			System.out.printf("O valor final é: %.2f", a * 0.85);
		} else if (o == 3) {
			System.out.printf("O valor final é: %.2f", a);
		} else if (o == 4) {
			System.out.printf("O valor final é: %.2f", a * 1.10);
		} else {
			System.out.print("Opção inválida");
		}

	}

}
