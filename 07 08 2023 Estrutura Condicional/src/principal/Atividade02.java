package principal;

import java.util.Scanner;

public class Atividade02 {
	public static void main(String[] args) {
		
		//2 Faça um programa que entre com um número e indique se ele é impar ou par;
		
		Scanner leia = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite o numero:");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println(numero +  " par.");
			
		} else{
			System.out.println("não é par");
		
	}
	}
}
