package projeto;

import java.util.Scanner;

public class OperadoresAtividade05 {

	public static void main(String[] args) {
		/* Uma empresa tem gastos mensais e a cada 3 meses realiza um balan�o para verificar a media de 
		 * gastos dos 3 meses. Fa�a um programa que receba os valores de cada m�s e imprima na tela o valor total 
		 * gasto no per�odo e a media dos gastos.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("************ M�dia Trimestral ************");
		
		System.out.print("Digite os gastos do m�s 1: R$ ");
		double mes1 = sc.nextDouble();
		
		System.out.print("Digite os gastos do m�s 2: R$ ");
		double mes2 = sc.nextDouble();
		
		System.out.print("Digite os gastos do m�s 3: R$ ");
		double mes3 = sc.nextDouble();
		
		double soma = mes1 + mes2 + mes3;
		double media = (mes1 + mes2 + mes3) / 3;
		
		
		
		System.out.println("A soma do trimesre �: R$ " + soma);
		System.out.println("A m�dia trimeste �: R$ " + media);
		

		
		
		 

	}

}
