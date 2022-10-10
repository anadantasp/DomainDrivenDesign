package poo.ex55;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		Cliente [] clientes = new Cliente[2];
		
		String nome;
		int idade;
		String email;
		char possuiConta;
		
		for(int i = 0; i < clientes.length; i++) {
			Cliente cliente = new Cliente();
			
			System.out.println("*****CADASTRO DE CLIENTE*****");
			System.out.println("Nome: ");
			cliente.setNome(scn.next());
			System.out.println("Idade: ");
			cliente.setIdade(scn.nextInt());
			System.out.println("E-mail: ");
			cliente.setEmail(scn.next());
			
			System.out.println("Possui conta? (S/N)");
			possuiConta = scn.next().toUpperCase().charAt(0);
			
			if(possuiConta == 'S') {
				
				ContaBancaria conta = new ContaBancaria();
				
				System.out.println("Agência: ");
				conta.setAgencia(scn.next());
				System.out.println("Nº da conta: ");
				conta.setNumero(scn.next());
				System.out.println("Saldo: ");
				conta.setSaldo(scn.nextDouble());
				
				cliente.setConta(conta);
			} else {
				cliente.setConta(null);
			}
			
			clientes[i]	= cliente;
		}
		
		for(int i = 0; i < clientes.length; i++) {
			System.out.println(clientes[i].exibirNomeIdade());
			if(clientes[i].getConta() != null) {
				System.out.println(clientes[i].exibirDadosConta());
			}
			
		}
		

	}

}
