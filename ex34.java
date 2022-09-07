package entrada_processamento_saida;

import java.util.Scanner;

public class ex34 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int num = 5;
		int i = 1;
		int t;
		
		while(i <= 10) {
			t = num * i;
			System.out.println(num + " X " + i + " = " + t );
			i++;
		}
		

	}

}
