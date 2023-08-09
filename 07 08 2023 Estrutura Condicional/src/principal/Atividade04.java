package principal;

import java.util.Scanner;

public class Atividade04 {
	
	public static void main(String[] args) {
		
		//4 Faça um programa que leia 3 números e mostre o maior deles;
		Scanner leia = new Scanner(System.in);
		
		System.out.println ("Digite um número: ");
		int numero1 = leia.nextInt();
		
		System.out.println ("Digite um número: ");
		int numero2 = leia.nextInt();
		
		System.out.println ("Digite um número: ");
		int numero3 = leia.nextInt();
		
		if ((numero1 > numero2) && (numero1 > numero3)) {
			System.out.printf("%d é maior" , numero1);
						
		}else if ((numero2 > numero1) && (numero2 > numero3)) {
			System.out.printf("%d é maior ", numero2);
		}else if ((numero3 > numero1) && (numero3 > numero2)) {
			System.out.printf("%d é maior ", numero3);
		}
	}


}
