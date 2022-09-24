package AulaIII;

import java.util.Scanner;

public class Exc_18 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double ace, VelIn, temp, VelMed, VelKil;
		
		System.out.printf("Digite a aceleracao que estava o carro: ");
		ace = ler.nextDouble();
		
		System.out.printf("Digte a velocidade inicial em que estava o carro: ");
		VelIn = ler.nextDouble();
		
		System.out.printf("Digite o tempo que o percurso foi feito: ");
		temp = ler.nextDouble();
		
		VelMed = VelIn + (ace*temp);
		
		System.out.printf("Sua velocidade era de %.2f m/s.\n", VelMed);
		
		VelKil = VelMed*3.6;
		
		if(VelKil<=40) {
			System.out.printf("Sua velocidade era de %.2f Km/h.\n", VelKil);
			System.out.println("Veiculo muito Lento!");
		}else if(VelKil<=60) {
			System.out.printf("Sua velocidade era de %.2f Km/h.\n", VelKil);
			System.out.println("Veiculo permitida!");
		}else if(VelKil<=80) {
			System.out.printf("Sua velocidade era de %.2f Km/h.\n", VelKil);
			System.out.println("Veiculo de cruzeiro!");
		}else if(VelKil<=120) {
			System.out.printf("Sua velocidade era de %.2f Km/h.\n", VelKil);
			System.out.println("Veiculo rapido!");
		}else {
			System.out.printf("Sua velocidade era de %.2f Km/h.\n", VelKil);
			System.out.println("Veiculo muito rapido!");
		}
	}
}
