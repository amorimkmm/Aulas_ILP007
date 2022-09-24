package AulaIII;

import java.util.Scanner;

public class Exc_21 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int opc;
		double val1, val2, oper;
		
		do {
			
			System.out.printf("Digite um valor: ");
			val1 = ler.nextDouble();
			
			System.out.printf("Digite um valor: ");
			val2 = ler.nextDouble();
			
			System.out.println("Menu de Opcoes:");
			System.out.println("Opcao 1 - Multiplicacao.");
			System.out.println("Opcao 2 - Adicao.");
			System.out.println("Opcao 3 - Divisao.");
			System.out.println("Opcao 4 - Subtracao.");
			System.out.println("Opcao 5 - Finalizar processo.");
			System.out.printf("Digite a opcao desejada: ");
			opc = ler.nextInt();
			
			switch(opc) {
				case 1:
					
					oper = val1 * val2;
					System.out.printf("O resultado da multiplicacao entre: %.2f e %.2f resulta em: %.2f.\n", val1, val2, oper);
					
					break;
					
				case 2:
					
					oper = val1 + val2;
					System.out.printf("O resultado da adicao entre: %.2f e %.2f resulta em: %.2f.\n", val1, val2, oper);
					
					break;
					
				case 3: 
					
					if(val2==0) {
						System.out.printf("Erro - Denominador igual a 0.\n");
						break;
					}
					
					oper = val1 / val2;
					System.out.printf("O resultado da divisao entre: %.2f e %.2f resulta em: %.2f.\n", val1, val2, oper);
					
					break;
					
				case 4:
					
					oper = val1 - val2;
					System.out.printf("O resultado da subtracao entre: %.2f e %.2f resulta em: %.2f.\n", val1, val2, oper);
					
					break;
					
				case 5:
					
					System.exit(0);
					
					break;
					
				default:
					System.out.printf("Opcao invalida, digite apenas opcoes que estao presentes no menu de opcoes.\n");
			}
			
		}while(opc!=5);
	}
}
