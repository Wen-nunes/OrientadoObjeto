package herancaEx2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o nome do cachorro: ");
		c.setNome(sc.nextLine());
		System.out.println("Digite o idade do cachorro: ");
		c.setIdade(sc.nextInt());
		sc.nextLine();
		System.out.println("Digite o raca do cachorro: ");
		c.setRaca(sc.nextLine());
		System.out.println("Digite o som do cachorro: ");
		c.setSom(sc.nextLine());
				
		c.exibirCachorro();
		c.latir();
		
		

	}

}
