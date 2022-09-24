package AulaIII;

import java.util.Scanner;

public class Exc_23 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double A, B, C, soma;
		
		System.out.printf("Digite um valor: ");
		A = ler.nextDouble();
		
		System.out.printf("Digite um valor: ");
		B = ler.nextDouble();
		
		System.out.printf("Digite um valor: ");
		C = ler.nextDouble();
		
		soma = A + B;
		
		if(soma<C) {
			System.out.printf("A soma de %.2f e %.2f e igual a %.2f, menor que %.2f", A, B, soma, C);
		}else {
			System.out.printf("A soma nao e menor que %.2f", C);
		}
	}
}
