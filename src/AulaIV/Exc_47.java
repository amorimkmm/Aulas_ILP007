package AulaIV;

import java.util.Scanner;

public class Exc_47 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Character resp;
		
		do {
			int num, fat=1;
			System.out.printf("Digite um numero positivo que deseja saber o fatorial: ");
			num = ler.nextInt();
			while(num<=0) {
				System.out.printf("Erro! Digite um numero positivo: ");
				num = ler.nextInt();
			}
			
			for(int i=num; i>0; i--) {
				fat = fat*i;
			}
			System.out.printf("%d! = %d.\n", num, fat);
			
			System.out.printf("Deseja continuar? ");
			resp = ler.next().charAt(0);
			while(resp != 's' && resp != 'S' && resp != 'n' && resp != 'N') {
				System.out.printf("Insira apenas as respostas S ou N\n");
				resp = ler.next().charAt(0);
			}
		}while(resp == 's' || resp == 'S');
		
		System.out.printf("Programa Finalizado!");
	}

}
