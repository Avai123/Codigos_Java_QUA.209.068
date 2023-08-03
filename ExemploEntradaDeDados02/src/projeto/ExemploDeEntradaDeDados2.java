package projeto;

import java.util.Scanner;

public class ExemploDeEntradaDeDados2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		final double PI = 3.4115;
		String nome;
		String sobrenome;
		String endereço;
		int idade;
		double altura;
		char sexo;
		String Telefone;
		
		System.out.print("Por favor, digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.print("Por favor, digite seu sobrenome: ");
		sobrenome = leia.nextLine();
		
		System.out.print("Digite seu endereço: ");
		endereço = leia.nextLine();
		
		System.out.print("Digite o numero do telefone: ");
		Telefone = leia.nextLine();
		
		System.out.print("Digite dua idade: ");
		idade = leia.nextInt();
		
		System.out.print("Digite sua altura: ");
		altura = leia.nextDouble();
		
		System.out.print("Digite o seu sexo: ");
		sexo = leia.next().charAt(0);
		
		System.out.println("O nome digitado foi: " +nome);
		System.out.println("O sobrenome digitado foi: " +sobrenome);
		System.out.println("O endereço digitado foi: " +endereço);
		System.out.println("O telefone digitado foi: " +Telefone);
		System.out.println("A idade digitada foi: " +idade);
		System.out.println("A altura digitada foi: " +altura);
		System.out.println("O sexo digitado foi: " +sexo);
		
		leia.close();

	}

}
