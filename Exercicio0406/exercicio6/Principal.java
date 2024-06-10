package exercicio6;

public class Principal {

	public static void main(String[] args) {
		Livros li = new Livros ("Wendel Nunes",  "Contos de um CLT", 500);
		Cd c = new Cd ("Calcinha Preta", "Dois Coracoes e uma historia", 20);
		li.getNome();
		li.getDescricao();
		li.getPreco();
		c.getNome();
		c.getDescricao();
		c.getPreco();
		
	}

}
