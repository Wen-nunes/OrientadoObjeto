package exercicio2;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Produto p = new Produto();
		Scanner sc = new Scanner(System.in);
		p.desconto(21.00, "Arroz");
		
		p = new ProdutoComDesconto();
		p.desconto(21.00, "Arroz");
		
		

	}
}
