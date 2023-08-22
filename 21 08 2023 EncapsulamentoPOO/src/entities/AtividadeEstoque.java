package entities;

public class AtividadeEstoque {

	private String nomeProduto;
	private int quantidade;

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void adcionarEstoque(int quantidade) {
		this.quantidade += quantidade;
	}

	public void diminuirEstoque(int quantidade) {
		this.quantidade -= quantidade;
	}

	public void getProduto() {
		System.out.printf("Nome: %s\n quantidade:%d", nomeProduto, quantidade);
	}

}
