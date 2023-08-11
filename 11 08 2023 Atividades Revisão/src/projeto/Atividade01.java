package projeto;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1) Ler o nome de 2 times e o número de gols marcados na partida (para cada
		 * time). Escrever o nome do vencedor. Caso não haja vencedor deverá ser
		 * impressa a palavra EMPATE.
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o nome do seu time: ");
		String time1 = sc.next();

		System.out.print("Digite o número de gol: ");
		int goltime1 = sc.nextInt();

		System.out.print("Digite o nome do seu time: ");
		String time2 = sc.next();

		System.out.print("Digite o número de gol: ");
		int goltime2 = sc.nextInt();

		if (goltime1 > goltime2) {
			System.out.println(time1 + " foi o  vencedor");
		}else if (goltime1<goltime2) {
			System.out.println(time2 + " foi o  vencedor");
		}else {
			System.out.println("Empate");
		}
		sc.close();
		
	}

}
