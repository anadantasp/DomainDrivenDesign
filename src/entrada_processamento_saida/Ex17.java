package entrada_processamento_saida;

/*
 *  Exercício 17 - Entrar com o peso, o sexo e a altura de uma determinada pessoa. 
 *  Após a digitação, exibir se esta pessoa está ou não com seu peso ideal. 
 *  Fórmula: peso/altura²
 */

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		float peso, altura, imc;
		String sexo;
		
		System.out.printf("Informe o seu peso(kg): ");
		peso = scn.nextFloat();
		System.out.printf("Informe a sua altura(m): ");
		altura = scn.nextFloat();
		System.out.printf("Informe o seu gênero(F/M): ");
		sexo = scn.next();
		
		imc = peso / (altura * altura);
		
		if(sexo.toUpperCase() == "F") {
			if(imc < 19){
				System.out.printf("Abaixo de peso");
			}else if(imc < 24) {
				System.out.printf("Peso ideal");
			}else {
				System.out.printf("Acima do peso");
			}
		}else {
			if(imc < 20){
				System.out.printf("Abaixo de peso");
			}else if(imc < 25) {
				System.out.printf("Peso ideal");
			}else {
				System.out.printf("Acima do peso");
			}
		}

	}

}

