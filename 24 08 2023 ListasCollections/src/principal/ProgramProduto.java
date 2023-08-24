package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import entities.Produto;

public class ProgramProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		ArrayList<Produto> produtos = new ArrayList<>();

		Produto produto1 = new Produto();
		Produto produto2 = new Produto();
		Produto produto3 = new Produto();

		System.out.print("Digite o nome do primeiro produto: ");
		produto1.setNome(sc.nextLine());
		System.out.print("Digite a quatidade do primeiro produto: ");
		produto1.setQuantidade(sc.nextInt());
		System.out.print("Digite o valor do primeiro produto: ");
		produto1.setPreco(sc.nextDouble());
		produtos.add(produto1);

		sc.nextLine();

		System.out.print("Digite o nome do segundo produto: ");
		produto2.setNome(sc.nextLine());
		System.out.print("Digite a quantidade do segundo produto: ");
		produto2.setQuantidade(sc.nextInt());
		System.out.print("Digite o valor do segundo produto: ");
		produto2.setPreco(sc.nextDouble());
		produtos.add(produto2);

		sc.nextLine();

		System.out.print("Digite o nome do terceiro produto: ");
		produto3.setNome(sc.nextLine());
		System.out.print("Digite a quantidade do terceiro produto: ");
		produto3.setQuantidade(sc.nextInt());
		System.out.print("Digite o valor do terceiro produto: ");
		produto3.setPreco(sc.nextDouble());
		produtos.add(produto3);

		System.out.println("imprimindo com expressão lambda: ");
		Collections.sort(produtos, Comparator.comparing(Produto::getNome));

		for (Produto produto : produtos) {
			System.out.println("Nome: " + produto.getNome());
			System.out.println("Quantidade: " + produto.getQuantidade());
			System.out.println("Preco " + produto.getPreco());
		}

		sc.close();

	}

}
