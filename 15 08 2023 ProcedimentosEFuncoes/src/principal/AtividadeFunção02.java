package principal;

import java.util.Scanner;

public class AtividadeFunção02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Faça um programa que receba um valor em real e converta para dólares na
		 * cotação atual, faça o inverso também;
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor em real para converter em dollar:R$  ");
		double valorreal = sc.nextDouble();
		
		System.out.printf("O valor em dollar é: $%.2f\n " , calculardollar(valorreal));
		
		System.out.print("Digite o valor em dollar para converter em real:$  ");
		double valordollar = sc.nextDouble();
				
		System.out.printf("O valor em real é: R$%.2f " , calcularreal(valordollar));
		sc.close();
	}

	static double calculardollar(double valorreal) {
		return valorreal / 4.99;
	}
	
	static double calcularreal(double valordollar) {
		return 4.99 * valordollar;
	}
	
}
