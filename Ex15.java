package entrada_processamento_saida;

/*
 * Exercício 15 - A partir de três valores que serão digitados, verificar se formam ou não um triângulo. 
 * Em caso positivo, exibir sua classificação: “Isósceles, escaleno ou eqüilátero”. 
 * Um triângulo escaleno possui todos os lados diferentes, o isósceles, dois lados iguais e o eqüilátero, todos os lados iguais. 
 * Para existir triângulo é necessário que a soma de dois lados quaisquer seja maior que o outro, isto, para os três lados.
 */

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.printf("Entre com o primeiro valor: ");
		a = scn.nextInt();
		System.out.printf("Entre com o segundo valor: ");
		b = scn.nextInt();
		System.out.printf("Entre com o terceiro valor: ");
		c = scn.nextInt();
		
		if(((a + b) > c) && ((b + c) > a) && ((c + a) > b)) {
			if(a == b && b == c) {
				System.out.printf("Esses valores formam um triângulo EQUILÁTERO\n");
			} else if(a != b && b != c && c != a) {
				System.out.printf("Esses valores formam um triângulo ESCALENO\n");
			}else {
				System.out.printf("Esses valores formam um triângulo ISÓSCELES");
			}
		} else {
			System.out.printf("Esses valores NÃO formam um triângulo");
		}
		
	}

}
