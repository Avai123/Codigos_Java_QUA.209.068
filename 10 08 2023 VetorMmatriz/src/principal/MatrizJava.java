package principal;

public class MatrizJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Uma matriz é um vetor multidimensional
		//geralmente trabalhamos com 2 dimensões
		//linha e coluna, parece uma tabela
		
		//os 2 ultimos abre e fecha colchonetes são para indicar coluna e linha
		//no exemplo abaixo temos uma matriz 3x3
		int[][]numeros = new int[3][3];
		
		int contador = 10;
		
	 /*for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros.length; j++) {
				numeros[i][j] = contador;
				System.out.print(numeros [i][j] + "\t");
				contador++;
						}
			System.out.println();
			
		} */
		
		System.out.print((numeros [1] [0] = 13) +"\t" );
		System.out.print((numeros [1] [1] = 14) +"\t" );
		System.out.print((numeros [1] [2] = 15) +"\t" );
		System.out.println();
		System.out.print((numeros [2] [0] = 16) +"\t" );
		System.out.print((numeros [2] [1] = 17) +"\t" );
		System.out.print((numeros [2] [2] = 18) +"\t" );
		System.out.println();
		
				
	};
}
