package entrada_processamento_saida;

/*
 * Exerc�cio 33 - Entrar via teclado com o sexo de determinado usu�rio, aceitar somente �F� ou �M� 
 * como respostas v�lidas
 */

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String sexo;
		
		System.out.printf("Qual o seu gênero?");
		sexo = scn.next().toUpperCase();
		
		while(!sexo.equals("F") && !sexo.equals("M")) {
			System.out.println("Seguir padrão F/M");
			System.out.printf("Digite seu gênero: ");
			sexo = scn.next().toUpperCase();
		}
		
		System.out.println("Gênero: " + sexo);
		

	}

}
