package exercicio6;

public class Cd implements Produto {

	String nome,descricao;
	double preco;
	
	public Cd(String nome, String descricao, double preco) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}

	@Override
	public void getNome() {
		System.out.println("Nome: " + this.nome);
	}

	@Override
	public void getPreco() {
		System.out.println("Preco: " +this.preco);
	}

	@Override
	public void getDescricao() {
		System.out.println("Descricao: "+this.descricao);
	}

}
