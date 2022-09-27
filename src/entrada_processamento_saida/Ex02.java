package entrada_processamento_saida;

import java.util.Scanner;

//Exercício 2 - Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int lado, area;
		
		System.out.printf("------ Calculando a área de um quadrado ------\n");
		System.out.printf("Informe o valor do lado do quadrado: ");
		lado = scn.nextInt();
		
		area = lado * lado;
		
		System.out.printf("A área do quadrado é: %d", area);
		
		
		

	}

}
