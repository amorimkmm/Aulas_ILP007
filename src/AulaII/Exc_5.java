package AulaII;

import java.util.Scanner;

public class Exc_5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double C, F;
		
		System.out.printf("Digite a temperatura em Celsius: ");
		C = ler.nextDouble();
		
		F = (C*1.8) + 32;
		
		System.out.printf("A tempuratura digitada em Fahrenheit e: %.2f.", F);
	}

}
