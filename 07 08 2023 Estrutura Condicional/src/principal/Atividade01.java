package principal;

import java.util.Scanner;

public class Atividade01 {
	public static void main(String[] args) {
		
		//1 Fa�a um programa que pe�a para o usu�rio entrar com um ano e dizer se esse ano � bissexto ou n�o;
		
		Scanner leia = new Scanner(System.in);
		int ano;
		
		System.out.print("Digite o ano:");
		ano = leia.nextInt();
		
		if(ano % 400 == 0) {
			System.out.println(ano + " � bissexto.");
			
		}
		else if ((ano % 4 == 0) && (ano % 100 != 0)){
			System.out.println(ano + " � bissexto.");
		}
		else{
			System.out.println("n�o � bissexto");
		}	
			
		}
		
		
		
				
					
		
		
					
					
					
					
		
		
		
		
	

}
