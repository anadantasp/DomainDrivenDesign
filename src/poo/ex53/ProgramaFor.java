package poo.ex53;

import java.util.Scanner;

public class ProgramaFor {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		Aluno[] alunos = new Aluno[5];


		for (int i = 0; i < alunos.length; i++) {

			Aluno aluno = new Aluno();

			System.out.println("Digite o ra do aluno: ");
			aluno.ra = scn.next();
			System.out.println("Digite o nome do aluno: ");
			aluno.nome = scn.next();

			aluno.materias = new String[6];

			for (int j = 0; j < 6; j++) {
				System.out.println("Digite a mat�ria: ");
				aluno.materias[j] = scn.next();

			}

			System.out.println("Digite o per�do do curso: ");
			aluno.periodo = scn.next().toLowerCase();

			alunos[i] = aluno;
		}

		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i].periodo.equals("noturno")) {
				System.out.println("RA: " + alunos[i].ra);
				System.out.println("Aluno: " + alunos[i].nome);
				System.out.print("Mat�rias: ");
				for (int j = 0; j < 6; j++) {
					System.out.print(alunos[i].materias[j] + " | ");
				}
				System.out.println("\nPer�do: " + alunos[i].periodo + "\n");
			}

		}

	}

}
