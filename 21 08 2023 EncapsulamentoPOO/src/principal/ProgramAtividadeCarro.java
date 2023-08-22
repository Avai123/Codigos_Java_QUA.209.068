package principal;

import java.util.Scanner;

import entities.AtividadeCarro;

//1) crie um programa que receba os dados de um carro com os seguintes atributos: modelo, ano, cor, motor, cambio e velocidade e os métodos para aumentar e diminuir a velocidade; use scanner

public class ProgramAtividadeCarro {

	private static String velocidade;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		AtividadeCarro carro = new AtividadeCarro();

		System.out.print("Qual o carro: ");
		carro.setNome(sc.next());

		System.out.print("Qual o modelo: ");
		carro.setModelo(sc.next());

		System.out.print("Qual a cor: ");
		carro.setCor(sc.next());

		System.out.print("Qual a marca: ");
		carro.setMarca(sc.next());

		System.out.print("Qual o ano de Fabricação: ");
		carro.setAnoFabricacao(sc.nextInt());

		System.out.print("Qual o cambio: ");
		carro.setCambio(sc.next());

		System.out.print("Qual a velocidade atual: ");
		carro.setVelocidade(sc.nextInt());

		carro.getDadosVeiculos();

	}

}
