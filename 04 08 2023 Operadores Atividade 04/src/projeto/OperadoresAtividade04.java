package projeto;

import java.util.Scanner;

public class OperadoresAtividade04 {
	/*
	 * Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e
	 * mostre a temperatura em graus Celsius. F para C = 
	 * para seria o dado de entrada, já tem o
	 * resultado para conferir Faça um Programa que peça a temperatura em graus
	 * Celsius, transforme e mostre em graus Fahrenheit.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double temperatura = 0;
		double celsius = 0;
		double fahrenheit = 0;

		System.out.println("Digite o valor da temperatura em Fahrenheit: ");
		temperatura = sc.nextDouble();

		celsius = 5 * ((temperatura - 32) / 9);

		System.out.println("Digite o valor da temperatura em Celsius: ");
		temperatura = sc.nextDouble();

		fahrenheit = (1.8 * temperatura + 32);

		System.out.println("A temperatura convertida em Celsius é: " + celsius);
		System.out.println("A temperatura convertida em Fahrenheit é: " + fahrenheit);

	}

}
