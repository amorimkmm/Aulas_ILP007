package AulaIV;

import java.util.Scanner;

public class Exc_44 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num, maior=0;
		double media, soma=0;
		
		System.out.println("Digite 10 numeros positivos! ");
		for(int i=1; i<=10; i++) {
			do {
				System.out.printf("Digite um numero: ", i);
				num = ler.nextInt();
				
				if(num<=0) {
					System.out.println("Erro! Digite apenas numeros positivos!");
				}
				
			}while(num<=0);
			
			if(i==0 || num > maior) {
				maior = num;
			}
			soma = soma + num;
		}
		media = soma/10;
		
		System.out.printf("O maior numero digitado foi: %d.\n", maior);
		System.out.printf("A soma dos numeros digitados e igual a: %.0f.\n", soma);
		System.out.printf("A media aritmetica dos numeros digitados e iagual a: %.2f.\n", media);
	}

}
