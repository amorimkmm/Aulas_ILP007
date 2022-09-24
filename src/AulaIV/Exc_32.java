package AulaIV;

import java.util.Scanner;

public class Exc_32 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.printf("Digite um numero: ");
		num1 = ler.nextInt();
		
		System.out.printf("Digite um numero: ");
		num2 = ler.nextInt();
		
		while(num2<num1) {
			System.out.printf("Erro - Segundo numero devera ser maior que o primeiro. Digite novamente: ");
			num2 = ler.nextInt();
		}
	}
}
