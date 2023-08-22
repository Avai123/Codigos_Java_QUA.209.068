package principal;

import entities.Pessoa;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("vanessa");
		pessoa.setAnoNascimento(1999);
		


		System.out.println(pessoa.getIdade());
		
		pessoa.imprimeDados();
		
		

	}

}
