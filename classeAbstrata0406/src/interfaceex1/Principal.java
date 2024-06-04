package interfaceex1;

public class Principal {

	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		
		c.nome = "toto";
		c.idade = 10;
		c.dados();
		c.cuida();
		c.emitirSom();
		
		Gato g = new Gato();
		
		g.nome = "rabugento";
		g.idade = 8;
		g.dados();
		g.emitirSom();
		
	}

}
