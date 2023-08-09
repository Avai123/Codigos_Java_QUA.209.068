package principal;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*
		 * Faça um programa que receba dois númeors inteiros e gere os números inteiros 
		 * que estão no intervalo compreendidos por ele
		 */
		
		int num1 = 0;
		int num2 = 0;
		System.out.println("Entre com o primeiro número: ");
		num1 = sc.nextInt();
		
		System.out.println("entre com o primeiro número: ");
		num2 = sc.nextInt();
		
		for (int contador = num1; contador < num2; contador++) {
			System.out.print(" "  + contador);
		}
		
				
		
		
		sc.close();
	}

}
