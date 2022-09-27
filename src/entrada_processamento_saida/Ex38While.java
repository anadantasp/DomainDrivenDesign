package entrada_processamento_saida;

//Exercício 38 - Exibir a soma dos números inteiros positivos do intervalo de um a cem.

public class Ex38While {

	public static void main(String[] args) {
		
		int soma = 0, i = 1;
		
		while(i <= 100) {
			soma += i;
			i++;
		}

		System.out.println("A soma dos números inteiros num intervalo de 1 a 100 é " + soma);
	}

}
