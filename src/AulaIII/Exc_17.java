package AulaIII;

import java.util.Scanner;

public class Exc_17 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double peso, altura, imc;
		String Sexo;
		
		System.out.printf("Digite seu sexo (F) para feminino e (M) para masculino: ");
		Sexo = ler.nextLine();
		
		switch(Sexo) {
			case "F":
				
				System.out.printf("Digite seu peso: ");
				peso = ler.nextDouble();
				
				System.out.printf("Digite a sua altura: ");
				altura = ler.nextDouble();
				
				imc = peso/(altura*altura);
				
				if(imc<19) {
					
					System.out.printf("Seu imc e: %.2f. Voce esta abaixo do peso.", imc);
				}else if(imc<24) {
					System.out.printf("Seu imc e: %.2f. Voce estano peso ideal.", imc);
				}else {
					System.out.printf("Seu imc e: %.2f. Voce esta acima do peso.", imc);
				}
				
				break;
				
			case "f":
				
				System.out.printf("Digite seu peso: ");
				peso = ler.nextDouble();
				
				System.out.printf("Digite a sua altura: ");
				altura = ler.nextDouble();
				
				imc = peso/(altura*altura);
				
				if(imc<19) {
					
					System.out.printf("Seu imc e: %.2f. Voce esta abaixo do peso.", imc);
				}else if(imc<24) {
					System.out.printf("Seu imc e: %.2f. Voce estano peso ideal.", imc);
				}else {
					System.out.printf("Seu imc e: %.2f. Voce esta acima do peso.", imc);
				}
				
				break;
				
			case "M":
				
				System.out.printf("Digite seu peso: ");
				peso = ler.nextDouble();
				
				System.out.printf("Digite a sua altura: ");
				altura = ler.nextDouble();
				
				imc = peso/(altura*altura);
				
				if(imc<20) {
					System.out.printf("Seu imc e: %.2f. Voce esta abaixo do peso.", imc);
				} else if(imc<25) {
					System.out.printf("Seu imc e: %.2f. Voce esta no peso ideal.", imc);
				}else {
					System.out.printf("Seu imc e: %.2f. Voce esta acima do peso.", imc);
				}
				
				break;
				
			case "m":
				
				System.out.printf("Digite seu peso: ");
				peso = ler.nextDouble();
				
				System.out.printf("Digite a sua altura: ");
				altura = ler.nextDouble();
				
				imc = peso/(altura*altura);
				
				if(imc<20) {
					System.out.printf("Seu imc e: %.2f. Voce esta abaixo do peso.", imc);
				} else if(imc<25) {
					System.out.printf("Seu imc e: %.2f. Voce esta no peso ideal.", imc);
				}else {
					System.out.printf("Seu imc e: %.2f. Voce esta acima do peso.", imc);
				}
				
				break;
				
				default: 
					System.out.printf("Valor invelido, por favor digite apenas F ou M.");
		}
	}
}
