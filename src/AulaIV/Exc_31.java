package AulaIV;

import java.util.Scanner;

public class Exc_31 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num;
		
		System.out.printf("Digite um numero positivo: ");
		num = ler.nextInt();
		
		while(num<=0) {
			System.out.printf("Erro - numero invalido, digite somente um numero possitivo: ");
			num = ler.nextInt();
		}
	}
}
