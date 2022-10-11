package entrada_processamento_saida;

import java.util.Scanner;

//Exercício 4 - Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados


public class Ex04 {

	public static void main(String[] args) {
		
        Scanner scn = new Scanner(System.in);
		
		float n1,n2,n3,n4, media;
		
		System.out.printf("------ Calculando média aritmética ------\n");
		System.out.printf("Digite o primeiro número: ");
		n1 = scn.nextInt();
		System.out.printf("Digite o segundo número: ");
		n2 = scn.nextInt();
		System.out.printf("Digite o terceiro número: ");
		n3 = scn.nextInt();
		System.out.printf("Digite o quarto número: ");
		n4 = scn.nextInt();
		
		
		media = (n1 + n2 + n3 + n4)/4;
		
		System.out.printf("Média: %.2f", media);

	}

}

