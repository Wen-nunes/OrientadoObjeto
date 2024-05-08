package herançaEx1;

public class Principal {

	public static void main(String[] args) {
		Onibus o = new Onibus();
		o.setNome("Porshe");
		o.setModelo("Taycann");
		
		o.exibirNome();
		
		System.out.println("O nome do carro e: " + o.getNome());
		System.out.println("Modelo do onibus: " + o.getModelo());

	}

}
