package poo.ex52;

import java.util.Scanner;

public class ProgramaFor {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		Produto [] produtos = new Produto[10];
		
		for(int i = 0; i < produtos.length; i++) {
			
			Produto produto = new Produto();
			
			System.out.printf("Digite o id do produto: ");
			produto.id = scn.nextInt();
			System.out.printf("Digite o nome do produto: ");
			produto.descricao = scn.next();
			scn.nextLine();
			System.out.printf("Digite o valor do produto: ");
			produto.valor = scn.nextDouble();
			System.out.printf("Digite a quantidade do produto: ");
			produto.quantidade = scn.nextDouble();
			
			produtos[i] = produto;
			
		}
		
		System.out.println("----------------- Lista de Produtos -----------------");
		
		for(int i = 0; i < produtos.length; i++) {
			if(produtos[i].valor < 100) {
				System.out.print("\tId: " + produtos[i].id + "\tDescrição: " + produtos[i].descricao +
						"\tValor: R$" + produtos[i].valor + "\tQuantidade: " + produtos[i].quantidade + "\n");
			}
		}

	}

}
