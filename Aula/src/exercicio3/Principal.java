package exercicio3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Retangulo r = new Retangulo(null, null);
		
		System.out.println("Digite o valor da base: ");
		r.setBase(sc.nextDouble());
		
		System.out.println("Digite o valor da altura: ");
		r.setAltura(sc.nextDouble());
		
		System.out.println("a area do retangulo e: " + r.calculaArea());
		
	}

}
