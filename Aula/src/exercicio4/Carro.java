package exercicio4;

public class Carro {
	
	private String marca;
	private String modelo;
	public Carro(String marca, String modelo) {
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
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void exibeDetalhe() {
		System.out.println("A marca do carro e: " + marca);
		System.out.println("O modelo do carro e: " + modelo);
	}
}
