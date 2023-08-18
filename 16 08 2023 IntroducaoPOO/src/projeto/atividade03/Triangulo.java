package projeto.atividade03;

public class Triangulo {

	public double lado1;
	public double lado2;
	public double lado3;

	public String obterNomeDoTriangulo(double lado1, double lado2, double lado3) {
		if ((lado1 == 0) || (lado2 == 0) || (lado3 == 0)) {
			return "Isso n�o � um trinagulo";
		}
		if ((lado1 == lado2) && (lado2 == lado3)) {
			return " � um tri�ngulo equilatero (tr�s lados iguais)";
		} else if ((lado1 == lado2) || (lado2 == lado3) || (lado1 == lado3)) {
			return "� um triangulo isoceles (dois lados iguais).";
		} else {
			return "� um triangulo escaleno (Todos os lados diferentes)";
		}

	}

}
