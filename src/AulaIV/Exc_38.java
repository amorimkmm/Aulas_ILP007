 package AulaIV;
 
 import java.util.Scanner;

public class Exc_38 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int soma=0;
		
		for(int i=1; i<=100; i++) {
			soma = soma+i;
		}
		
		System.out.printf("Soma dos números de 1 a 100 e igual a: %d.\n", soma);
	}
}
