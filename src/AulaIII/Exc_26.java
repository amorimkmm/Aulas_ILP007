package AulaIII;

import java.util.Scanner;

public class Exc_26 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int valor, resultado;
		
		System.out.printf("Digite um valor: ");
		valor = ler.nextInt();
		
		if(valor<0) {
			resultado = valor*3;
			System.out.printf("Resultado: %d", resultado);
		}else {
			resultado = valor*2;
			System.out.printf("Resultado: %d", resultado);
		}
	}
}
