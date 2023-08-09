package principal;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		
		//6 Faça um programa que receba o sexo de um a pessoa e imprima na tela o sexo digitado;
		Scanner leia = new Scanner(System.in);
		
		char sexo;
		
		System.out.println("Digite o sexo (m/f):");
		sexo = leia.next().charAt(0);
		
		if(Character.toLowerCase(sexo) == 'm') {
			System.out.println("O sexo digitado foi masculino:" + sexo);
		}else {
			System.out.println("O sexo digitado foi feminino:" + sexo);

		}
		
		
		leia.close();
		
	}

}
