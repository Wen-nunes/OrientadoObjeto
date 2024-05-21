package exemplo1;

public class Principal1 {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("wendel", 25);
		meuMetodo(p);
		
		

	}
	public static void meuMetodo(Pessoa p ){
			System.out.println("O nome do sujeito e: " + p.getNome());
			System.out.println(" A idade do sujeito e: " + p.getIdade());
		}
}
