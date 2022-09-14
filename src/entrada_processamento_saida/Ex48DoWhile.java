package entrada_processamento_saida;

import java.util.Scanner;

public class Ex48DoWhile {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int num, i = 1;
		
		System.out.printf("Digite um número: ");
		num = scn.nextInt();
		
		do {
			num = num + 1;
			System.out.print(num + ", ");
			i++;
		}while(i <= 20);

	}

}
