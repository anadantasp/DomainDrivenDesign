package poo.ex51;

import java.util.Scanner;

public class ProgramaDoWhile {

	public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
		
		Cliente [] clientes = new Cliente[5];
		int i = 0;
		
		do{
			
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
			
			i++;
		}while(i < clientes.length);
		
		System.out.println("-------------------- Lista de Clientes --------------------");
		
		i = 0;
		
		do{
			if(clientes[i].idade >= 18) {
				System.out.print("Id: " + clientes[i].id + "\tNome: " + clientes[i].nome +
						"\tIdade: " + clientes[i].idade + "\tE-mail: " + clientes[i].email + "\n");
			}
			
			i++;
		}while(i < clientes.length);


	}

}
