package principal;

import java.util.ArrayList;
import java.util.Collections;

public class Program {

	public static void main(String[] args) {
		// Listas trabalham com dados do mesmo tipo;
		// Uma lista � um tipo generico de uma collection;
		// Uma lista � uma cole��o de dados;

		ArrayList<String> nomes = new ArrayList<>();

		String nome1 = "Adicionado por ultimo";

		nomes.add("Luan");
		nomes.add("Julia");
		nomes.add("Vanessa");
		nomes.add("Jos�");
		nomes.add(nome1);

		System.out.println(nomes);

		System.out.println(nomes.get(4));

		nomes.remove(1);

		System.out.println(nomes);

		for (String nome : nomes) {
			System.out.println(nome);
		}

		System.out.println("Imprimindo com for: ");

		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}

		System.out.println("imprimindo com express�o lambda: ");
		// pesquisem sobre express�o lambda
		nomes.forEach(nome -> System.out.println(nome));

		System.out.println("Imprimindo ordenadamente: ");
		Collections.sort(nomes);

		nomes.forEach(nome -> System.out.println(nome));

	}

}
