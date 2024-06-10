package exercicio4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a raca do cachorro: ");
		Cachorro c = new Cachorro();
		c.setRaca(sc.nextLine());
		c.especie = "Cachorro";
		c.idade = 12;
		c.emiteSom();
		c.mostrarDados();
		c.cuidarPatio();
		c.exibirDados();

	}

}
