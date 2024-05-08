package herancaEx3;

public class Pessoa {
	
	protected String nome;
	protected int idade;
	
	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	public void exibirDados() {
		System.out.println("Nome: " + nome + "\nIdade: " + idade);
	}
}
