package exemplo1;

public abstract class Animal {
	
	protected String especie;
	protected int idade;
	
	public abstract void emitirSom();
	
	public void dados(){
		System.out.println("A especie do Animal e: " + especie);
		System.out.println("A idade do Animal e: " + idade);
	}
	
}