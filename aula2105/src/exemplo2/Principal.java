package exemplo2;

public class Principal {

	public static void main(String[] args) {
		Produto p = new Produto("caneta", 1.5);
		Produto p2 = p.clone();
		
		System.out.println("O Produto1 " + p.getNome()+ "tem o valor de: " + p.getPreco());
		System.out.println("O Produto2 " + p2.getNome()+ "tem o valor de: " + p2.getPreco());
		
		p2.setPreco(2.58);
		System.out.println("O produto1 " + p.getNome() + "tem novo valor de " + p.getPreco());
		System.out.println("O produto2 " + p2.getNome() + "tem novo valor de " + p2.getPreco());
		
		// pode se utilizar um if para provar que o return this e o return clone() trazem resultados diferentes
		//visto que o this funciona como um ponteiro

	}

}
