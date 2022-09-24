package AulaIII;

import java.util.Scanner;

public class Exc_20 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double media, P1, P2;
		
		System.out.printf("Digite a media minima da sua instituicao de ensino para ser aprovado: ");
		media = ler.nextDouble();
		
		System.out.printf("Digite a nota da P1: ");
		P1 = ler.nextDouble();
		
		P2 = ((media*3) - P1)/2;
		
		System.out.printf("Voce precisa tirar %.2f na P2, para ser APROVADO!", P2);
	}
}
