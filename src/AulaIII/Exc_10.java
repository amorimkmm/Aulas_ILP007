package AulaIII;

import java.util.Scanner;

public class Exc_10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b;
		
		System.out.printf("Digite um numero: ");
		a = ler.nextInt();
		
		System.out.printf("Digite outro numero: ");
		b = ler.nextInt();
		
		if(a>b) {
			System.out.printf("O maior numero e o %d.", a);
		}else if(b>a) {
			System.out.printf("O maior numero e o %d.", b);
		}else {
			System.out.printf("Os numeros sao identicos.");
		}
	}
}
