package entties;

public class Funcionarios  {
	// TODO Auto-generated constructor stub
	
	private String Nome;
	private int idade;
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getFuncao() {
		return Funcao;
	}
	public void setFuncao(String funcao) {
		Funcao = funcao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	private String Funcao;
	private double salario;
	
	public void obterDadosFuncionarios() {
		System.out.println();
	}
	
	

}
