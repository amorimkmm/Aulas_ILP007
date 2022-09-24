package AulaIII;

import java.util.Scanner;

public class Exc_08 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b;
		
		do {
			System.out.printf("Digite um valor: ");
			a = ler.nextInt();
			
			System.out.printf("Digite outro valor diferente do anterior: ");
			b = ler.nextInt();
			
			if(a==b) {
				System.out.println("Valores invalidos, os numeros precisam ser distintos.");
			}
		}while(a==b);
		
		if(a>b) {
			System.out.printf("O maior numero e o %d.", a);
		}else {
			System.out.printf("O maior numero e o %d.", b);
		}
	}
}
