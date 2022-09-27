package entrada_processamento_saida;

//Exercício 34 - Exibir a tabuada do número cinco no intervalo de um a dez

import java.util.Scanner;

public class Ex34DoWhile {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int num = 5;
		int i = 1;
		int t;
		
		do {
			t = num * i;
			System.out.println(num + " X " + i + " = " + t );
			i++;
		}while(i <= 10);
		

	}

}
