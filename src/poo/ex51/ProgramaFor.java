package poo.ex51;

import java.util.Scanner;

public class ProgramaFor {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		Cliente [] clientes = new Cliente[5];
		
		for(int i = 0; i < clientes.length; i++) {
			
			Cliente cliente = new Cliente();
			
			System.out.printf("Digite o id do cliente: ");
			cliente.id = scn.nextInt();
			
			System.out.printf("Digite o nome do cliente: ");
			cliente.nome = scn.next();
			
			System.out.printf("Digite a idade do cliente: ");
			cliente.idade = scn.nextInt();
			
			System.out.printf("Digite o e-mail do cliente: ");
			cliente.email = scn.next();
			
			clientes[i] = cliente;
		}
		
		System.out.println("-------------------- Lista de Clientes --------------------");
		
		for(int i = 0; i < clientes.length; i++) {
			if(clientes[i].idade >= 18) {
				System.out.print("Id: " + clientes[i].id + "\tNome: " + clientes[i].nome +
						"\tIdade: " + clientes[i].idade + "\tE-mail: " + clientes[i].email + "\n");
			}
		}

	}

}
