package projeto;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*3) Escreva um algoritmo para ler 2 valores e se algum dos valores for zero não aceite, deve ser lido
		*um novo valor, imprimir o resultado da divisão do primeiro valor lido pelo 
		*segundo valor lido. (utilize a estrutura de repetição que mais se adeque).
		*/
		
		
		Scanner sc = new Scanner(System.in);
		
		double numero1, numero2;
		
		
		
		do {
			System.out.print("Digite um número: ");
			numero1 = sc.nextDouble();
		}while (numero1 == 0);

		do {
			System.out.print("Digite um número: ");
			numero2 = sc.nextDouble();
		}while (numero2 == 0);
		

		
		double divisão =  (numero1 / numero2);
		System.out.println("O resultado da divisão é: " + divisão);
		}

		
}


