package principal;

import java.util.Scanner;

public class Atividade02Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Fa�a um programa que pe�a quantidade x de nomes e mostre os nomes inseridos;
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de nomes que voc� deseja inserir: ");
		int quantidade = sc.nextInt();
		
				
		String [] nomes = new String [quantidade];
		
		for (int i = 0; i < quantidade; i++) {
			System.out.println("Digite o nome: ");
			nomes[i] = sc.next();
			
		}
		System.out.println("         LISTA DE NOMES      ");
		for (String nome: nomes) {
			
			System.out.println(nome);
		}
		
	}

}
