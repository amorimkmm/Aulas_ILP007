package AulaIII;

import java.util.Scanner;

public class Exc_16 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int A, B, C;
		
		System.out.printf("Digite um valor: ");
		A = ler.nextInt();
		
		System.out.printf("Digite um valor: ");
		B = ler.nextInt();
		
		System.out.printf("Digite um valor: ");
		C = ler.nextInt();
		
		if((A*A)==B+C) {
			System.out.printf("Os valores digitados formam um triangulo retangulo.");
		}else {
			System.out.printf("Os valores digitados nao formam um triangulo retangulo.");
		}
	}
}
