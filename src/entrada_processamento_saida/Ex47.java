package entrada_processamento_saida;

import java.util.Scanner;

public class Ex47 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		String resposta = "S";
		int num, total=0;
		
		
		while(resposta.equals("S")) {
			
			System.out.printf("Deseja calcular o fatorial de qual número? ");
			num = scn.nextInt();
			
			for(int i = num -1; i > 0; i--) {
				total = num * i;
				num = total;
			}
			
			System.out.println("Fatorial: " + total);
			
			System.out.printf("Deseja uma nova execução do programa?(S/N) ");
			resposta = scn.next().toUpperCase();
			
			while(!resposta.equals("S") && !resposta.equals("N")){
				System.out.println("Seguir padrão de resposta S/N");
				System.out.printf("Deseja uma nova execução do programa?(S/N) ");
				resposta = scn.next().toUpperCase();
			}
			
		}

	}

}
