package exercicio1;

public class Figura {
	
	protected String cor;
	protected Boolean preenchido;
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Boolean getPreenchido() {
		return preenchido;
	}
	public void setPreenchido(Boolean preenchido) {
		this.preenchido = preenchido;
	}
	public Figura(String cor, Boolean preenchido) {
		super();
		this.cor = cor;
		this.preenchido = preenchido;
	}
	
	
}
