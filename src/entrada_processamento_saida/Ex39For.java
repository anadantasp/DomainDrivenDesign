package entrada_processamento_saida;

/*
 * Exercício 39 - Exibir os trinta primeiros valores da série de Fibonacci. A série: 1, 1, 2, 3, 5, 8, ...
 */

import java.util.Scanner;

public class Ex39For {

	public static void main(String[] args) {
		
		int atual = 0, anterior = 0;
		
		int valores [] = new int [30];
		
		
		for(int i = 0; i  < 30; i++) {
			
			if(i == 0 || i == 1) {
				valores[i] = 1;
				System.out.print(valores[i] + ", ");
			} else {
				valores[i] = valores[i-1] + valores[i-2];
				System.out.print(valores[i] + ", ");
			}
			
		}
		
		

	}

}
