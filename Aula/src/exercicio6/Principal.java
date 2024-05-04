package exercicio6;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa p = new Pessoa();
		
		System.out.println("Digete o nome:");
		p.setNome(sc.nextLine());
		System.out.println("Digite a idade: ");
		p.setIdade(sc.nextInt());
		System.out.println("Digite o CPF: ");
		p.setCpf(sc.nextInt());
		
		p.maiorDeIdade();
		

	}

}
