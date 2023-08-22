package entities;

public class Conta {

	private String titular;
	private String agencia;
	private int numeroconta;
	private double saldo;

	// get obter
	public String getTitualr() {
		return titular;
	}
	//set == atribui valor
	//this identifica o atributo da classe
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	//atalho = alt + shift = s vá até get

	public void depositar(double valorDeposito) {
		saldo += valorDeposito;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public int getNumeroconta() {
		return numeroconta;
	}
	public void setNumeroconta(int numeroconta) {
		this.numeroconta = numeroconta;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void sacar(double valorSaque) {
		saldo -= valorSaque;
	}
	public void obterDadosbancarios() {
		System.out.println("Titular: " + titular);
		System.out.println("Agencia: " + agencia);
		System.out.println("Conta: " + numeroconta);
		System.out.println("Saldo: " + saldo);
	}

}
