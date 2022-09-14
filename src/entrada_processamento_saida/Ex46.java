package entrada_processamento_saida;

import java.util.Scanner;

public class Ex46 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int quant, num, maior=0, menor=0,positivos=0, negativos=0, soma=0;
		float media = 0, porcentagemPositivo=0, porcentagemNegativo=0;
		String resposta = "S";
		
		do {
			System.out.printf("Quantidade de números que serão digitados: ");
			quant = scn.nextInt();
			
			while(quant < 0 || quant >=20) {
				System.out.println("Opa! Não pode números negativos e quantidade deve ser menor que 20");
				System.out.printf("Quantidade de números que serão digitados: ");
				quant = scn.nextInt();
			}
			
			for(int i = 1; i <= quant; i++) {
				System.out.println("Entre com um número: ");
				num = scn.nextInt();
				
				/*
				 * while(num < 0) {
				 * System.out.println("Opa! Não pode números negativos!");
				 * System.out.println("Digite outro número: ");
				 * num = scn.nextInt();
				 *}
				 */
					
				if(i == 1) {
					maior = num;
				}else{
					if(num > maior) {
						maior = num;
					}
				}
				
				if(i == 1) {
					menor = num;
				}else{
					if(num < menor) {
						menor = num;
					}
				}
				
				if(num > 0) {
					positivos++;
				}else {
					negativos--;
				}
				
				soma = soma + num;

			}
			
			media = soma / quant;
			

			porcentagemPositivo = (positivos * 100) / quant;
			porcentagemNegativo = (negativos * 100) / quant;

			
			System.out.println("O maior valor: "  + maior);
			System.out.println("O menor valor: "  + menor);
			System.out.println("A soma dos valores"  + soma);
			System.out.println("Porcentagem dos valores positivos: "  + porcentagemPositivo);
			System.out.println("Porcentagem dos valores negativos : "  + porcentagemNegativo);
			
			System.out.printf("Deseja uma nova execução do programa?(S/N) ");
			resposta = scn.next();
			
			while(!resposta.equals("S") && !resposta.equals("N")){
				System.out.println("Seguir padrão de resposta S/N");
				System.out.printf("Deseja uma nova execução do programa?(S/N) ");
				resposta = scn.next();
			}
		}while(resposta.equals("S"));
		
	}

}
