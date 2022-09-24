package AulaIII;

import java.util.Scanner;

public class Exc_22 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int opc;
		double base, altura, raio, area;
		
		do {
			
			System.out.println("Menu de Opcoes:");
			System.out.println("Opcao 1 - Area de um triangulo.");
			System.out.println("Opcao 2 - Area de um quadrado.");
			System.out.println("Opcao 3 - Area de um retangulo");
			System.out.println("Opcao 4 - area de circulo.");
			System.out.println("Opcao 5 - Finalizar processo.");
			System.out.printf("Digite a opcao desejada: ");
			opc = ler.nextInt();
			
			switch(opc) {
				case 1:
					
					System.out.printf("Digite o tamanho da base do triangulo: ");
					base = ler.nextDouble();
					
					System.out.printf("Digite o tamanho da altura do triangulo: ");
					altura = ler.nextDouble();
					
					area = (base*altura)/2;
					
					System.out.printf("A area do triangulo e igual a: %.2f.\n", area);
					
					break;
					
				case 2:
					
					System.out.printf("Digite o tamanho da aresta do quadrado: ");
					base = ler.nextDouble();
					
					area = base*base;
					
					System.out.printf("A area do quadrado e igual a: %.2f.\n", area);
					
					break;
					
				case 3:
					
					System.out.printf("Digite o tamanho da base do retangulo: ");
					base = ler.nextDouble();
					
					System.out.printf("Digite o tamanho da altura do retangulo: ");
					altura = ler.nextDouble();
					
					area = base*altura;
					
					System.out.printf("A area do retanfulo e igual a: %.2f.\n", area);
					
					break;
					
				case 4:
					
					System.out.printf("Digite o tamanho do raio do circulo: ");
					raio = ler.nextDouble();
					
					
					area = 3.14*(raio*raio);
					
					System.out.printf("A area do circulo e igual a: %.2f.\n", area);
					
					break;
					
				case 5:
					
					System.out.println("Finalizando o programa....");
					System.exit(0);
					
					break;
			}
			
		}while(opc!=5);
	}
}
