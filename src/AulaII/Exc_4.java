package AulaII;

import java.util.Scanner;

public class Exc_4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int val1, val2, val3, val4;
		double media;
		
		System.out.printf("Digite o primeiro valor: ");
		val1 = ler.nextInt();
		
		System.out.printf("Digite o segundo valor: ");
		val2 = ler.nextInt();
		
		System.out.printf("Digite o terceiro valor: ");
		val3 = ler.nextInt();
		
		System.out.printf("Digite o quarto valor: ");
		val4 = ler.nextInt();
		
		media = (val1 + val2 + val3 + val4)/4;
		
		System.out.printf("A media dos quatro valores e: %.2f.", media);
	}
}
