package exemplo2;

public class Produto {
	
	private String nome;
	private Double preco;
	public Produto(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	
	public Produto clone() {
		//return new Produto(this.nome, this.preco);
		return this;
	}
}
