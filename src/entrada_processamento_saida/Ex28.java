package entrada_processamento_saida;

/*
 * Exercício 28 - Escreva um algoritmo que leia três valores inteiros e diferentes e mostre-os em 
 * ordem crescente
 */

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Entre com um número: ");
		num1 = scn.nextInt();
		System.out.println("Entre com outro número: ");
		num2 = scn.nextInt();
		System.out.println("Entre com mais um número: ");
		num3 = scn.nextInt();
		
		if(num1 < num2 && num1 < num3) {
			if(num2 < num3) {
				System.out.println(num1 + " < " + num2 + " < " + num3);
			}else {
				System.out.println(num1 + " < " + num3 + " < " + num2);
			}
		} else if(num2 < num1 && num2 < num3) {
			if(num1 < num3) {
				System.out.println(num2 + " < " + num1 + " < " + num3);
			}else {
				System.out.println(num2 + " < " + num3 + " < " + num1);
			}
		} else {
			if(num2 < num1) {
				System.out.println(num3 + " < " + num2 + " < " + num1);
			}else {
				System.out.println(num3 + " < " + num1 + " < " + num2);
			}
		}
	}

}
