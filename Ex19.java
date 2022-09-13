package entrada_processamento_saida;

/*
 * Exerc�cio 19 - Uma escola com cursos em regime semestral, realiza duas avalia��es durante 
 * o semestre e calcula a m�dia do aluno, da seguinte maneira:
 * 
 * MEDIA = (P1 + 2.P2) / 3
 * 
 * Fazer um programa para entrar via teclado com os valores das notas (P1 e P2) e calcular a m�dia. 
 * Exibir a situa��o final do aluno (�Aprovado ou Reprovado�), sabendo que a m�dia de aprova��o � 
 * igual a cinco.
 */

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		float p1, p2, media;
		
		System.out.printf("Entre com a primeira nota: ");
		p1 = scn.nextFloat();
		System.out.printf("Entre com a segunda nota: ");
		p2 = scn.nextFloat();
		
		media = (p1 + 2 * p2) / 3;
		
		if(media >= 5) {
			System.out.printf("APROVADO\n");
			System.out.printf("M�dia: %.2f", media);
		} else {
			System.out.printf("REPROVADO\n");
			System.out.printf("M�dia: %.2f", media);
		}
		
	}

}
