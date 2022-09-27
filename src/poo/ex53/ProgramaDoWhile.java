package poo.ex53;

import java.util.Scanner;

public class ProgramaDoWhile {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		Aluno[] alunos = new Aluno[2];
		
		int i = 0, j = 0;

		do{

			Aluno aluno = new Aluno();

			System.out.println("Digite o ra do aluno: ");
			aluno.ra = scn.next();
			System.out.println("Digite o nome do aluno: ");
			aluno.nome = scn.next();

			aluno.materias = new String[6];

			while(j < 6) {
				System.out.println("Digite a matéria: ");
				aluno.materias[j] = scn.next();
				j++;
			}
			
			j = 0;

			System.out.println("Digite o perído do curso: ");
			aluno.periodo = scn.next().toLowerCase();

			alunos[i] = aluno;
			
			i++;
		}while(i < alunos.length);
		
		i = 0;
		j = 0;

		do{
			if (alunos[i].periodo.equals("noturno")) {
				System.out.println("RA: " + alunos[i].ra);
				System.out.println("Aluno: " + alunos[i].nome);
				System.out.print("Matérias: ");
				while(j < 6) {
					System.out.print(alunos[i].materias[j] + " | ");
					j++;
				}
				
				j = 0;
				
				System.out.println("\nPerído: " + alunos[i].periodo + "\n");
			}

			i++;
		}while(i < alunos.length);

	}

}
