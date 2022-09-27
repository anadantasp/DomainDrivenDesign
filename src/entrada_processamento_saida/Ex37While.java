package entrada_processamento_saida;

/*
 * Exibir a tabuada dos valores de um a vinte, no intervalo de um a dez. 
 * Entre as tabuadas, solicitar que o usuário pressione uma tecla
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex37While {

	public static void main(String[] args) throws IOException {
		
		Scanner scn = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int i=1, res;
		
		while(i <= 20) {
			int j = 1;
			while(j <= 10) {
				res = i * j;
				System.out.println(i + " X " + j + " = " + res);
				j++;
			}
			i++;
			System.out.println("Aperte enter para continuar");
			br.readLine();
			
		}
		

	}

}
