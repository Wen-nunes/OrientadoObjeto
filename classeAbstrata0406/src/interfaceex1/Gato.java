package interfaceex1;

public class Gato implements Animal {
	public String nome;
	public int idade;
	
	@Override
	public void emitirSom() {
		System.out.println(" miau ");

	}
	public void dados(){
		System.out.println("O nome do Animal e: " + nome);
		System.out.println("A idade do Animal e: " + idade);
	}

}
