package principal;

import java.util.Scanner;

public class Atividade01 {
	public static void main(String[] args) {
		
		//1 Faça um programa que peça para o usuário entrar com um ano e dizer se esse ano é bissexto ou não;
		
		Scanner leia = new Scanner(System.in);
		int ano;
		
		System.out.print("Digite o ano:");
		ano = leia.nextInt();
		
		if(ano % 400 == 0) {
			System.out.println(ano + " é bissexto.");
			
		}
		else if ((ano % 4 == 0) && (ano % 100 != 0)){
			System.out.println(ano + " é bissexto.");
		}
		else{
			System.out.println("não é bissexto");
		}	
			
		}
		
		
		
				
					
		
		
					
					
					
					
		
		
		
		
	

}
