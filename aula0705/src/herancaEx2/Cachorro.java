package herancaEx2;

public class Cachorro extends Animal {
	
	protected String raca;

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public void latir() {
		System.out.println("O som do cachorro e: " + som );
	}
	
	public void exibirCachorro() {
		System.out.println("O nome do cachorro e: " + nome );
		System.out.println("A idade do cachorro e: " + idade );
		System.out.println("A raca do cachorro e: " + raca );
	}
}
