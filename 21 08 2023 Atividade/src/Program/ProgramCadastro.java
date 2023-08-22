package Program;

import java.util.Scanner;

import entities.Cadastro;

public class ProgramCadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// crie um programa que receba o nome, o e-mail e a senha do usuário, o usuário
		// só poderá alterar a senha
		// através de um método e a senha não pode ser mostrada na tela principal do
		// programa;

		Scanner sc = new Scanner(System.in);

		Cadastro cadastro = new Cadastro();

		System.out.print("Digite o seu nome: ");
		cadastro.setNome(sc.nextLine());
		
		System.out.print("Digite seu e mail: ");
		cadastro.setEmail(sc.nextLine());
		
		System.out.print("Digite sua senha: ");
		cadastro.setSenha(sc.nextLine());
		
		cadastro.obterDados();
		
	}

}
