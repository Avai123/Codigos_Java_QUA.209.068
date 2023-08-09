package principal;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		/*
		 * 1 Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem
		 * caso o valor seja inválido e continue pedindo até que o usuário informe o
		 * valor válido.
		 */

		System.out.print("Por favor, digite a sua nota entre 0 e 10: ");
		double numero = leia.nextDouble();

		while (numero < 0 || numero > 10) {
			System.out.print("Você digitou número invalido, digite novamente. ");
			numero = leia.nextDouble();
		}
		System.out.println("          Parabéns, você Digitou o número correto!        ");
	}

}
