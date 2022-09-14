package entrada_processamento_saida;

/*
 * Exerc�cio 39 - Exibir os trinta primeiros valores da s�rie de Fibonacci. A s�rie: 1, 1, 2, 3, 5, 8, ...
 */

import java.util.Scanner;

public class Ex39For {

	public static void main(String[] args) {
		
		int a=0, b=1, f=a+b;
		
		
		for(int i = 1; i  <= 30; i++) {
			b = a;
			a = f;
			f = a + b;
			System.out.print(f + ", ");
		}
		
		

	}

}
