package principal;

import java.util.Scanner;

public class Atividade01 {
	public static void main(String[] args) {
		
		//1 Fa�a um programa que pe�a para o usu�rio entrar com um ano e dizer se esse ano � bissexto ou n�o;
		
		Scanner leia = new Scanner(System.in);
		int ano;
		
		System.out.println("Digite o ano:");
		ano = leia.nextInt();
		
		if(ano % 400 == 0) {
			System.out.println(ano + " � bissexto.");
			
		}
		else if ((ano % 4 == 0) && (ano % 100 != 0)){
			System.out.println(ano + " � bissexto.");
		}
		else{
			System.out.println(ano + "n�o � bissexto");
		}
		
		
		
				
					
		
		
					
					
					
					
		
		
		//5 Fa�a um programa que receba o sexo de um a pessoa e imprima na tela o sexo digitado;
		
		//6 Fa�a um programa que leia 4 notas de um e retorne a media, se a media for menor que 6 est� reporvado, 
	}
	

}
