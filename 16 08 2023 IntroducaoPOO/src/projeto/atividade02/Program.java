package projeto.atividade02;

import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Faça um programa que receba o nome e o ano de nascimento e retorne a idade
		 * atual do usuário;
		 */

		Scanner sc = new Scanner(System.in);

		Usuario usuario1 = new Usuario();
		System.out.println("digite seu nome: ");
		usuario1.nome = sc.next();

		System.out.println("Digite o ano de nascimento: ");
		usuario1.anoNascimento = sc.nextInt();

		System.out.println(usuario1.obterIdade());
		sc.close();
	}

}
