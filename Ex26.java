package entrada_processamento_saida;

/*
 * Exerc�cio 26 - Encontrar o dobro de um n�mero caso ele seja positivo e o seu triplo caso seja negativo, 
 * imprimindo o resultado.
 */

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int numero, dobro, triplo;
		
		System.out.println("Entre com um n�mero: ");
		numero = scn.nextInt();
		
		if(numero > 0) {
			dobro = numero * 2;
			System.out.println("DOBRO: " + dobro);
		} else {
			triplo = numero * 3;
			System.out.println("TRIPLO: " + triplo);
		}

	}

}
