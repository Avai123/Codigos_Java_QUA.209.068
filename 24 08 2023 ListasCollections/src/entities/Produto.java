package entities;

public class Produto implements Comparable<Produto> {

	// Faça um programa que receba o nome de 3 produtos, quantidade e preço, faça
	// com que imprima na ordem alfabética e
	// depois imprima por quantidade;

	private String nome;
	private int quantidade;
	private double preco;

	public Produto() {
		// TODO Auto-generated constructor stub
	}

	public Produto(String nome, int quantidade, double preco) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public int compareTo(Produto o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
