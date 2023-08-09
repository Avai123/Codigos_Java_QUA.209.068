package principal;

import java.util.Scanner;

public class Atividade07 {
	
	public static void main(String[] args) {

	//7 Faça um programa que leia 4 notas de um e retorne a media, se a media for menor que 6 está reporvado, 
		Scanner leia = new Scanner(System.in);
		
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double nota4 = 0;
		double media = 0;
		
		System.out.print("Entre com a primeira nota: ");
		nota1 = leia.nextDouble();
		
		System.out.print("Entre com a primeira nota: ");
		nota2 = leia.nextDouble();
		
		System.out.print("Entre com a primeira nota: ");
		nota3 = leia.nextDouble();
		
		System.out.print("Entre com a primeira nota: ");
		nota4 = leia.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4) /4;
		
		if(media < 6) {
			System.out.println("Aluno reprovado! media: " + media);
		}else if(media >=6 && media < 7) {
			System.out.println("Aluno de recuperação! média: " + media);
		}else if(media>= 7 && media < 10){
		}else
			System.out.println("Aluno aprovado com honras! media: " + media);
			
		}
			

		
		
		
	
	}
