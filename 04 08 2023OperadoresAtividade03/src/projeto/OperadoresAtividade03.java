package projeto;

import java.util.Scanner;

public class OperadoresAtividade03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		

		System.out.println("Digite o valor da sua hora aula: ");
		double numero1 = sc.nextDouble();
		
		System.out.println("Digite as horas trabalhadas no mês: ");
		double numero2 = sc.nextDouble();
		
		double multiplicacao = numero1 * numero2;
		
		System.out.println("O  valor à receber é: " + multiplicacao);
		
		sc.close();
	}
	
	

}
