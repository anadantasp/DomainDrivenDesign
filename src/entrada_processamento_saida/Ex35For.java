package entrada_processamento_saida;

/*
 * Exerc�cio 35 - Entrar via teclado com um valor qualquer. Travar a digita��o, no sentido de aceitar 
 * somente valores positivos. Ap�s a digita��o, exibir a tabuada do valor solicitado, no intervalo de 
 * um a dez
 */

import java.util.Scanner;

public class Ex35For {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int res;
		
		System.out.printf("Deseja a tabuada de qual n�mero? ");
		int num = scn.nextInt();
		
		while(num < 0) {
			System.out.println("O n�mero n�o pode ser negativo!");
			System.out.println("Digite outro n�mero: ");
			num = scn.nextInt();
		}
		
		for(int i = 1; i <= 10; i++) {
			res = num * i;
			System.out.println(num + " X " + i + " = " + res );
		}

	}

}
