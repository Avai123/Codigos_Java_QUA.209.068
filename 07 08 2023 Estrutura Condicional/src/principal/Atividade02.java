package principal;

import java.util.Scanner;

public class Atividade02 {
	public static void main(String[] args) {
		
		//2 Fa�a um programa que entre com um n�mero e indique se ele � impar ou par;
		
		Scanner leia = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite o numero:");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println(numero +  " par.");
			
		} else{
			System.out.println("n�o � par");
		
	}
	}
}
