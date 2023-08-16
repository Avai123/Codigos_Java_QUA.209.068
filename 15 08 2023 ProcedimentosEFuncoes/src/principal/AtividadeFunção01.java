package principal;

import java.util.Scanner;

public class AtividadeFunção01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crie um programa qye receba os valores de largura e comprimento do terreno e
		 * informa quanto metro quadrado ele tem. Utilize função.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a comprimento do terreno:  ");
		double comprimento = sc.nextDouble();

		System.out.print("Digite a largura do terreno:  ");
		double largura = sc.nextDouble();

		sc.close();

		System.out.print("A metragem do terreno é igual a: " + calcular(largura, comprimento) + "mª");
	}

	static double calcular(double largura, double comprimento) {
		return largura * comprimento;

	}
}
