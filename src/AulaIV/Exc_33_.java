package AulaIV;

import java.util.Scanner;

public class Exc_33_ {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		char sexo;
		
		do {
			
			System.out.printf("Entre com o seu sexo, (F) para feminino e (M) para masculino: ");
			sexo = ler.next().charAt(0);
			
			if(sexo == 'F' || sexo == 'M') {
				System.exit(0);
			}else {
				System.out.printf("Erro! Resposta invalida, digite F ou M. \n");
			}
			
		}while(sexo != 'F' || sexo != 'M');
	}
}
