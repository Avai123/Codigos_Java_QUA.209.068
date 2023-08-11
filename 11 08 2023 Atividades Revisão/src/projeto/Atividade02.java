package projeto;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 2) Um posto está vendendo combustíveis com a seguinte tabela de descontos: 20
		 * litros, desconto de 3% por litro Álcool acima de 20 litros, desconto de 5%
		 * por litro até 20 litros, desconto de 4% por litro Gasolina acima de 20
		 * litros, desconto de 6% por litro Escreva um algoritmo que leia o número de
		 * litros vendidos e o tipo de combustível (codificado da seguinte forma:
		 * A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente
		 * sabendo-se que o preço do litro da gasolina é R$ 5,80 e o preço do litro do
		 * álcool é R$ 3,90.
		 */

		// scanner para fazer a leitura dos dados que o usuario vai inserir
		Scanner leia = new Scanner(System.in);

		// OBS. criar variaveis para receber os valores dos combustiveis
		double valorGasolina = 5.80;
		double valorAlcool = 3.90;

		// OBS Acriar uma variavel para receber a quantidade de litros
		double quantidadedeLitros = 0;

		// variavel para receber qual o tipo do combustivel
		char tipoCombustivel;

		// variavel total a pagar ja com o desconto
		double totalAPagar = 0;

		// pedir para o usuario digitar a quantidade de litros, qual o tipo de
		// combustivel
		// para saber o valor total a ser pago
		// validação para que o usuario não digite um combustivel invalido

		do {
			System.out.print("Qual o combustivel? (A/G) ");
			tipoCombustivel = leia.next().charAt(0);

		} while (Character.toUpperCase(tipoCombustivel) != 'A' && Character.toUpperCase(tipoCombustivel) != 'G');

		tipoCombustivel = Character.toUpperCase(tipoCombustivel);

		// pedir a quantidade de litros que foram abastecidos:
		// validade a quantidade de litros não pode ser zero nem negativo

		int quantidadeLitros;
		do {
			System.out.print("Quantos litros foram abastecidos? ");
			quantidadedeLitros = leia.nextDouble();
		} while (quantidadedeLitros <= 0);

		// fazer o calculo do desconto com base na quantidade de litros
		// que foi abastecido e o tipo de combustivel

		if (tipoCombustivel == 'G') {
			if (quantidadedeLitros <= 20) {
				totalAPagar = (quantidadedeLitros * valorGasolina);
				// totalAPagar = (totalAPagar *1.4);
				totalAPagar = totalAPagar - (totalAPagar * 0.04);
				System.out.println("Valor a ser pago com desconto: " + totalAPagar);

			} else {
				totalAPagar = (quantidadedeLitros * valorGasolina);
				totalAPagar = totalAPagar - (totalAPagar * 0.06);
				System.out.println("Valor a ser pago com desconto: " + totalAPagar);
			}
		}
		if (tipoCombustivel == 'A') {
			if (quantidadedeLitros <= 20) {
				totalAPagar = (quantidadedeLitros * valorAlcool);
				// totalAPagar = (totalAPagar *1.4);
				totalAPagar = totalAPagar - (totalAPagar * 0.03);
				System.out.println("Valor a ser pago com desconto: " + totalAPagar);

			} else {
				totalAPagar = (quantidadedeLitros * valorAlcool);
				totalAPagar = totalAPagar - (totalAPagar * 0.05);
				System.out.println("Valor a ser pago com desconto: R$ " + totalAPagar);
			}
		}
	}
}
