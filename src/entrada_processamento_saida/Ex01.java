package entrada_processamento_saida;

import java.util.Scanner;

//Exercício 1 - Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int base, altura, area;
		
		System.out.printf("------ Calculando a área de um retângulo ------\n");
		System.out.printf("Informe o valor da base: ");
		base = scn.nextInt();
		System.out.printf("Informe o valor da altura: ");
		altura = scn.nextInt();
		
		
		area = base * altura;
		
		System.out.printf("Área: %d", area);

	}

}
