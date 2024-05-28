package exercicio5;

public class Produto {
	public void calcularPrecoFinal(Double preco, String nome) {
		System.out.println("O " +nome+" custa " + preco);
	}
	
	public void calcularPrecoFinal(Double preco, String nome, Double cliente) {
		System.out.println("O " +nome+" custa " + (preco - (cliente *preco)));
	}
}
