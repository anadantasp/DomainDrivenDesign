package entrada_processamento_saida;

/*
 * Exerc�cio 44 - Entrar via teclado com dez valores positivos. Consistir a digita��o e enviar 
 * mensagem de erro, se necess�rio. Ap�s a digita��o, exibir:
 *a) O maior valor;
 *b) A soma dos valores;
 *c) A m�dia aritm�tica dos valores;
 */

import java.util.Scanner;

public class Ex44For {

	public static void main(String[] args) {
		
		double v[] = new double [10];
        double media;
        int i;
        Scanner entrada = new Scanner(System.in);

        for (i = 0; i<v.length;   i++) {
            System.out.print("Informe o " + (i+1) + "� valor de 10: ");
            v[i] = entrada.nextDouble();
        }
        
        double soma = 0;
        double maior = v[0];
        
        for (i = 0; i < v.length ; i++) {
            soma = soma + v[i];

            if (v[i] > maior) {
                maior = v[i];
            }
        }

        media = soma / v.length;

        System.out.printf("\n");
        System.out.println("O maior valor digitado �: " + maior);
        System.out.println("A soma dos valores digitado �: " + soma);
        System.out.println("A m�dia dos valores digitado �: " + media);
        entrada.close();
	}

}
