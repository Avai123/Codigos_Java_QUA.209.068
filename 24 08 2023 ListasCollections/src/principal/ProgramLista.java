package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProgramLista {

	// Faça um programa que receba o nome de 5 pessoas e imprima na ordem alfabética
	// (usar o Scanner, não precisa de classe);

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> nomes = new ArrayList<>();

		System.out.println("Digite o primeiro nome: ");
		nomes.add(sc.nextLine());
		System.out.println("Digite o segundo nome: ");
		nomes.add(sc.nextLine());
		System.out.println("Digite o terceiro nome: ");
		nomes.add(sc.nextLine());
		System.out.println("Digite o quarto nome: ");
		nomes.add(sc.nextLine());
		System.out.println("Digite o quinto nome: ");
		nomes.add(sc.nextLine());
		
		Collections.sort(nomes);

		System.out.println("Ignorado case sensitive:");
		Collections.sort(nomes, String.CASE_INSENSITIVE_ORDER);
		nomes.forEach(nome -> System.out.println(nome));
		
		
	
	}

}
