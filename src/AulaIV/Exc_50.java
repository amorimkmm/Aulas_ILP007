package AulaIV;

import java.util.Scanner;

public class Exc_50 {

	public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
		
		int ini, fim;
		
		System.out.printf("Digite o valor inicial do intervalo: ");
		ini = ler.nextInt();
		
		System.out.printf("Digite o valor final do intervalo: ");
		fim = ler.nextInt();
		
		if(fim<ini) {
			System.out.printf("Erro! O valor final tem q ser menor do que o valor inicial.\nDigite o valor final do intervalo: ");
			fim = ler.nextInt();
		}
		
		for(int i=ini; i<=fim; i++) {
			
			if(i>10 && (i%2)==0) {
				System.out.printf("%d, ", i);
			}
			
		}
	}

}
