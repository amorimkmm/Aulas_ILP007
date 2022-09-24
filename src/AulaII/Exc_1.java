package AulaII;

import java.util.Scanner;

public class Exc_1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int base, altura, area;
		
		System.out.printf("Entre com a bese do retangulo: ");
		base = ler.nextInt();
		
		System.out.printf("Entre com a altura do retangulo: ");
		altura = ler.nextInt();
		
		area = base*altura;
		
		System.out.printf("A area do retangulo inserido e : %d metros quadrados.", area);
	}

}
