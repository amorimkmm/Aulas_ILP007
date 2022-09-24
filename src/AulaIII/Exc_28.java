package AulaIII;

import java.util.Scanner;

public class Exc_28 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.printf("Digite um valor: ");
		a = ler.nextInt();
		
		System.out.printf("Digite um valor: ");
		b = ler.nextInt();
		
		System.out.printf("Digite um valor: ");
		c = ler.nextInt();
		
		if(a<b) {
			if(b<c) {
				System.out.printf("Ordem Crescente: %d, %d, %d.", a, b, c);
			}else {
				System.out.printf("Ordem Crescente: %d, %d, %d.", a, c, b);
			}
		}else {
			if(a<c) {
				System.out.printf("Ordem Crescente: %d, %d, %d.", b, a, c);
			}else {
				System.out.printf("Ordem Crescente: %d, %d, %d.", c, b, a);
			}
		}
	}

}
