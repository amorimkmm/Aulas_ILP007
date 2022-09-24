package Exc51_AulaV;

import java.util.Scanner;

public class Exc_51 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Cliente[] listaClientes = new Cliente[5];
		
		for(int i=0; i<=4; i++) {
			Cliente c = new Cliente();
			
			System.out.printf("Digite o id do cliente: ");
			c.id = ler.nextInt();
			System.out.printf("Digite o nome do cliente: ");
			c.nome = ler.next();
			System.out.printf("Digite a idade do cliente: ");
			c.idade = ler.nextInt();
			System.out.printf("Digite o email do cliente: ");
			c.email = ler.next();
			listaClientes[i] = c;
			
		}
		
		for(int i=0; i<=4; i++) {
			
			if(listaClientes[i].idade>18) {
				
				System.out.printf("\nCliente %d: \n", listaClientes[i].id);
				System.out.printf("Nome: %s;\n", listaClientes[i].nome);
				System.out.printf("Idade: %d;\n", listaClientes[i].idade);
				System.out.printf("Email: %s.\n", listaClientes[i].email);
				
			}
			
		}
		
	}

}
