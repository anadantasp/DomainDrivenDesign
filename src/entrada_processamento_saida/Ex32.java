package entrada_processamento_saida;

/*
 * ExercÌcio 32 - Entrar com dois valores via teclado, onde o segundo dever· ser maior que o primeiro. 
 * Caso contr·rio solicitar novamente apenas o segundo valor.
 */

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.printf("Digite um n√∫mero: ");
		num1 = scn.nextInt();
		
		System.out.printf("Digite um n√∫mero: ");
		num2 = scn.nextInt();
		
		while(num2 < num1) {
			System.out.println("O segundo valor n√£o pode ser menor do que o primeiro");
			System.out.printf("Digite outro n√∫mero: ");
			num2 = scn.nextInt();
		}
		
		System.out.println("Primeiro valor digitado: " + num1);
		System.out.println("Segundo valor diitado: " + num2);
		
		

	}

}
