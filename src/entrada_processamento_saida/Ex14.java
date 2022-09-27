package entrada_processamento_saida;

/*
 * Exerc�cio 14 - Entrar com o peso e a altura de uma determinada pessoa. 
 * Ap�s a digita��o, exibir se esta pessoa est� ou n�o com seu peso ideal. 
 * F�rmula: peso/altura�.
 */

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		float peso, altura, imc;
		
		System.out.printf("Entre com o seu peso(kg): ");
		peso = scn.nextFloat();
		
		System.out.printf("Entre com a sua altura(m): ");
		altura = scn.nextFloat();
		
		imc = peso / (altura * altura);
		
		if(imc < 20) {
			System.out.printf("Abaixo do peso");
		} else if (imc < 25) {
			System.out.printf("Peso ideal");
		}else {
			System.out.printf("Acima do peso");
		}

	}

}
