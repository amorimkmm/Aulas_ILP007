package AulaII;

import java.util.Scanner;

public class Exc_3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int base, altura;
		double area;
		
		System.out.printf("Insira a base do triangulo: ");
		base = ler.nextInt();
		
		System.out.printf("Insira a altura do triangulo: ");
		altura = ler.nextInt();
		
		area = (base*altura)/2;
		
		System.out.printf("A area do triangulo inserido e: %.2f.", area);
	}
}
