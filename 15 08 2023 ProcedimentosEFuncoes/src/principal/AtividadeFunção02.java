package principal;

import java.util.Scanner;

public class AtividadeFun��o02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Fa�a um programa que receba um valor em real e converta para d�lares na
		 * cota��o atual, fa�a o inverso tamb�m;
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor em real para converter em dollar:R$  ");
		double valorreal = sc.nextDouble();
		
		System.out.printf("O valor em dollar �: $%.2f\n " , calculardollar(valorreal));
		
		System.out.print("Digite o valor em dollar para converter em real:$  ");
		double valordollar = sc.nextDouble();
				
		System.out.printf("O valor em real �: R$%.2f " , calcularreal(valordollar));
		sc.close();
	}

	static double calculardollar(double valorreal) {
		return valorreal / 4.99;
	}
	
	static double calcularreal(double valordollar) {
		return 4.99 * valordollar;
	}
	
}
