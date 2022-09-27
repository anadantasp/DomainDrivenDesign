package entrada_processamento_saida;

/*
 * Entrar via teclado com um valor (X) qualquer. Travar a digita��o, no sentido de aceitar somente 
 * valores positivos. Solicitar o intervalo que o programa que dever� calcular a tabuada do valor 
 * digitado, sendo que o segundo valor (B), dever� ser maior que o primeiro (A), caso contr�rio, 
 * digitar novamente somente o segundo. Ap�s a valida��o dos dados, exibir a tabuada do valor digitado,
 * no intervalo decrescente, ou seja, a tabuada de X no intervalo de B para A.
 */

import java.util.Scanner;

public class Ex36While {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int intervaloInicial, intervaloFinal, res;
		
		System.out.printf("Digite um n�mero: ");
		int num = scn.nextInt();
		
		while(num < 0) {
			System.out.println("O n�mero N�O pode ser NEGATIVO!");
			System.out.println("Digite outro n�mero: ");
			num = scn.nextInt();
		}
		
		System.out.println("Em qual intervalo voc� deseja a tabuada?");
		System.out.println("Digite o valor inicial do intervalo: ");
		intervaloInicial = scn.nextInt();
		System.out.println("Agora digite o valor final do intervalo: ");
		intervaloFinal = scn.nextInt();
		
		while(intervaloFinal < intervaloInicial) {
			System.out.println("O valor final do intervalo deve ser MAIOR que o valor inicial!");
			System.out.println("Digite outro n�mero: ");
			intervaloFinal = scn.nextInt();
		}
		
		while(intervaloFinal >= intervaloInicial) {
			
			res = num * intervaloFinal;
			System.out.println(num + " X " + intervaloFinal + " = " + res);
			intervaloFinal--;
		}
		

	}

}
