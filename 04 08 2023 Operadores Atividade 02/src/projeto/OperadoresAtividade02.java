package projeto;

import java.util.Scanner;

public class OperadoresAtividade02 {
	//Faça um Programa que peça as 4 notas bimestrais e mostre a média.

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a nota do 1º bimestre: ");
		double nota1 = sc.nextDouble();
		
		System.out.println("Digite a nota do 2º bimestre: ");
		double nota2 = sc.nextDouble();
		
		System.out.println("Digite a nota do 3º bimestre ");
		double nota3 = sc.nextDouble();
		
		System.out.println("Digite a nota do 4º bimestre: ");
		double nota4 = sc.nextDouble();
		
		double media = nota1 + nota2 + nota3 + nota4;
		double calculo = (nota1 + nota2 + nota3 + nota4) / 4;	
		
		System.out.println("A média bimstral é: " + media);
		
		sc.close();
		
	}

}
