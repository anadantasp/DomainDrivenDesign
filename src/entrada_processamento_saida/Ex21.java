package entrada_processamento_saida;

/*
 * Exercício 21 - Entrar via teclado com dois valores quaisquer. Após a digitação, exibir um seletor 
 * de opções (“menu”) com as seguintes opções: (Fazer esse exercício utilizando If..Else e/ou Case)
 * 
 *1 – Multiplicação
 *2 – Adição
 *3 – Divisão
 *4 – Subtração
 *5 – Fim de processo (sair do programa)
 *
 *Solicitar uma opção por parte do usuário, verificar se é ou não uma opção válida (letras ou números) 
 *e processar a respectiva operação. Enviar mensagem de erro se a opção escolhida não existir no 
 *seletor.
 *
 *Encerrar o programa somente quando o usuário escolher a opção de finalização. Repare que a opção de 
 *número três é de divisão e o programa deverá enviar mensagem de erro, (somente nesta opção) se o 
 *denominador for zero.
 */

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		float num1, num2, res;
		int opcao;
		
		System.out.printf("Entre com o primeiro numero: ");
		num1 = scn.nextFloat();
		System.out.printf("Entre com o segundo numero: ");
		num2 = scn.nextFloat();
		
		System.out.printf("MENU: \n");
		System.out.printf("1 - Multiplicação\n");
		System.out.printf("2 - Adição\n");
		System.out.printf("3 - Divisão\n");
		System.out.printf("4 - Subtração\n");
		System.out.printf("5 - Encerrar programa\n");
		opcao = scn.nextInt();
		
		if(opcao != 5) {
			switch(opcao){
			case 1: 
				res = num1 * num2;
				System.out.println(num1 + " * " + num2 + " = " + res);
				break;
			case 2:
				res = num1 + num2;
				System.out.println(num1 + " + " + num2 + " = " + res);
				break;
			case 3: 
				if (num2 != 0) {
					res = num1 / num2;
					System.out.println(num1 + " / " + num2 + " = " + res);
				}else {
					System.out.printf("O denominador deve ser diferente de zero!");
				}
				break;
			case 4:
				res = num1 - num2;
				System.out.println(num1 + " - " + num2 + " = " + res);
				break;
			default: 
				System.out.printf("Opção inválida tente novamente!");
			}
		}else {
			System.out.printf("Encerrando o programa!");
		}

	}

}
