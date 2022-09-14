package entrada_processamento_saida;

//Exercício 5 - Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e exibir sua temperatura equivalente em Fahrenheit.

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		double tempC, tempF;
		
		System.out.printf("Digite a temperatura em Celsius: ");
		tempC = scn.nextFloat();
		
		tempF = (tempC * 1.8) + 32;
		
		System.out.printf("Temperatura em fahrenheit: %.1f", tempF);
		
	}

}


