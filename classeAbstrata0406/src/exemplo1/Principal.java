package exemplo1;

public class Principal {

	public static void main(String[] args) {
		
		Cachorro c = new Cachorro();
		
		c.emitirSom();
		
		c.especie = "Dog";
		c.idade = 15;
		c.raca = "Pittbul";
		
		c.dados();
		
		c.cuida();
		//Animal c1 = new Cachorro();
		
		//c1.dados();
	}

}
