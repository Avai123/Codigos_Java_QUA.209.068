package projeto;

import java.util.Scanner;

public class OperadoresAtividade02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a nota do 1� bimestre: ");
		double nota1 = sc.nextDouble();
		
		System.out.println("Digite a nota do 2� bimestre: ");
		double nota2 = sc.nextDouble();
		
		System.out.println("Digite a nota do 3� bimestre ");
		double nota3 = sc.nextDouble();
		
		System.out.println("Digite a nota do 4� bimestre: ");
		double nota4 = sc.nextDouble();
		
		double media = nota1 + nota2 + nota3 + nota4;
		double calculo = (nota1 + nota2 + nota3 + nota4) / 4;	
		
		System.out.println("A m�dia bimstral �: " + media);
		
		sc.close();
		
	}

}
