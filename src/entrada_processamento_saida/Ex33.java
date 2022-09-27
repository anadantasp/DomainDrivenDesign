package entrada_processamento_saida;

/*
 * Exercício 33 - Entrar via teclado com o sexo de determinado usuário, aceitar somente “F” ou “M” 
 * como respostas válidas
 */

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String sexo;
		
		System.out.printf("Qual o seu gÃªnero?");
		sexo = scn.next().toUpperCase();
		
		while(!sexo.equals("F") && !sexo.equals("M")) {
			System.out.println("Seguir padrÃ£o F/M");
			System.out.printf("Digite seu gÃªnero: ");
			sexo = scn.next().toUpperCase();
		}
		
		System.out.println("GÃªnero: " + sexo);
		

	}

}
