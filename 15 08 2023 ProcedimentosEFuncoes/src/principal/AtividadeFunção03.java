package principal;

import java.util.Scanner;

public class AtividadeFun��o03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		/*
		 * Fa�a um programa que receba o salario e a quantidade de venda total que o
		 * vendedor fez no mes, e calcule o salario do m�s. H� tamb�m o desconto de 5%
		 * de inss e 11% de IRPF sobre o salario bruto. o vendedor possui o total de
		 * venda acima de 20 mil no m�s, ele recebe uma bonifica��o de 5% sobre o valor
		 * das vendas; Se o vendedor possui o total de venda entre 15 e 20 mil reais,
		 * recebe uma bonifica��o de 3% no valor da venda; Se o vendedor possui o total
		 * de venda entre 10 e 15 mil reais, recebe uma bonifica��o de 1% no valor da
		 * venda; Se o valor n�o passar de 10 mil, imprima uma frase motivacional; Todos
		 * os funcion�rios devem ter o contracheques detalhado, funcion�rios que
		 * receberam bonifica��es n�o devem ter descontos sobre a bonifica��o, indicando
		 * o m�s de referencia; proventos sal�rio ..... bonifica��o acima 20.000 5%
		 * bonifica��o 15 e 20.000 3% bonifica��o 10 e 15.000 1% bonifica��o abaixo de
		 * 10.000 frase motivacional descontos 5% inss 11% IRRF
		 */

		System.out.print("Digite o valor do sal�rio:R$  ");
		double valorsal�rio = sc.nextDouble();

		System.out.print("Digite o valor da venda:R$ ");
		double valorvenda = sc.nextDouble();
		double bonus = 0;
		double IRRF = .11;
		double INSS = .05;

		if (valorvenda > 20.000) {
			bonus = valorvenda * .05;
		} else if (valorvenda > 15.0000 && valorvenda < 20.000) {
			bonus = valorvenda * .03;
		} else if (valorvenda > 10.0000 && valorvenda < 15.000) {
			bonus = valorvenda * .01;
		} else if (valorvenda > 0 && valorvenda < 10.000) {
			System.out.println("Vamos vender mais!");

		}
		System.out.println("O valor do bonus �: R$ " + bonus);
		System.out.printf(" O valor do IRRF �:R$ %.2f\n", (valorsal�rio + bonus) * IRRF);
		System.out.printf(" O valor do INSS �:R$ %.2f\n", (valorsal�rio + bonus) * INSS);
		System.out.printf("O valor do Sal�rio Liquido �:R$ %2f\n\n\n\n", (valorsal�rio + bonus) - IRRF - INSS);
		
		
		
		
		System.out.println("       CONTRA CHEQUE        \n");
		System.out.println("Sal�rio:  R$ " + valorsal�rio);
		System.out.println("Comiss�o: R$ " + bonus);
		System.out.println("           IRRF: R$ " + (valorsal�rio + bonus) * IRRF);
		System.out.println("           INSS: R$ " + (valorsal�rio + bonus) * INSS);
		System.out.printf(                        "Valor Liquido: R$ %.2f " , (valorsal�rio + bonus) - IRRF - INSS);
	}
		
}
