package AulaIII;

import java.util.Scanner;

public class Exc_14 {

	public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
		
		double peso, altura, imc;
		
		System.out.printf("Digite seu peso: ");
		peso = ler.nextDouble();
		
		System.out.printf("Digite a sua altura: ");
		altura = ler.nextDouble();
		
		imc = peso/(altura*altura);
		
		System.out.printf("%.1f\n", imc);
		
		if(imc<20) {
			System.out.printf("Voce esta abaixo do peso.");
		}else if(imc<25) {
			System.out.printf("Voce esta no peso ideal.");
		} else {
			System.out.printf("Voce esta acima do peso.");
		}
	}
}
