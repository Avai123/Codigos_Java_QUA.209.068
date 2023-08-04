package projeto;

import java.util.Scanner;

public class OperadoresAtividade05 {

	public static void main(String[] args) {
		/* Uma empresa tem gastos mensais e a cada 3 meses realiza um balanço para verificar a media de 
		 * gastos dos 3 meses. Faça um programa que receba os valores de cada mês e imprima na tela o valor total 
		 * gasto no período e a media dos gastos.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("************ Média Trimestral ************");
		
		System.out.print("Digite os gastos do mês 1: R$ ");
		double mes1 = sc.nextDouble();
		
		System.out.print("Digite os gastos do mês 2: R$ ");
		double mes2 = sc.nextDouble();
		
		System.out.print("Digite os gastos do mês 3: R$ ");
		double mes3 = sc.nextDouble();
		
		double soma = mes1 + mes2 + mes3;
		double media = (mes1 + mes2 + mes3) / 3;
		
		
		
		System.out.println("A soma do trimesre é: R$ " + soma);
		System.out.println("A média trimeste é: R$ " + media);
		

		
		
		 

	}

}
