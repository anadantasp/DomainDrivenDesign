package entrada_processamento_saida;

/*
 * Exerc�cio 16 - Verificar se tr�s valores quaisquer (A, B, C) que ser�o digitados formam ou n�o um tri�ngulo ret�ngulo. 
 * Lembre-se que o quadrado da hipotenusa � igual a soma dos quadrados dos catetos
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
				System.out.printf("Este tri�ngulo � ret�ngulo");
			} else if ((b > a && b > c) && (b * b) == (a * a) + (c * c)) {
				System.out.printf("Este triangulo � ret�ngulo");
			} else if ((c > a && c > b) && (c * c) == (b * b) + (a * a)) {
				System.out.printf("Este triangulo � ret�ngulo");
			} else {
				System.out.printf("Este triangulo N�O � ret�ngulo");
			}
		} else {
			System.out.printf("Esses valores N�O formam um tri�ngulo");
		}
	}
}
