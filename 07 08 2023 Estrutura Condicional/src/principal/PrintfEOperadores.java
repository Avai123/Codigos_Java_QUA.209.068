package principal;

public class PrintfEOperadores {

	public static void main(String[] args) {

		String nome = "Vanessa Avelar";
		int idade = 35;
		double altura = 1.56;
		boolean verdadeiro = true;
		boolean falso = false;

		System.out.printf("%s, tem %d, e sua altura �: %.2f", nome, idade, altura);

		/*
		 * operadores de compra��o > maior que < menor que >=maior ou igual a <=menor ou
		 * igual a !=diferente ==igual
		 */

		/*
		 * operadores l�gicos && significa E || siginifica OU ! significa Nega��o
		 */
		// se == if
		// else == senao
		if (verdadeiro && falso) {
			System.out.println(10);
		} else {
			System.out.println(20);

		}
		char opcao = 's';
		int idade2 = 18;
		String diaSemana = "sexta";
	
		//um unico if � uma estrutura simples
		//if e else tenho uma estrutura composta
		//if else � uma estrutura encadeada
		//podemos ter estruturas dentro de cada if/if else
		
		if (opcao == 's' &&idade2 >=18) {
			System.out.println("Pode entrar na festa");
		}
		else 
		{System.out.println("Volta para casa!");
		}
		
		if(diaSemana.equals ("segunda")) {
			//int novaVariavel = 10;
			System.out.println("Segunda-Feira");
		}
		
		else if (diaSemana.equals ("terca")) {
			System.out.println("Ter�a-Feira");
					}
		else if(diaSemana =="sexta") {
			System.out.println("sexta-feira");	
		}
		else {
			System.out.println("N�o corresponde a um dia da semana!");
		}
		
		int diasSemana = 7;
				
		switch (diasSemana) {
		case 1:
			System.out.println("Domingo");
			break;
			
		case 2:
			System.out.println("segunda");
			break;
		
		case 3:
			System.out.println("Ter�a");
			break;
			
		case 4:
			System.out.println("Quarta");
			break;
			
		case 5:
			System.out.println("Quinta");
			break;
			
		case 6:
			System.out.println("Sexta");
			break;
			
		case 7:
			System.out.println("Sabado");
			break;
			
			default:
				System.out.println("N�o corresponde a um dia da semana");
			break;
		}
	}

		
}
