package entrada_processamento_saida;

import java.util.Scanner;

//Exerc�cio 2 - Calcular e exibir a �rea de um quadrado, a partir do valor de sua aresta que ser� digitado

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int lado, area;
		
		System.out.printf("------ Calculando a �rea de um quadrado ------\n");
		System.out.printf("Informe o valor do lado do quadrado: ");
		lado = scn.nextInt();
		
		area = lado * lado;
		
		System.out.printf("A �rea do quadrado �: %d", area);
		
		
		

	}

}
