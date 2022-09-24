package Exc53_AulaVI;

import java.util.Scanner;

public class Exc_53 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int id, idade;
		String nome, email, agencia, numero;
		char conf;
		double saldo;
		
		Cliente[] listaClientes = new Cliente[5];
		
		for(int i=0; i<=4; i++) {
			Cliente c;
			
			System.out.printf("Digite o id do cliente: ");
			id = ler.nextInt();
			
			System.out.printf("Digite o nome do cliente: ");
			nome = ler.next();
			
			System.out.printf("Digite a idade do cliente: ");
			idade = ler.nextInt();
			
			System.out.printf("Digite o email do cliente: ");
			email = ler.next();
			
			System.out.printf("O Cliente possui conta bancaria? (S/N)");
			conf = ler.next().charAt(0);
			
			if(conf == 'S') {
				
				System.out.printf("Digite a agencia do cliente: ");
				agencia = ler.next();
				
				System.out.printf("Digite o numero da conta do cliente: ");
				numero = ler.next();
				
				System.out.printf("Digite o saldo na conta do cliente: ");
				saldo = ler.nextDouble();
				
				ContaBancaria cb = new ContaBancaria(agencia, numero, saldo);
				
				c = new Cliente(id, nome, idade, email, cb);
			}else {
				
				c = new Cliente(id, nome, idade, email, null);
				
			}
			
			listaClientes[i] = c;
		}
		
		for(int i=0; i<=5; i++) {
			
			System.out.println("Pessoa criada com sucesso!");
			System.out.printf("Id: %d\n", listaClientes[i].id);
			System.out.printf("Cliente:\n%s\n", listaClientes[i].exibirNomeIdade());
			
			if(listaClientes[i].conta != null) {
				System.out.printf("Dados da conta bancaria do clinente:\n%s\n", listaClientes[i].exibirDadosBancarios());
			}
			
		}
	}

}
