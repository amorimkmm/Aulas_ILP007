package AulaIV;

import java.util.Scanner;

public class Exc_48 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num;
		
		System.out.printf("Digite um numero: ");
		num = ler.nextInt();
		
		for(int i=0; i<=20; i++) {
			System.out.printf("%d, ", num);
			num = num + 1;
		}
	}

}
