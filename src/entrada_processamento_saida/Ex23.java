package entrada_processamento_saida;

//Faça um algoritmo que leia os valores A, B, C e imprima na tela se a soma de A + B é menor que C.

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int a, b, c, soma;
		
		System.out.println("Entre com o valor de A:");
		a = scn.nextInt();
		System.out.println("Entre com o valor de B:");
		b = scn.nextInt();
		System.out.println("Entre com o valor de C:");
		c = scn.nextInt();
		
		soma = a + b;

		if((a + b) < c) {
			System.out.println(a + " + " + b + " < " + c);
			System.out.println(soma +  " < " + c);
		}else {
			System.out.println("Soma de A + B é MAIOR que C");
		}
	}

}
