package entrada_processamento_saida;

/*
 * Exerc�cio 24 - Fa�a um algoritmo que leia o nome, o sexo e o estado civil de uma pessoa. Caso sexo 
 * seja �F� e estado civil seja �CASADA�, solicitar o tempo de casada (anos).
 */

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String nome, sexo, civil;
		int anos;
		
		System.out.println("Entre com seu nome: ");
		nome = scn.next();
		System.out.println("Entre com o seu g�nero (F/M): ");
		sexo = scn.next();
		System.out.println("Entre com seu estado civil: ");
		civil = scn.next();
		
		if(sexo.toUpperCase().equals("F") && civil.toUpperCase().equals("CASADA")) {
			System.out.println("H� quantos anos voc� est� casada? ");
			anos = scn.nextInt();
		}
		

	}

}
