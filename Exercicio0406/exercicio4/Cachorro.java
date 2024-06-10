package exercicio4;

public class Cachorro extends Animal {
	private String raca;
	
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	@Override
	public void emiteSom() {
		System.out.println("AU AU AU AU ");		
	}
	public void cuidarPatio() {
		System.out.println("O cachorro esta cuidando do patio...");
	}
	
	public void exibirDados () {
		System.out.println("Raca: "+getRaca()+ "  Idade: "+getIdade()+ "  Especie: "+ getEspecie());
	}

}
