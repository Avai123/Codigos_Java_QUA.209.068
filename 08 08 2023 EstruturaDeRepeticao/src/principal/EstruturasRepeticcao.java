package principal;

import java.util.Scanner;

public class EstruturasRepeticcao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		/*
		 * Uma estrutura de repetiçao
		 * repete determinado bloco de codigo enquato
		 * uma condição for satisfeita
		 */
		
		//for = até; utilizado quando sabemos 
		//a quatidade de vezes que será necessario repetir o bloco
		
		for(int contador = 0; contador < 10; contador++) {
			System.out.println("Contador está valendo: " + contador);
			
		}
		/*while = enquanto
		 * geralmente usado quando não sabemos a quantidade de
		 * vezes que será executado determinado comando
		 */
		int contador = 0;
		char opcao;
		
		System.out.println("Deseja entrar no loop s/n");
		opcao = leia.next().charAt(0);
		
		
		while(opcao == 's') {
			System.out.println("Contador valendo: " + contador);
			contador++;
			System.out.println("Deseja continuar no loop s/n");
			opcao = leia.next().charAt(0);
			
		}
				
		/* do while
		 * executa pelo menos 1vez, temos a garantia que será
		 * executado ao menos uma vez
		 */
		
		do {
			System.out.println("Contador valendo: " + contador);
					contador++;
			System.out.println("Deseja continuar no loop s/n");
					opcao = leia.next().charAt(0);		
		} while(opcao == 's');
		
		leia.close();
	}


	

	
}
