package projeto;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 4) Ler um vetor Q de 20 posições (aceitar somente números positivos), *caso
		 * não atenda a condição deve informar novamente o numero até que a condição
		 * seja aceita, ao final mostre os números inseridos no vetor e a soma deles.
		 */

		Scanner sc = new Scanner(System.in);

		int[] numeros = new int[2];
		int soma = 0;
		for (int contador = 0; contador < numeros.length; contador++) {
			
			do {
				
				System.out.println("Digite um numero: ");
				numeros[contador] = sc.nextInt();
				
				
			} while (numeros[contador] <= 0);
			
			numeros[contador] = sc.nextInt();
		
		}
		

		for (int numero : numeros) {
			System.out.println(numero);
		}
		sc.close();
	}
}
