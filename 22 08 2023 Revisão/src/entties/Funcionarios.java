package entties;

public class Funcionarios {
	// TODO Auto-generated constructor stub

	private String Nome;
	private int idade;
	private String funcao;
	protected double salario;
	private double bonificacao;

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
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public double getBonificacao() {
		return bonificacao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void obterDadosFuncionarios() {
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("funcao: " + getFuncao());
		System.out.println("salario: " + getSalario());
		System.out.println("bonificacao: " + getBonificacao());
	}

}
