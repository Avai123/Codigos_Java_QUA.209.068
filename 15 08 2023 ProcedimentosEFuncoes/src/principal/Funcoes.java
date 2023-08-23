package principal;

import java.io.PrintStream;
import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {

		/*
		 * FUN��ES fun��es representam um processamento ou processo; o que identifica
		 * uma fun��o � os parenteses; System.out.print() � um exemplo de
		 * fun��o/procedimento;
		 */

		mostrarMensagem();
		mostrarMensagemComparametro(33);
		System.out.println(calcular());
		int recebeCalcular = calcular();
		System.out.println("Recebeu: " + recebeCalcular);

		// Retornar dois parametros do tipo inteiro
		System.out.println("Resultado da soma: " + calcular1(25, 50));

		int c = 10;
		int y = 200;

		System.out.println("Nova soma: " + calcular());

		int a = 50;
		int b = 150;

		System.out.println("Nova soma: " + calcular());

	}

	static void mostrarMensagem() {
		System.out.println("Minha primeira fun��o");
	}

	static void mostrarMensagemComparametro(int idade) {
		System.out.println("Minha idade �: " + idade);
	}

	static int calcular() {
		Scanner sc = new Scanner(System.in);
		int x = 10;
		PrintStream y = System.out.printf("Digite o valor em real:  ");
		double valorReal = sc.nextDouble();
		return x;

	}

	// Retornar dois parametros do tipo inteiro
	static int calcular1(int x, int y) {
		return x + y;
	}

}
