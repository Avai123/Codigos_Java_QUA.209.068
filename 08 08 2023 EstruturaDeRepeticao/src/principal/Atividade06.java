
package principal;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		/*
		 * Faça um programa que receba um operador (+, -, /, *) e um numero e mostre a tabuada 
		 * conforme os dados de entrada (numero não pode ser maior que 10 e nem menor que 0)
		 */
		
		System.out.print("digite um número para obter uma tábuada: ");
		int numero = sc.nextInt();
		
		System.out.print("Qual operação da tábuada você deseja: ");
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


