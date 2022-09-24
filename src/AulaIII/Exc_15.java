package AulaIII;

import java.util.Scanner;

public class Exc_15 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.printf("Digite um valor: ");
		a = ler.nextInt();
		
		System.out.printf("Digite um valor: ");
		b = ler.nextInt();
		
		System.out.printf("Digite um valor: ");
		c = ler.nextInt();
		
		if(a+b>c || b+c>a || c+a>b) {
			if(a==b && b==c) {
				System.out.printf("Os tres valores digitados formam um triangulo equilatero.");
			}else if(a==b || b==c || c==a) {
				System.out.printf("Os tres valores digitados formam um triangulo isosceles.");
			}else {
				System.out.printf("Os tres valores digitados formam um triangulo escaleno.");
			}
		}else {
			System.out.printf("Os tres valores digitados nao formam um triangulo.");
		}
	}

}
