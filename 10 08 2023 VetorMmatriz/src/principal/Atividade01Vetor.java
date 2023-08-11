package principal;

public class Atividade01Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Faça um programa que mostre os índices de um array de 100 posições;
		 */

		int[] numeros = new int[10];
		int valor = 10;
		for(int contador = 0; contador < numeros.length; contador++) {
		
				numeros[contador] = valor;
				valor+= 10;
		}
		for(int n : numeros) {
			System.out.println(n);
		}
	}
}
