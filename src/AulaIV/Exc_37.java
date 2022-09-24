package AulaIV;

import java.util.Scanner;

public class Exc_37 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int tab;
		
		for(int i=1; i<=20; i++) {
			System.out.printf("Tabuada do %d: \n", i);
			
			for(int j=1; j<=10; j++) {
				tab = i*j;
				
				System.out.printf("%d*%d = %d. \n", i, j, tab);
				
			}
			
			System.out.printf("Digite qualuqer tecla para continuar...");
			ler.nextLine();
		}
	}
}
