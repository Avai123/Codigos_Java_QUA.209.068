package projeto;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*3) Escreva um algoritmo para ler 2 valores e se algum dos valores for zero n�o aceite, deve ser lido
		*um novo valor, imprimir o resultado da divis�o do primeiro valor lido pelo 
		*segundo valor lido. (utilize a estrutura de repeti��o que mais se adeque).
		*/
		
		
		Scanner sc = new Scanner(System.in);
		
		double numero1, numero2;
		
		
		
		do {
			System.out.print("Digite um n�mero: ");
			numero1 = sc.nextDouble();
		}while (numero1 == 0);

		do {
			System.out.print("Digite um n�mero: ");
			numero2 = sc.nextDouble();
		}while (numero2 == 0);
		

		
		double divis�o =  (numero1 / numero2);
		System.out.println("O resultado da divis�o �: " + divis�o);
		}

		
}


