package principal;

import java.util.Scanner;

public class Atividade02 {
	public static void main(String[] args) {
		
		//2 Faça um programa que entre com um número e indique se ele é impar ou par;
		
		Scanner leia = new Scanner(System.in);
		int numero;
		
	
		System.out.print("Digite o numero para saber se é par ou ímpar:");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println(numero +  " é número par.");
			
		} else{
			System.out.println(numero + " não é número par.");
		
	}
	}
}
