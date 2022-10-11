package entrada_processamento_saida;

import java.util.Scanner;

public class Ex48While {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int num, i = 1;
		
		System.out.printf("Digite um número: ");
		num = scn.nextInt();
		
		while(i <= 20) {
			num = num + 1;
			System.out.print(num + ", ");
			i++;
		}

	}

}
