package herançaEx1;

public class Carro {
	
	protected String nome;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void exibirNome() {
		System.out.println("Estou na classe carro\n0 nome do carro e: " + nome);
	}
}
