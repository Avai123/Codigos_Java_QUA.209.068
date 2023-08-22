package entities;

public class Produto {

	private String nome;
	private int quantidade;
	private double preço;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void adicionarQuantidade(int quantidade) {
		this.quantidade += quantidade;

	}

	public void removerquantidade(int quantidade) {
		this.quantidade -= quantidade;
	}

	public void mostrarEstoque() {
		System.out.println("Nome do produto " + nome);
		System.out.println("Quantidade em estoque: " + quantidade);
		System.out.println("Valor total em estoque: " + (quantidade * preço));
	}
}