package principal;

import java.util.Scanner;

public class MatrizJavaAtividades2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		/*
		 * 2) Fazer uma matriz 4x4 apra inserir nome e as 4 notas do aluno, não precisa
		 * mostrar a média, imprima o nome e a média;
		 */

		String[][] nome = new String[5][6];
		double media = 0;

		for (int i = 0; i < nome.length; i++) {
			media = 0;
			for (int j = 0; j < nome[i].length; j++) {
				if (j == 0) {
					System.out.print("Digite o nome do " + (i + 1) + " aluno: ");
					nome[i][j] = sc.next();
				} else if (j != 5){
					System.out.print("Digite a nota " + j + " do " + (i + 1) + " aluno: ");
					nome[i][j] = sc.next();
					media += Double.parseDouble(nome[i][j]);
					nome[i][5] = Double.toString(media);
				} else {
					media += Double.parseDouble(nome[i][j]);
					media = media / 4;
					nome[i][5] = Double.toString(media);
				}
			}
		}
		System.out.println("TABELA DE NOTAS");
		System.out.println("NOME          NOTA 01         NOTA02         NOTA03            NOTA04        TOTAL");
		for (int i = 0; i < nome.length; i++) {
			for (int j = 0; j < nome[i].length; j++) {

				System.out.print(nome[i][j] + "\t");

				System.out.print("\t");
			}

			System.out.println();
		}

	}

}
