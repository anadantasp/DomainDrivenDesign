package entrada_processamento_saida;

/*
 * Entrar com dois valores quaisquer. Exibir o maior deles, se existir, 
 * caso contrário, enviar mensagem avisando que os números são idênticos.
 */

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int num1, num2;

		System.out.printf("Informe o primeiro valor: ");
		num1 = scn.nextInt();

		System.out.printf("Informe o segundo valor: ");
		num2 = scn.nextInt();

		if(num1 == num2) {
			System.out.printf("Os valores digitados são iguais");
		} else if (num1 > num2) {
			System.out.printf("Maior valor digitado: %d", num1);
		}else {
			System.out.printf("Maior valor digitado: %d", num2);
		}
	}

}
