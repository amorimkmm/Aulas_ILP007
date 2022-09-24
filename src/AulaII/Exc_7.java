package AulaII;

import java.util.Scanner;

public class Exc_7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double prod1, prod2, prod3, prod4, prod5, soma, pagamento, troco;
		
		System.out.printf("Digite o valor do produro: ");
		prod1 = ler.nextDouble();
		
		System.out.printf("Digite o valor do produro: ");
		prod2 = ler.nextDouble();
		
		System.out.printf("Digite o valor do produro: ");
		prod3 = ler.nextDouble();
		
		System.out.printf("Digite o valor do produro: ");
		prod4 = ler.nextDouble();
		
		System.out.printf("Digite o valor do produro: ");
		prod5 = ler.nextDouble();
		
		soma = prod1 + prod2 + prod3 + prod4 + prod5;
		
		System.out.printf("O Total da compra e de: %.2f.\n", soma);
		
		do {
			System.out.printf("Digite o valor do pagamento: ");
			pagamento = ler.nextDouble();
			
			if(pagamento<soma) {
				System.out.println("Dinheiro insuficiente, por favor insira um valor igual ou maior que o total da compra");
			}
		}while(pagamento<soma);
		
		troco = pagamento - soma;
		
		System.out.printf("O troco e de: %.2f.", troco);
		
	}
}
