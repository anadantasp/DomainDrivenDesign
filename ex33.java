package entrada_processamento_saida;

import java.util.Scanner;

public class ex33 {

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
