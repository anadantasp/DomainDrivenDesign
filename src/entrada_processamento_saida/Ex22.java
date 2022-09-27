package entrada_processamento_saida;

/*
 * Exerc�cio 22 - Exibir o seguinte seletor de op��es e em fun��o de uma escolha, solicitar os dados 
 * necess�rios para o c�lculo da respectiva �rea. Enviar mensagem de erro se o usu�rio escolher uma 
 * op��o inexistente.
 * 
 * Encerrar o programa somente quando selecionada a op��o de finaliza��o. 
 * (Fazer esse exerc�cio utilizando If..Else e/ou Case)
 * 
 *1 � Tri�ngulo
 *2 � Quadrado
 *3 � Ret�ngulo
 *4 � C�rculo
 *5 � Fim de processo
 */

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			int s, a, b , c, d, l, r;
			float area1, area2, area3, area4;
			
			System.out.println("\nMENU\n");
			
			System.out.println("1.Tri�ngulo \n2.Quadrado \n3.Ret�ngulo \n4.C�rculo \n5.Fim do processo.");
			
			System.out.printf("digite a op��o desejada:");
			s = ler.nextInt();
			
			if (s==1) {
				System.out.printf("Digite a altura do tri�ngulo:");
				a = ler.nextInt();
				System.out.printf("Digite a base do tri�ngulo:");
				b = ler.nextInt();
				area1 = (a*b);
				
				System.out.printf("A �rea do tri�ngulo �: %.2f", area1);
			}
			
			else if (s==2) {
				System.out.printf("Digite o lado do quadrado:");
				l = ler.nextInt();
				
				area2 = (l*l);
				
				System.out.printf("A �rea do quadrado �: %.2f", area2);
			}
			
			else if (s==3) {
				System.out.printf("Digite a altura do ret�ngulo:");
				c = ler.nextInt();
				
				System.out.printf("Digite a base do ret�ngulo:");
				d = ler.nextInt();
				
				area3 = (c*d);
				
				System.out.printf("A �rea do ret�ngulo �: %.2f", area3);
			}
			
			else if (s==4) {
				System.out.printf("Digite o raio do c�rculo:");
				r = ler.nextInt();
				
				area4 = 3 * r;
				
				System.out.printf("A �rea do c�rculo �: %.2f", area4);
				
			}
			
			else if (s==5) {
				System.out.printf("Fim do processo.");
			}
			
			else {
				System.out.printf("Op��o inv�lida!");
			}
			
			ler.close();
			
		}

	}


