package exercicio3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Pessoa p = new Pessoa(null, null, 0);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tipo de especie: ");
		p.setTipo(sc.nextLine());
		System.out.println("Digite o nome: ");
		p.setNome(sc.nextLine());
		System.out.println("Digite a idade: ");
		p.setIdade(sc.nextInt());
		sc.nextLine();
		
		System.out.println("O tipo de especie e: "  + p.getTipo());
		System.out.println("O nome e: "  + p.getNome());
		System.out.println("A idade e: "  + p.getIdade());
		p.Falar();
		p.Andar();
		
	}

}
