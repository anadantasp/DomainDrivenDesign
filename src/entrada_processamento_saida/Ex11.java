package entrada_processamento_saida;

/*
 * Exerc�cio 11 - Calcular e exibir a �rea de um ret�ngulo, 
 * a partir dos valores da base e altura que ser�o digitados. 
 * Se a �rea for maior que 100, exibir a mensagem �Terreno grande�.
 */

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		float largura, altura, area;
		
		System.out.printf("Informe a largura(base): ");
		largura = scn.nextFloat();

		System.out.printf("Informe a altura: ");
		altura = scn.nextFloat();
		
		area = largura * altura;
		
		if(area > 100) {
			System.out.printf("Area: %.2f\n", area);
			System.out.printf("Terreno grande");
		}

	}

}
