package projeto.atividade01cont;

public class Program {
	
	/*
	 * Fa�a um programa que calcule a �rea de um terreno e mostre o m�;
	 */
	
	public static void main(String[] args) {
		
		Terreno terreno1 = new Terreno();
		
		terreno1.comprimento = 50;
		terreno1.largura = 20;
		
			
		System.out.println(terreno1.calcularMetragem());
			
	}
	 

}
