package entrada_processamento_saida;

/*
 * Exerc�cio 25 - Fa�a um algoritmo para receber um n�mero qualquer e informar na tela se � par ou 
 * �mpar. Utilize o operador %
 */

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Entre com um n�mero: ");
		numero = scn.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("�MPAR");
		}

	}

}
