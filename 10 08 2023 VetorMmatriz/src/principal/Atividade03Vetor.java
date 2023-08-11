package principal;

import java.util.Scanner;

public class Atividade03Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		/*Faça um programa que receba o nome do aluno e as 4 notas bimestrais desse aluno, mostre a media e 
		 * se foi aprovado (>=7) ou reprovado(<7);
		 */

		
	
		double[] notas = new double [4];
		System.out.println("Insira o nome do aluno: ");
		String nome = sc.nextLine();
		
		for(int contador = 0; contador < notas.length; contador++) {
			System.out.println("Entre com a nota: ");
			notas[contador] = sc.nextDouble();
			
					}
		double media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;
		System.out.printf("A media do %s é:  %.2f", nome, media);
		 
		if(media < 6) {
			System.out.println("Aluno reprovado! media: " + media);
		}else if(media >=6 && media < 7) {
			System.out.print("Aluno de recuperação! média: " + media);
		}else if(media>= 7 && media < 10){
		}else
		
		
		sc.close();
		
		
	}

}
