package entrada_processamento_saida;

/*
 * Exibir a tabuada dos valores de um a vinte, no intervalo de um a dez. 
 * Entre as tabuadas, solicitar que o usuário pressione uma tecla
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex37For {

	public static void main(String[] args) throws IOException {
		
		Scanner scn = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int i, j, res;
		
		for(i = 1; i <= 20; i++) {
			for(j = 1; j <= 10; j ++) {
				res = i * j;
				System.out.println(i + " X " + j + " = " + res);
			}
			System.out.println("Aperte enter para continuar");
			br.readLine();
		}
		

	}

}
