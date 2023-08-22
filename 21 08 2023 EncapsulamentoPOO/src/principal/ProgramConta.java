package principal;

import entities.Conta;

public class ProgramConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta conta = new Conta();
		
		conta.setTitular("Vanessa");
		//System.out.println("Nome do titular" = + conta.getTitular())
		
		conta.setAgencia("3413-4");
		conta.setNumeroconta(140448);
		//conta.setSaldo = 350.00; não funciona mais
		
		conta.depositar(300.00);		
		conta.obterDadosbancarios();
		
		System.out.println("Extrato Bancário\n\n" );
		
		conta.sacar(500.00);
		conta.obterDadosbancarios();
		
		
		
		

	}

}
