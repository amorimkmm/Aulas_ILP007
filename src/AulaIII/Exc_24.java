package AulaIII;

import java.util.Scanner;

public class Exc_24 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String nome, sexo, estadoCivil;
		int anos;
		
		System.out.printf("Digite seu nome: ");
		nome = ler.nextLine();
		
		System.out.printf("Digite seu sexo (F) para feminino e (M) para masculino: ");
		sexo = ler.nextLine();
		
		System.out.printf("Digite seu estado civil: ");
		estadoCivil = ler.nextLine();
		
		if(sexo.equals("F") && estadoCivil.equals("casada")) {
			System.out.printf("Digite a quantos anos e casada: ");
			anos = ler.nextInt();
			
			System.out.printf("Nome: %s; Sexo: %s; Estado civil: %s; Anos de casamento: %d", nome, sexo, estadoCivil, anos);
		}else {
			System.out.printf("Nome: %s; Sexo: %s; Estado civil: %s.", nome, sexo, estadoCivil);
		}
	}
}
