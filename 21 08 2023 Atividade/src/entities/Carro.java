package entities;

public class Carro {

	private String nome;
	private String modelo;
	private String cor;
	private String marca;
	private int anoFabricacao;
	private int velocidade;
	private String cambio;

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public void getDadosVeiculos() {
		System.out.printf("nome: %s modelo: %s cor: %s marca: %s tem %d anoFabricacao", nome, modelo, cor, marca,
				anoFabricacao);
	}

	public void aumentarVelocidade1() {
		velocidade += 1;

	}

	public void diminuirVelocidade1() {
		velocidade -= 1;

	}
	
	public void aumentarVelocidade() {
		if (velocidade >= 0 && velocidade <= 200) {
			velocidade += 1;
		}
	}

	public void diminuirVelocidade() {
		if (velocidade > 0 && velocidade <= 200) {
			velocidade -= 1;
		}
	}
}
