package exercicio5;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Triangulo t = new Triangulo();
		
		System.out.println("Digite o lado A: ");
		t.setLa(sc.nextDouble());
		System.out.println("Digite o lado B: ");
		t.setLb(sc.nextDouble());
		System.out.println("Digite o lado C: ");
		t.setLc(sc.nextDouble());
		
		if (t.verificaEquilatero()) {
            System.out.println("O triângulo é equilátero.");
        } else {
            System.out.println("O triângulo não é equilátero.");
        }
		
	}

}
