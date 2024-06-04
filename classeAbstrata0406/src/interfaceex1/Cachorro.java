package interfaceex1;

public class Cachorro implements Animal {
	
	public String nome;
	public int idade;

	@Override
	public void emitirSom() {
		System.out.println("Au Au Au Au");
	}
	
	public void cuida(){
		System.out.println("O cachorro esta cuidadando do patio");
	}
	
	public void dados(){
		System.out.println("O nome do Animal e: " + nome);
		System.out.println("A idade do Animal e: " + idade);
	}
}
