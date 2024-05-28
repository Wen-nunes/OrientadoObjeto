package exercicio12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
	public static void ordenarExibir (List<Livro> lista) {
		Collections.sort(lista, (livro1, livro2) -> livro1.getAno() - livro2.getAno());
		 for (Livro livro : lista) {
	            System.out.println("Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor() + ", Ano: " + livro.getAno());
	        }
	}

	public static void main(String[] args) {
		List<Livro> listaP = new ArrayList<Livro>();
		Livro p1 = new Livro ("Meu dinheiro Minhas Regras","Ana Castelan",2025);
		Livro p2 = new Livro ("As aventuras de well","Wendellas",1999);
		Livro p3 = new Livro ("Little well","Wendel Nunes",2020);
		
		listaP.add(p1);
		listaP.add(p2);
		listaP.add(p3);
		
		ordenarExibir(listaP);
	}
}
