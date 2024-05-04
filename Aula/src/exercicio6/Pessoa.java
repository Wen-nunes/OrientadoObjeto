package exercicio6;

public class Pessoa {
	
	private String nome;
	private int idade;
	private int cpf;
	
	public Pessoa() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public void maiorDeIdade() {
		if(idade >= 18) {
			System.out.println("Essa pessoa e maior de idade.");
		}
		else {
			System.out.println("Essa pessoa nao e maior de idade.");
		}
	}
	
}
