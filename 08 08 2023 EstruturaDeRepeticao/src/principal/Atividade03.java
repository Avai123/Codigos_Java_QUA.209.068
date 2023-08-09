package principal;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		/*
		 * Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
		 */
		
		

		for (int numero = 1; numero < 50; numero++) {
		    if (numero % 2 != 0) {
		        System.out.print("Numero valido! Número impar:");
		        System.out.println(numero);
		    }
		    		} 
		/*
		 * outra opção
		 */
		for(int contador = 1; contador <= 50; contador +=2) {
			System.out.println(contador);
		}
		{
		int a = 10;
		System.out.println(a);
		int b = a++;
		System.out.println(b);
		int c = ++a;
		System.out.println(c);
		
	}
	}
}
	


