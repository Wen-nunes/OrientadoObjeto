package prova2805;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EventoShow ev = new EventoShow("", 0, null);
		int op;
		System.out.println("Digite o nome: ");
		ev.setNome(sc.nextLine());
		System.out.println("Digite sua id: ");
		ev.setIdade(sc.nextInt());
		sc.nextLine();
		
		ev.adicionar("vip");
		
		System.out.println("Digite 1 se NAO passou da data limite e 2 se passou.");
		op = sc.nextInt();
		if(op == 1) {
			ev.cancelar(true);
		} else if(op == 2) {
			ev.cancelar(false);
		}
		sc.nextLine();
		EventoConferencia es = new EventoConferencia("", 0);
		System.out.println("Digite o nome da empresa: ");
		es.setNome(sc.nextLine());
		System.out.println("Digite sua id: ");
		es.setIdade(sc.nextInt());
		sc.nextLine();
		
		es.adicionar();
		es.cancelar();
		
		

	}

}
