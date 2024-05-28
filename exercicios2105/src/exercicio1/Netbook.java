package exercicio1;

import java.util.Scanner;

public class Netbook extends Computador {
	
	public Netbook(String marca, String modelo) {
		super(marca, modelo);
	}
	public static void exibeMarca(String marca) {
		System.out.println("A marca do equipamento é " + marca);
	}
	public static void main(String[] args) {
		Computador c = new  Computador("", "Portatil");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a marca do Netbook: ");
		c.setMarca(sc.nextLine());
		
		c.exibeModelo();
		exibeMarca(marca);
	}

}
