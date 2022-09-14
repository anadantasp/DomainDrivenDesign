package entrada_processamento_saida;

import java.util.Scanner;

public class Ex48For {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int num;
		
		System.out.printf("Digite um número: ");
		num = scn.nextInt();
		
		for(int i = 1; i <= 20; i++) {
			num = num + 1;
			System.out.print(num + ", ");
		}
		
		

	}

}
