package principal;

import java.util.Scanner;

import entities.AtividadeEstoque;

public class ProgramAtividadeEstoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2)crie um programa de estoque, onde você poderá inserir um produto e a
		// quantidade e mostrar o
		// valor total do estoque da loja; use scanner

		Scanner sc = new Scanner(System.in);

		AtividadeEstoque estoque = new AtividadeEstoque();

		System.out.print("Digite a quantidade em estoque do produto: ");
		estoque.setQuantidade(sc.nextInt());
		sc.nextLine();

		System.out.print("Digite o nome do produto: ");
		estoque.setNomeProduto(sc.nextLine());

		System.out.print("Digite a quantidade para adicionar o produto: ");
		estoque.adcionarEstoque(sc.nextInt());

		estoque.getProduto();

	}

}
