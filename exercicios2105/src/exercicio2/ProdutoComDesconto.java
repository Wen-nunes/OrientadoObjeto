package exercicio2;

public class ProdutoComDesconto extends Produto {

	public void desconto(Double preco, String nome) {
		System.out.println("O "+ nome +" com desconto de 10% e "+ (preco - (preco * 0.1)));
	}

}
