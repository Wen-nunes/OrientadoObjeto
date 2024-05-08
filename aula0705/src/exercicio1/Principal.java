package exercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Retangulo r = new Retangulo("Vermelho", true, 0, 0);
		
		System.out.println("Digite a altura: ");
		r.setAltura(sc.nextDouble());
		System.out.println("Digite a largura: ");
		r.setLargura(sc.nextDouble());
		
		System.out.println(r.calcularArea());

	}

}
