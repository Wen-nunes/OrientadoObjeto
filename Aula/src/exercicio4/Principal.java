package exercicio4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Carro r = new Carro("", "");
		
		System.out.println("Digite a marca do carro: ");
		r.setMarca(sc.next());
		System.out.println("Digite o modelo do carro: ");
		r.setModelo(sc.next());
		
		r.exibeDetalhe();

	}

}
