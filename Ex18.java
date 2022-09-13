package entrada_processamento_saida;

/*
 * Exercício 18 -  Criar um programa para analisar a velocidade de um automóvel. 
 * Solicitar via teclado os valores da aceleração (a em m/s2), velocidade inicial (v0 em m/s) 
 * e o tempo de percurso (t em s). Calcular e exibir a velocidade final do automóvel em km/h.
 * Fórmula para o cálculo da velocidade em m/s: V = v0 + a. t
 */

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		double a, v0, V;
		int t;
		
		System.out.printf("Entre com o valor da aceleração (m/s²): ");
		a = scn.nextFloat();
		System.out.printf("Entre com o valor da velocidade inicial (m/s): ");
		v0 = scn.nextFloat();
		System.out.printf("Entre com o tempo do percuso (em segundos): ");
		t = scn.nextInt();
		
		V = v0 + a * t;
		
		V = V * 3.6;
		
		System.out.printf("Velocidade do veículo: %.1f\n", V);
		
		if(V <= 40) {
			System.out.printf("Veículo muito lento\n");
		} else if (V <= 60) {
			System.out.printf("Velocidade permitida\n");
		} else if (V <= 80) {
			System.out.printf("Velocidade de cruzeiro");
		} else if (V <= 120) {
			System.out.printf("Veículo rápido\n");
		} else {
			System.out.printf("Veículo muito rápido\n");
		}
		

	}

}
