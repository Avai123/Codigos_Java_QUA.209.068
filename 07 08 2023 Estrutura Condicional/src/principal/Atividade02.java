package principal;

import java.util.Scanner;

public class Atividade02 {
	public static void main(String[] args) {
		
		//2 Fa�a um programa que entre com um n�mero e indique se ele � impar ou par;
		
		Scanner leia = new Scanner(System.in);
		int numero;
		
	
		System.out.print("Digite o numero para saber se � par ou �mpar:");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println(numero +  " � n�mero par.");
			
		} else{
			System.out.println(numero + " n�o � n�mero par.");
		
	}
	}
}
