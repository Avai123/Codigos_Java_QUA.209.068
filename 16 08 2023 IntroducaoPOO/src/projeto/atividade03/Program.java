package projeto.atividade03;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Faça um programa que receba 3 valores e indique/retorne que tipo de triangulo
		 * ele pode ser;
		 */

		Scanner sc = new Scanner(System.in);

		Triangulo tr = new Triangulo();

		System.out.println("Digite o lado 1 do triangulo:");
		tr.lado1 = sc.nextDouble();

		System.out.println("digite o lado 2 do triangulo:");
		tr.lado2 = sc.nextDouble();

		System.out.println("Digite o lado 3 do triangulo:");
		tr.lado3 = sc.nextDouble();

		System.out.println(tr.obterNomeDoTriangulo(tr.lado1, tr.lado2, tr.lado3));
		sc.close();
	}

}
