package AulaIV;

import java.util.Scanner;

public class Exc_46 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Character resposta;
		
		
		do {
			double media, soma=0, porcPs=0, porcNg=0, qnt, num, maior=0, menor=0, neg=0;
			do {
				System.out.printf("Digite a quantidade de numeros a serem lido: ");
				qnt = ler.nextInt();
				
				if(qnt<=0) {
					System.out.printf("Erro! Numero invalido! Digite um numero positivo: ");
					qnt = ler.nextInt();
				}
				if(qnt>20) {
					System.out.printf("Erro! Numero invalido, Digite um numero menor que 20: ");
					qnt = ler.nextInt();
				}
			}while(qnt <=0 || qnt>20);
			
			System.out.printf("Digite os %.0f numeros!\n", qnt);
			
			for(int i=1; i<=qnt; i++) {
				System.out.printf("Digite um numero: ");
				num = ler.nextInt();
				
				if(num>maior || i==0) {
					maior = num;
				}
				if(num<menor || i==0) {
					menor = num;
				}
				if(num<0) {
					neg ++;
				}
				soma = soma + num;
			}
			media = soma/qnt;
			porcPs = ((qnt-neg)*100)/qnt;
			porcNg = (neg*100)/qnt;
			
			System.out.printf("O menor numero digitado foi: %.0f.\n", menor);
			System.out.printf("O maior numero digitado foi: %.0f.\n", maior);
			System.out.printf("A soma dos numeros digitados e igual a: %.2f.\n", soma);
			System.out.printf("A media artimetica dos numeros digitados e igual a: %.2f.\n", media);
			System.out.printf("a porcentagem dos numeros negativos e igual a: %.2f\n", porcNg);
			System.out.printf("a porcentagem dos numeros positivos e igual a: %.2f\n", porcPs);
			
			System.out.printf("Deseja Repitir o programa?\n");
			resposta = ler.next().charAt(0);
			while(resposta != 's' && resposta != 'S' && resposta != 'n' && resposta != 'N') {
				System.out.printf("Insira apenas as respostas S ou N\n");
				resposta = ler.next().charAt(0);
			}
		}while(resposta == 's' || resposta == 'S');
		
		System.out.printf("PROGRAMA FINALIZADO!");
	}

}
