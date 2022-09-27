package entrada_processamento_saida;

/*
 * Entrar via teclado com um valor (X) qualquer. Travar a digitação, no sentido de aceitar somente 
 * valores positivos. Solicitar o intervalo que o programa que deverá calcular a tabuada do valor 
 * digitado, sendo que o segundo valor (B), deverá ser maior que o primeiro (A), caso contrário, 
 * digitar novamente somente o segundo. Após a validação dos dados, exibir a tabuada do valor digitado,
 * no intervalo decrescente, ou seja, a tabuada de X no intervalo de B para A.
 */

import java.util.Scanner;

public class Ex36While {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int intervaloInicial, intervaloFinal, res;
		
		System.out.printf("Digite um número: ");
		int num = scn.nextInt();
		
		while(num < 0) {
			System.out.println("O número NÃO pode ser NEGATIVO!");
			System.out.println("Digite outro número: ");
			num = scn.nextInt();
		}
		
		System.out.println("Em qual intervalo você deseja a tabuada?");
		System.out.println("Digite o valor inicial do intervalo: ");
		intervaloInicial = scn.nextInt();
		System.out.println("Agora digite o valor final do intervalo: ");
		intervaloFinal = scn.nextInt();
		
		while(intervaloFinal < intervaloInicial) {
			System.out.println("O valor final do intervalo deve ser MAIOR que o valor inicial!");
			System.out.println("Digite outro número: ");
			intervaloFinal = scn.nextInt();
		}
		
		while(intervaloFinal >= intervaloInicial) {
			
			res = num * intervaloFinal;
			System.out.println(num + " X " + intervaloFinal + " = " + res);
			intervaloFinal--;
		}
		

	}

}
