
package principal;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		/*
		 * Fa�a um programa que receba um operador (+, -, /, *) e um numero e mostre a tabuada 
		 * conforme os dados de entrada (numero n�o pode ser maior que 10 e nem menor que 0)
		 */
		
		System.out.print("digite um n�mero para obter uma t�buada: ");
		int numero = sc.nextInt();
		
		System.out.print("Qual opera��o da t�buada voc� deseja: ");
		char operacao = sc.next().charAt(0);
		
		for (int i = 0; i <=10; i++) 
			if (operacao == '+') {
			System.out.printf("%d %c %d = %d\n", numero, operacao, i, numero + i);
		}else if (operacao == '-') {
			System.out.printf("%d %c %d = %d\n", numero, operacao, i, numero + i);
		}else if (operacao == '/') {
			System.out.printf("%d %c %d = %d\n", numero, operacao, i, numero + i);
		}else if (operacao == '*') {
			System.out.printf("%d %c %d = %d\n", numero, operacao, i, numero + i);
		}
	
		
			sc.close();
	}
	}


