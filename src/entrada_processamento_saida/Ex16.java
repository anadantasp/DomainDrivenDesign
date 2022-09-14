package entrada_processamento_saida;

/*
 * Exercício 16 - Verificar se três valores quaisquer (A, B, C) que serão digitados formam ou não um triângulo retângulo. 
 * Lembre-se que o quadrado da hipotenusa é igual a soma dos quadrados dos catetos
 */

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int a, b, c;

		System.out.printf("Entre com o primeiro valor: ");
		a = scn.nextInt();
		System.out.printf("Entre com o segundo valor: ");
		b = scn.nextInt();
		System.out.printf("Entre com o terceiro valor: ");
		c = scn.nextInt();

		if (((a + b) > c) && ((b + c) > a) && ((c + a) > b)) {
			if ((a > b && a > c) && (a * a) == (b * b) + (c * c)) {
				System.out.printf("Este triângulo é retângulo");
			} else if ((b > a && b > c) && (b * b) == (a * a) + (c * c)) {
				System.out.printf("Este triangulo é retângulo");
			} else if ((c > a && c > b) && (c * c) == (b * b) + (a * a)) {
				System.out.printf("Este triangulo é retângulo");
			} else {
				System.out.printf("Este triangulo NÃO é retângulo");
			}
		} else {
			System.out.printf("Esses valores NÃO formam um triângulo");
		}
	}
}
