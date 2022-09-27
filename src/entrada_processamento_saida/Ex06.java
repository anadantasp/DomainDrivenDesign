package entrada_processamento_saida;

/*
 * Exercício 06:
 * Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de dólares. 
 * Calcular e exibir o valor correspondente em Reais (R$).
 */

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		float cotacao, valor, total;
		
		System.out.printf("Informe o valor da cotação do dólar hoje: ");
		cotacao = scn.nextFloat();
		
		System.out.printf("Informe o valor da quantia em dólares: ");
		valor = scn.nextFloat();
		
		
		total = valor * cotacao;
		
		System.out.printf("O valor total em reais é R$%.2f", total);
		
		

	}

}
