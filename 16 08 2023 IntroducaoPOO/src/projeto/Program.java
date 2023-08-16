package projeto;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// conceito de carros
		
		String modelo = "onix";
		String placa = "xyz-9955";
		String cor = "azul";
		String ano = "2023";
				
		//caracteristicas(atributos)
		//exemplo de comportamentos acelerar, freiar, acender farois.
		//comportamentos (metodos/função)
		//classes tem muitos recursos como:
		//sobrecarga de metodos e construtoes
		//4 pilares podem ser aplicados
		//entities (entidades do sistema) de acordo com a modelagem
		//de negocios: carro, Pessoa, endereço...
		//Services: clientServices, E-mail serviços...
		//controllers
		//utilitarias: Match
		//classe é um molde para o objeto
		
		Scanner sc = new Scanner(System.in);
		
		Carro carro = new Carro();
		Carro carroPopular = new Carro();
		
		carro.modelo = "celta";
		carro.ano = "2010";
		carro.placa = "xpt-2023";
		carro.cor = "azul";
		
		carroPopular.modelo = "gol";
		carroPopular.cor = "vermelho";
		
		/*carroPopular.ano = sc.nextLine();
		
		
		System.out.println(carro.ano);
		System.out.println(carroPopular.ano);*/
		
		System.out.println(carro.acelerar);
		carro.acelerarVeiculo();
		carro.acelerarVeiculo();
		carro.acelerarVeiculo();
		carro.acelerarVeiculo();
		
		System.out.println(carro.acelerar);
		
		

	}

}
