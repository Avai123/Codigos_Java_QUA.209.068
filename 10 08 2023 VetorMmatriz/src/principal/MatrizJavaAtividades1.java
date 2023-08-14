package principal;

public class MatrizJavaAtividades1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1) Fazer uma matriz 3x3 ou 4x4, imprimir os numeros da diagonal dessa matriz;
		 */

		int[][] numeros = new int[3][3];

		int contador = 200;

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				numeros[i][j] = contador;
				if ((i == 0 && j == 0) || (i == 1 && j == 1) || (i == 2 && j == 2)) {
					System.out.print(numeros[i][j] + "\t");

				}else {
					System.out.print("\t");
				}
				contador++;
			}
			System.out.println();

		}

	}
}
