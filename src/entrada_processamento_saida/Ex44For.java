package entrada_processamento_saida;

/*
 * Exerc�cio 44 - Entrar via teclado com dez valores positivos. Consistir a digita��o e enviar 
 * mensagem de erro, se necess�rio. Ap�s a digita��o, exibir:
 *a) O maior valor;
 *b) A soma dos valores;
 *c) A m�dia aritm�tica dos valores;
 */

import java.util.Scanner;

public class Ex44For {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int num, maior=0, soma=0;
		float media = 0;
		
		for(int i = 1; i <=10; i++) {
			System.out.println("Entre com um número: ");
			num = scn.nextInt();
			
			while(num < 0) {
				System.out.println("Opa! Não pode números negativos!");
				System.out.println("Digite outro número: ");
				num = scn.nextInt();
			}
			
			if(i == 1) {
				maior = num;
			}else{
				if(num > maior) {
					maior = num;
				}
			}
			
			soma = soma + num;

		}
		
		media = soma/10;
		
		System.out.println("O maior valor: "  + maior);
		System.out.println("A soma dos valores"  + soma);
		System.out.println("Média"  + media);
		
		
	}

}
