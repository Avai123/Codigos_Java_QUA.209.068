package principal;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		/*
		 * 1 Fa�a um programa que pe�a uma nota, entre zero e dez. Mostre uma mensagem
		 * caso o valor seja inv�lido e continue pedindo at� que o usu�rio informe o
		 * valor v�lido.
		 */

		System.out.print("Por favor, digite a sua nota entre 0 e 10: ");
		double numero = leia.nextDouble();

		while (numero < 0 || numero > 10) {
			System.out.print("Voc� digitou n�mero invalido, digite novamente. ");
			numero = leia.nextDouble();
		}
		System.out.println("          Parab�ns, voc� Digitou o n�mero correto!        ");
	}

}
