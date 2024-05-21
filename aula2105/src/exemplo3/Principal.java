package exemplo3;

public class Principal {

	public static void main(String[] args) {
		Endereco e = new Endereco("Estarda Fiorino Stefanon", 39);
		Pessoa p = new Pessoa ("wendel", 25, e);
		
		System.out.println("O sujeito " + p.getNome()+ " de idade " + p.getIdade() + " reside em " + p.getEndereco().getRua() + ", " + p.getEndereco().getNumero());
		
		
	}

}
