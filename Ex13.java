package entrada_processamento_saida;

//Exerc�cio 13 - Entrar via teclado com tr�s valores distintos. Exibir o maior deles

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.printf("Informe um n�mero: ");
		a = scn.nextInt();
		System.out.printf("Informe outro n�mero: ");
		b = scn.nextInt();
		System.out.printf("Informe mais um n�mero: ");
		c = scn.nextInt();
		
		if(a > b && a > c){
			System.out.printf("O maior n�mero digitado: %d", a);
		} else if (b > a && b > c ) {
			System.out.printf("O maior n�mero digitado: %d", b);
		} else {
			System.out.printf("O maior n�mero digitado: %d", c);
		}
		

	}

}
