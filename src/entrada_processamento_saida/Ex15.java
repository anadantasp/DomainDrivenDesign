package entrada_processamento_saida;

/*
 * Exerc�cio 15 - A partir de tr�s valores que ser�o digitados, verificar se formam ou n�o um tri�ngulo. 
 * Em caso positivo, exibir sua classifica��o: �Is�sceles, escaleno ou eq�il�tero�. 
 * Um tri�ngulo escaleno possui todos os lados diferentes, o is�sceles, dois lados iguais e o eq�il�tero, todos os lados iguais. 
 * Para existir tri�ngulo � necess�rio que a soma de dois lados quaisquer seja maior que o outro, isto, para os tr�s lados.
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
				System.out.printf("Esses valores formam um tri�ngulo EQUIL�TERO\n");
			} else if(a != b && b != c && c != a) {
				System.out.printf("Esses valores formam um tri�ngulo ESCALENO\n");
			}else {
				System.out.printf("Esses valores formam um tri�ngulo IS�SCELES");
			}
		} else {
			System.out.printf("Esses valores N�O formam um tri�ngulo");
		}
		
	}

}
