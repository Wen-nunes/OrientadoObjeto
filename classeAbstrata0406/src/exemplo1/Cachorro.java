package exemplo1;

public class Cachorro extends Animal {
	public String raca;
	@Override
	public void emitirSom() {
		System.out.println("au au au");
		
	}
	
	public void cuida(){
		System.out.println("O cachorro esta cuidadando do patio");
	}
	
	public void dados(){
		System.out.println("A especie do Animal e: " + especie);
		System.out.println("A idade do Animal e: " + idade);
		System.out.println("A raca do Animal e: " + raca);
	}
	

}
