package entrada_processamento_saida;

/*
 * Exerc�cio 27 - Fa�a um algoritmo que leia uma vari�vel e some 5 caso seja par ou some 8 caso seja 
 * �mpar, imprimir o resultado desta opera��o
 */

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int numero, total;

		System.out.println("Entre com um n�mero: ");
		numero = scn.nextInt();

		if (numero % 2 == 0) {
			total = numero + 5;
			System.out.println(numero + " + 5 = " + total);
		} else {
			total = numero + 8;
			System.out.println(numero + " + 8 = " + total);
		}

	}

}
