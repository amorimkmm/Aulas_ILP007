package AulaIV;

import java.util.Scanner;

public class Exc_36 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num, ini, fim, tab;
		
		System.out.printf("Digite um numero positivo: ");
		num = ler.nextInt();
		
		while(num<=0) {
			System.out.printf("Erro! Digite apenas numeros positivos: ");
			num = ler.nextInt();
		}
		
		System.out.printf("Digite o inicio do intervalo da tabuada: ");
		ini = ler.nextInt();
		
		System.out.printf("Digite o final do intervalo da tabuada: ");
		fim = ler.nextInt();
		
		while(ini>fim) {
			System.out.printf("Erro! O Final do intervalo deve ser maior que o inicio, digite novamente o final do intervalo: ");
			fim = ler.nextInt();
		}
		
		System.out.printf("Tabuada do %d: \n", num);
		
		for(int i=fim; i>=ini; i--) {
			tab = num*i;
			
			System.out.printf("%d*%d = %d. \n", num, i, tab);
		}
	}
}
