package principal;

import java.util.Scanner;

public class Ativiade02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 2 fa�a um programa que imprima na tela os n�meros de 1 a 20, um abaixo do outro. 
		 * depois modifique o programa para que ele mostre os n�mores um ao lado do outro.
		 */

		
	
		for(int contador = 1; contador <= 20; contador++) {
			System.out.println("Contador est� valendo: " + contador);
		}
		
		for(int contador = 1; contador <= 20; contador++) {
			System.out.print(contador + ", ");
		}
	}

}
