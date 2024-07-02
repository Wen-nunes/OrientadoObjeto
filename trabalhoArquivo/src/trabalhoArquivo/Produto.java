package trabalhoArquivo;

public class Produto {
	private int cod;
	private String descricao;
	private double pc;
	private double pv;
	private int estoque;
	
	public Produto(int cod, String descricao, double pc, double pv, int estoque) {
		super();
		this.cod = cod;
		this.descricao = descricao;
		this.pc = pc;
		this.pv = pv;
		this.estoque = estoque;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getPc() {
		return pc;
	}

	public double getPv() {
		return pv;
	}

	public void setPv(double pv) {
		this.pv = pv;
	}

	public int getEstoque() {
		return estoque;
	}	
	
}
