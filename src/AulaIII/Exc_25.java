package AulaIII;

import java.util.Scanner;

public class Exc_25 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int valor;
		
		System.out.printf("Digite um valor: ");
		valor = ler.nextInt();
		
		if(valor%2==0) {
			System.out.printf("O valor digitado e par! ");
		}else {
			System.out.printf("O valor digitado e impar! ");
		}
	}
}
