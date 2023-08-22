package entities;

public class Pessoa {

	private String nome;
	private int idade;
	private int anoNascimento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public int getIdade() {
		idade = 2023 - anoNascimento;
		return idade;
	}

	public void imprimeDados() {
		System.out.printf("%s tem %d anos", nome, idade);

	}

}
