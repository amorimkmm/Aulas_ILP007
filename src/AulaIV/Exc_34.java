package AulaIV;

import java.util.Scanner;

public class Exc_34 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int tab;
		
		System.out.println("Tabuada do 5:");
		for(int i=1; i<=10; i++) {
			
			tab = 5*i;
			System.out.printf("5*%d = %d.\n", i, tab);
			
		}
	}
}
