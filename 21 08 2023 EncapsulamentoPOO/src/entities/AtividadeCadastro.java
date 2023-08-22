package entities;

public class AtividadeCadastro {

	private String nome;
	private String email;
	private String senha;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void obterDados() {
		System.out.println("************DADOS CADASTRO************");
		System.out.println("Nome usuário: " + nome);
		System.out.println("Email usuário: " + email);

	}

}
