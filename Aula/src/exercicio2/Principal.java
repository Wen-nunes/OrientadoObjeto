package exercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Circulo r = new Circulo(null);
		
		System.out.println("Digite o valor do raio: ");
		r.setRaio(sc.nextDouble());
		System.out.println("A area e: " + r.Area());
	}

}
