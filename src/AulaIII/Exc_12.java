package AulaIII;

import java.util.Scanner;

public class Exc_12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double base, altura, area;
		
		System.out.printf("Digite o tamanho da base do retangulo: ");
		base = ler.nextDouble();
		
		System.out.printf("Digite o tamanho da altura do retangulo: ");
		altura = ler.nextDouble();
		
		area = base*altura;
		
		if(area>100) {
			System.out.printf("Area do retangulo: %.2f. Terreno Grande!", area);
		}else {
			System.out.printf("Area do retangulo: %.2f. Terreno Pequeno!", area);
		}
	}
}
