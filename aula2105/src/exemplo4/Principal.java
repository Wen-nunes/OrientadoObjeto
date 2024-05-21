package exemplo4;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Pessoa> listaPessoa = new ArrayList<Pessoa>();
		
		Pessoa p1 = new Pessoa ("wendel", 25);
		Pessoa p2 = new Pessoa ("lucas", 15);
		listaPessoa.add( new Pessoa ("william" , 28));
		
		listaPessoa.add(p1);
		listaPessoa.add(p2);
		
		exibirPessoa(listaPessoa);
	}
	
	public static void exibirPessoa(List<Pessoa> listaPessoa) {
		for(Pessoa p : listaPessoa) {
			System.out.println("Nome " + p.getNome() + " de idade " + p.getIdade());
		}
	}
}
