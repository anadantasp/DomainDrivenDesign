package entrada_processamento_saida;

/*
 * Exerc�cio 06:
 * Entrar via teclado com o valor da cota��o do d�lar e uma certa quantidade de d�lares. 
 * Calcular e exibir o valor correspondente em Reais (R$).
 */

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		float cotacao, valor, total;
		
		System.out.printf("Informe o valor da cota��o do d�lar hoje: ");
		cotacao = scn.nextFloat();
		
		System.out.printf("Informe o valor da quantia em d�lares: ");
		valor = scn.nextFloat();
		
		
		total = valor * cotacao;
		
		System.out.printf("O valor total em reais � R$%.2f", total);
		
		

	}

}
