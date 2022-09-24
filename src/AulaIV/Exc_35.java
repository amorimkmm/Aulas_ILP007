package AulaIV;

import java.util.Scanner;

public class Exc_35 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num, tab;
		
		System.out.printf("Digite um numero positivo: ");
		num = ler.nextInt();
		
		while(num<=0) {
			System.out.printf("Erro! Digite apenas numeros positivos: ");
			num = ler.nextInt();
		}
		
		System.out.printf("Tabuada do %d: \n", num);
		
		for(int i=1; i<=10; i++) {
			tab = num*i;
			System.out.printf("%d*%d = %d.\n", num, i, tab);
		}
	}
}
