package principal;

public class PrintfEOperadores {

	public static void main(String[] args) {

		String nome = "Vanessa Avelar";
		int idade = 35;
		double altura = 1.56;
		boolean verdadeiro = true;
		boolean falso = false;

		System.out.printf("%s, tem %d, e sua altura é: %.2f", nome, idade, altura);

		/*
		 * operadores de compração > maior que < menor que >=maior ou igual a <=menor ou
		 * igual a !=diferente ==igual
		 */

		/*
		 * operadores lógicos && significa E || siginifica OU ! significa Negação
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
	
		//um unico if é uma estrutura simples
		//if e else tenho uma estrutura composta
		//if else é uma estrutura encadeada
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
			System.out.println("Terça-Feira");
					}
		else if(diaSemana =="sexta") {
			System.out.println("sexta-feira");	
		}
		else {
			System.out.println("Não corresponde a um dia da semana!");
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
			System.out.println("Terça");
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
				System.out.println("Não corresponde a um dia da semana");
			break;
		}
	}

		
}
