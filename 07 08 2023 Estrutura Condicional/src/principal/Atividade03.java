package principal;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		
		//3 Faça um programa que leia dois números e imprima o maior deles;
		Scanner leia = new Scanner(System.in);
		
		System.out.println ("Digite um número: ");
		int numero1 = leia.nextInt();
		
		System.out.println ("Digite um número: ");
		int numero2 = leia.nextInt();
		
		if (numero1 > numero2) {
			System.out.printf("%d é maior que %d\n", numero1, numero2);
						
		}else if (numero1 < numero2) {
			System.out.printf("%d é menor que %d\n", numero1, numero2);
		}
		
		
		leia.close();

	}

	
}
