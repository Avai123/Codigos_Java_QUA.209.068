package projeto;

import entties.Funcionarios;
import entties.Gerente;

public class ProgramRevisaoGeral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crie uma programa que fa�a o cadastro de funcion�rios, se o funcion�rio tiver
		 * um cargo de chefia ele 5% de bonifica��o sobre o salario bruto. Mostre os
		 * dados dos funcion�rios cadastrados, salario bruto, idade, e quando houver,
		 * imprima o salario com o valor da bonifica��o descrito;
		 */

		Funcionarios funcionarios = new Funcionarios();
		Funcionarios gerente = new Gerente();
		
		funcionarios.setNome("Marcos");
		funcionarios.setFuncao("Vendedor");
		funcionarios.setIdade(25);
		funcionarios.setSalario(1250);
		

		funcionarios.obterDadosFuncionarios();
		
		gerente.setNome("Marcos");
		gerente.setFuncao("gerente");
		gerente.setIdade(25);
		gerente.setSalario(1250);
		
       
		gerente.obterDadosFuncionarios();

	}

}
