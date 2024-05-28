package exercicio1;

public class Computador {
	
	protected static String marca;
	private String modelo = "Portatil";
	
	
	public Computador(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void exibeModelo() {
		System.out.println("O modelo desse equipamento e " + modelo);
	}

}
