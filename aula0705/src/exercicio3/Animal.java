package exercicio3;

public class Animal {
	
	protected String tipo;

	public Animal(String tipo) {
		super();
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void Andar() {
		System.out.println("Todos andam, mas o modo e variado");
	}
}
