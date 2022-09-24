package AulaIII;

import java.util.Scanner;

public class Exc_30 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double preco, pagar;
		int opc;
		
		System.out.printf("Digite o valor do protudo: ");
		preco = ler.nextDouble();
		
		System.out.println("Opcoes de pagamento: ");
		System.out.println("1 - A vista em dinheiro ou cheque. ");
		System.out.println("2- -A vista no cartao de credito. ");
		System.out.println("3 - Em duas vezes. ");
		System.out.println("4 - Em quatro vezez. ");
		System.out.printf("Digite a forma de pagamento: ");
		opc = ler.nextInt();
		
		switch(opc) {
			case 1:
				
				pagar = preco - (preco*0.10);
				System.out.printf("O total a ser pago e de: %.2f.", pagar);
				
				break;
				
			case 2:
				
				pagar = preco - (preco*0.15);
				System.out.printf("O total a ser pago e de: %.2f.", pagar);
				
				break;
				
			case 3:
				
				pagar = preco;
				System.out.printf("O total a ser pago e de: %.2f.", pagar);
				
				break;
				
			case 4:
				
				pagar = preco + (preco*0.10);
				System.out.printf("O total a ser pago e de: %.2f.", pagar);
				
				break;
				
			default:
				System.out.println("Opcao invalida.");
		}
	}
}
