package principal;

import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta conta = new Conta();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		Conta cp1 = new ContaPoupanca();

		conta.setTitular("Vanessa");
		conta.setAgencia(3413);
		conta.setNumeroConta(140449);
		conta.depositar(150.25);
		conta.sacar(50.00);

		conta.obterDadosBancarios();
		

		System.out.println("\n////////Conta corrente: //////");
		

		cc.setTitular("Vanessa");
		cc.setAgencia(3413);
		cc.setNumeroConta(140449);
		cc.depositar(550.95);
		cc.sacar(250.00);

		cc.obterDadosBancarios();
		
		System.out.println("\n////////Conta Poupanca: //////");

		cp.setTitular("Vanessa");
		cp.setAgencia(3413);
		cp.setNumeroConta(140449);
		cp.depositar(550.95);
		cp.sacar(250.00);

		cp.obterDadosBancarios();
		
		System.out.println("\n////////Conta Poupanca: //////");

		cp1.setTitular("Vanessa");
		cp1.setAgencia(3413);
		cp1.setNumeroConta(140449);
		cp1.depositar(550.95);
		cp1.sacar(250.00);

		cp1.obterDadosBancarios();

		
	}

}
