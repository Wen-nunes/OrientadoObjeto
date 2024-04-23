package exercicio2;

public class Circulo {
	private Double raio;
	

	public Circulo(Double raio) {
		super();
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}
	public Double calculaArea () {
		return 3.14 * (raio *raio);
	}
	

}
