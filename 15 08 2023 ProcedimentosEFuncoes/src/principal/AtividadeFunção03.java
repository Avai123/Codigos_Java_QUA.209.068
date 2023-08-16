package principal;

import java.util.Scanner;

public class AtividadeFunção03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		/*
		 * Faça um programa que receba o salario e a quantidade de venda total que o
		 * vendedor fez no mes, e calcule o salario do mês. Há também o desconto de 5%
		 * de inss e 11% de IRPF sobre o salario bruto. o vendedor possui o total de
		 * venda acima de 20 mil no mês, ele recebe uma bonificação de 5% sobre o valor
		 * das vendas; Se o vendedor possui o total de venda entre 15 e 20 mil reais,
		 * recebe uma bonificação de 3% no valor da venda; Se o vendedor possui o total
		 * de venda entre 10 e 15 mil reais, recebe uma bonificação de 1% no valor da
		 * venda; Se o valor não passar de 10 mil, imprima uma frase motivacional; Todos
		 * os funcionários devem ter o contracheques detalhado, funcionários que
		 * receberam bonificações não devem ter descontos sobre a bonificação, indicando
		 * o mês de referencia; proventos salário ..... bonificação acima 20.000 5%
		 * bonificação 15 e 20.000 3% bonificação 10 e 15.000 1% bonificação abaixo de
		 * 10.000 frase motivacional descontos 5% inss 11% IRRF
		 */

		System.out.print("Digite o valor do salário:R$  ");
		double valorsalário = sc.nextDouble();

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
		System.out.println("O valor do bonus é: R$ " + bonus);
		System.out.printf(" O valor do IRRF é:R$ %.2f\n", (valorsalário + bonus) * IRRF);
		System.out.printf(" O valor do INSS é:R$ %.2f\n", (valorsalário + bonus) * INSS);
		System.out.printf("O valor do Salário Liquido é:R$ %2f\n\n\n\n", (valorsalário + bonus) - IRRF - INSS);
		
		
		
		
		System.out.println("       CONTRA CHEQUE        \n");
		System.out.println("Salário:  R$ " + valorsalário);
		System.out.println("Comissão: R$ " + bonus);
		System.out.println("           IRRF: R$ " + (valorsalário + bonus) * IRRF);
		System.out.println("           INSS: R$ " + (valorsalário + bonus) * INSS);
		System.out.printf(                        "Valor Liquido: R$ %.2f " , (valorsalário + bonus) - IRRF - INSS);
	}
		
}
