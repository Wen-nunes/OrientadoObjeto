package prova2805;

public class Evento {
	protected String nome;
	protected int id;
	
	public Evento(String nome, int id) {
		super();
		this.nome = nome;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return id;
	}

	public void setIdade(int idade) {
		this.id = idade;
	}
	public void adicionar() {
		
	}
	public void cancelar() {
		
	}
}
