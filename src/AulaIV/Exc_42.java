package AulaIV;

import java.util.Scanner;

public class Exc_42 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n;
		double num=1, num2=2, soma=0;
		
		System.out.printf("Digite a quantidade de numeros da sequencia que serao somados: ");
		n = ler.nextInt();
		while(n<=0 || n>49) {
			System.out.printf("Erro! Numero invalido, por favor digite novamente: ");
			n = ler.nextInt();
		}
		
		
		for(int i=1; i<=n; i++) {
			soma = soma + (num/num2);
			System.out.printf("%.0f/%.0f, ", num, num2);
			num++;
			num2++;
		}
		System.out.printf("\nA soma de todos os %d numeros da sequencia e igual a %.2f.", n, soma);
		
	}

}
