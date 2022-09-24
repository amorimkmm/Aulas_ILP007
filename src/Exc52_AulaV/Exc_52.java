package Exc52_AulaV;

import java.util.Scanner;

public class Exc_52 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Produto[] listaProdutos = new Produto[10];
		
		for(int i=0; i<=9; i++) {
			Produto p = new Produto();
			
			System.out.printf("\nDigite o id do produto: ");
			p.id = ler.nextInt();
			System.out.printf("Digite a descricao do produto: ");
			p.descricao = ler.next();
			System.out.printf("Digite o valor do produto: ");
			p.valor = ler.nextDouble();
			System.out.printf("Digite a quantidade de produtos no estoque: ");
			p.quantidade = ler.nextDouble();
			listaProdutos[i] = p;
		}
		
		for(int i=0; i<=9; i++) {
			
			if(listaProdutos[i].valor<100) {
				
				System.out.printf("\nProduto %d: \n", listaProdutos[i].id);
				System.out.printf("Descricao: %s;\n", listaProdutos[i].descricao);
				System.out.printf("Valor: %.2f;\n", listaProdutos[i].valor);
				System.out.printf("Quantidade em estoque: %.0f;\n", listaProdutos[i].quantidade);
				
			}
			
		}
	}

}
