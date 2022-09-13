package entrada_processamento_saida;

/*
 * Exercício 25 - Faça um algoritmo para receber um número qualquer e informar na tela se é par ou 
 * ímpar. Utilize o operador %
 */

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Entre com um número: ");
		numero = scn.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("ÍMPAR");
		}

	}

}
