package principal;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*
		 * Fa�a um programa que receba dois n�meors inteiros e gere os n�meros inteiros 
		 * que est�o no intervalo compreendidos por ele
		 */
		
		int num1 = 0;
		int num2 = 0;
		System.out.println("Entre com o primeiro n�mero: ");
		num1 = sc.nextInt();
		
		System.out.println("entre com o primeiro n�mero: ");
		num2 = sc.nextInt();
		
		for (int contador = num1; contador < num2; contador++) {
			System.out.print(" "  + contador);
		}
		
				
		
		
		sc.close();
	}

}
