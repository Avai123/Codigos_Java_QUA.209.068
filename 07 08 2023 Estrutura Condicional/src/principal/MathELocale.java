package principal;

import java.util.Locale;
import java.util.Scanner;

public class MathELocale {

	public static void main(String[] args) {
		//atalho para importar ctrl+shift+o
		final Locale ponto = new Locale("en", "us");
		Scanner leia = new Scanner(System.in);
		
		double altura = 0;
		double decimal =10.333333;
		int numero = (int) decimal;
		
		System.out.println("Entre com sua altura:");
		altura = leia.useLocale(ponto).nextDouble();
		
		System.out.println("A altura digitada foi:" + altura);
		
		System.out.printf("Resultado: %.2f\n", decimal);
		
		//potencia
		System.out.println(Math.pow(2, 5));
		//maior numero entre 2 números ou variaveis
		System.out.println(Math.max(2, 10));
		//menor numero entre 2 numeros ou variaveis
		System.out.println(Math.max(2, 10));
		//obter raiz quadrada
		System.out.println(Math.sqrt(16));
		//arredondar números
		System.out.println(Math.round(decimal));
		//numero PI armazenado
		System.out.println(Math.PI);
		
		
		
		
		
		
		leia.close();
		
	}

}
