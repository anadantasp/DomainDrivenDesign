package entrada_processamento_saida;

/*
 * Exerc�cio 21 - Entrar via teclado com dois valores quaisquer. Ap�s a digita��o, exibir um seletor 
 * de op��es (�menu�) com as seguintes op��es: (Fazer esse exerc�cio utilizando If..Else e/ou Case)
 * 
 *1 � Multiplica��o
 *2 � Adi��o
 *3 � Divis�o
 *4 � Subtra��o
 *5 � Fim de processo (sair do programa)
 *
 *Solicitar uma op��o por parte do usu�rio, verificar se � ou n�o uma op��o v�lida (letras ou n�meros) 
 *e processar a respectiva opera��o. Enviar mensagem de erro se a op��o escolhida n�o existir no 
 *seletor.
 *
 *Encerrar o programa somente quando o usu�rio escolher a op��o de finaliza��o. Repare que a op��o de 
 *n�mero tr�s � de divis�o e o programa dever� enviar mensagem de erro, (somente nesta op��o) se o 
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
		System.out.printf("1 - Multiplica��o\n");
		System.out.printf("2 - Adi��o\n");
		System.out.printf("3 - Divis�o\n");
		System.out.printf("4 - Subtra��o\n");
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
				System.out.printf("Op��o inv�lida tente novamente!");
			}
		}else {
			System.out.printf("Encerrando o programa!");
		}

	}

}
