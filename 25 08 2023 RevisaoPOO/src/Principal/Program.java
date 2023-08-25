package Principal;

import entities.Funcionario;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa pessoa = new Pessoa();
		Funcionario func = new Funcionario();
		
		System.out.println("**************Dados Pessoais*************");
		
		pessoa.setNome("Vanessa");
		pessoa.setAltura(1.56);
		pessoa.setCpf("123.456.789.12");
		pessoa.setIdade(35);
		pessoa.setGenero("Feminino");
		
		System.out.println(pessoa);
		
		System.out.println("**************Dados Pessoais Empresa*************");
		
		func.setNome("Vanessa");
		func.setAltura(1.56);
		func.setCpf("123.456.789.12");
		func.setIdade(35);
		func.setGenero("Feminino");
		func.setSalario(1.000);
		func.setEmpresa("Senai");
		
		System.out.println(func);
		
	}

}
