package entrada_processamento_saida;

import java.util.Scanner;

//Exerc�cio 4 - Calcular e exibir a m�dia aritm�tica de quatro valores quaisquer que ser�o digitados


public class Ex04 {

	public static void main(String[] args) {
		
        Scanner scn = new Scanner(System.in);
		
		float n1,n2,n3,n4, media;
		
		System.out.printf("------ Calculando m�dia aritm�tica ------\n");
		System.out.printf("Digite o primeiro n�mero: ");
		n1 = scn.nextInt();
		System.out.printf("Digite o segundo n�mero: ");
		n2 = scn.nextInt();
		System.out.printf("Digite o terceiro n�mero: ");
		n3 = scn.nextInt();
		System.out.printf("Digite o quarto n�mero: ");
		n4 = scn.nextInt();
		
		
		media = (n1 + n2 + n3 + n4)/4;
		
		System.out.printf("M�dia: %.2f", media);

	}

}

