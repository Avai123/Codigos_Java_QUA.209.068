package entties;

public class Gerente extends Funcionarios {
	@Override
	public double getBonificacao() {
		return (salario * .05);
		
	}
	

}
