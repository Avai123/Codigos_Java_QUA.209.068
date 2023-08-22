package principal;

import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produto produto = new Produto();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o nome do produto: ");
		String nome = sc.nextLine();
		
		
		System.out.println("entre com o preço: ");
		produto.setPreço(sc.nextDouble());
		
		produto.setNome("Caneta bic");
		//produto.setPreço(1.99);
		produto.adicionarQuantidade(10);
		
		
		produto.mostrarEstoque();
		
		produto.removerquantidade(5);
		
		produto.mostrarEstoque();
	}

}
