package exercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circulo c = new Circulo(null);
		
		
		System.out.println("Digite o valor do raio: ");
		c.setRaio(sc.nextDouble());
		
		System.out.println("A area do Circulo e: " + c.calculaArea());
	}

}
