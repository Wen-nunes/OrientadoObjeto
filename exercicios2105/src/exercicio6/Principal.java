package exercicio6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	public static void exibirLista(List<Funcionario> lista) {
		for(Funcionario f : lista) {
			System.out.println(f.toString());
		}
	}
	
	public static void main(String[] args) {
		 Gerente g1 = new Gerente("Amanda", 5000.0, 1000.0);
		 Desenvolvedor d1 = new Desenvolvedor("Wendel", 4000, 10);
		 Gerente g2 = new Gerente("Marcelo", 6000.0, 1500.0);
		 Desenvolvedor d2 = new Desenvolvedor("Joao", 3500, 5);
		 List<Funcionario> lista = new ArrayList<Funcionario>();
		 lista.add(g1);
		 lista.add(g2);
		 lista.add(d1);
		 lista.add(d2);
		 
		 
		 exibirLista(lista);

	}

}
