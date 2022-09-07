package entrada_processamento_saida;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int num;
		
		System.out.printf("Digite um número: ");
		num = scn.nextInt();
		
		while(num < 0) {
			System.out.println("O número não pode ser negativo");
			System.out.printf("Digite um número: ");
			num = scn.nextInt();
		}
		
		System.out.println("Número digitado válido!");
		System.out.println("Número: " + num);
		
		

	}

}
