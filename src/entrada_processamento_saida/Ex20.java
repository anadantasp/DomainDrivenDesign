package entrada_processamento_saida;

/*
 * Exerc�cio 20 -Uma escola com cursos em regime semestral realiza duas avalia��es durante o 
 * semestre e calcula a m�dia do aluno, da seguinte maneira:
 * 
 * MEDIA = (P1 + 2.P2) / 3
 * 
 * Fazer um programa para entrar via teclado com o valor da primeira nota (P1) e o programa 
 * dever� calcular e exibir quanto o aluno precisa tirar na segunda nota minimamente (P2) 
 * para ser aprovado, sabendo que a m�dia de aprova��o � igual a cinco.
 */

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		float p1, p2, media = 5;
		
		System.out.printf("Entre com a primeira nota: ");
		p1 = scn.nextFloat();
		
		p2 = (3 * media - p1) / 2;
		
		System.out.printf("Nota m�nima na P2 para aprova��o: %.2f", p2);
		
		

	}

}
