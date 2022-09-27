package entrada_processamento_saida;

/*
 * Exercício 35 - Entrar via teclado com um valor qualquer. Travar a digitação, no sentido de aceitar 
 * somente valores positivos. Após a digitação, exibir a tabuada do valor solicitado, no intervalo de 
 * um a dez
 */

import java.util.Scanner;

public class Ex35For {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int res;
		
		System.out.printf("Deseja a tabuada de qual número? ");
		int num = scn.nextInt();
		
		while(num < 0) {
			System.out.println("O número não pode ser negativo!");
			System.out.println("Digite outro número: ");
			num = scn.nextInt();
		}
		
		for(int i = 1; i <= 10; i++) {
			res = num * i;
			System.out.println(num + " X " + i + " = " + res );
		}

	}

}
