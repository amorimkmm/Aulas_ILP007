package AulaIII;

import java.util.Scanner;

public class Exc_13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		
		do {
			
			System.out.printf("Digite um valor: ");
			a = ler.nextInt();
			
			System.out.printf("Digite outro valor: ");
			b = ler.nextInt();
			
			System.out.printf("Digite mais um valor: ");
			c = ler.nextInt();
			
			if(a==b || b==c) {
				System.out.println("Numeros invalidos, digite valores distintos!!");
			}
		}while(a==b || b==c);
		
		if(a>b) {
			if(a>c) {
				System.out.printf("O maior numero e: %d.", a);
			}else {
				System.out.printf("O maior numero e: %d.", c);
			}
		}else if(b>c) {
			System.out.printf("O maior numero e: %d.", b);
		}else {
			System.out.printf("O maior numero e: %d.", c);
		}
	}
}
