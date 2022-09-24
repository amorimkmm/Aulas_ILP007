package AulaII;

import java.util.Scanner;

public class Exc_2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int aresta, area;
		
		System.out.printf("Digite a aresta do quadrado: ");
		aresta = ler.nextInt();
		
		area=aresta*aresta;
		
		System.out.printf("A area do quadrado e: %d", area);
	}
}
