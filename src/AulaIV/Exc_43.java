package AulaIV;

import java.util.Scanner;

public class Exc_43 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, j=1;
		double num=1, num2, soma=0;
		
		System.out.printf("Digite a quantidade de numeros da sequencia que serao soma: ");
		n = ler.nextInt();
		while(n<=0 || n>49) {
			System.out.printf("Erro! Numero invalido, por favor digite novamente: ");
			n = ler.nextInt();
		}
		
		for(int i=1; i<=n; i++) {
			
			num = num + j;
			num2 = Math.pow(i, 3);
			System.out.printf("%.0f/%.0f, ", num, num2);
			
			soma = soma + (num/num2);
			j = j + 2;
			
		}
		System.out.printf("\nA soma de todos os %d numeros da sequencia e igual a %.2f.", n, soma);
	}

}
