package entrada_processamento_saida;

//Exerc�cio 34 - Exibir a tabuada do n�mero cinco no intervalo de um a dez

import java.util.Scanner;

public class Ex34For {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int num = 5;
		int t;
		
		for(int i = 1; i <= 10; i++) {
			t = num * i;
			System.out.println(num + " X " + i + " = " + t );
		}
		

	}

}
