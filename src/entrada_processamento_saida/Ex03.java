package entrada_processamento_saida;

//Exerc�cio 3 - A partir dos valores da base e altura de um tri�ngulo, calcular e exibir sua �rea

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int base, altura, area;
		
		System.out.printf("------ Calculando a �rea de um tri�ngulo ------\n");
		System.out.printf("Base: ");
		base = scn.nextInt();
		System.out.printf("Altura: ");
		altura = scn.nextInt();
		
		
		area = (base * altura)/2;
		
		System.out.printf("�rea: %d", area);

	}

}


