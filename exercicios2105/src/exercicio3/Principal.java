package exercicio3;

public class Principal {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		f.calcularSalario("wendel", 1800.00);
		
		f = new Gerente();
		f.calcularSalario("Adilson",1800.00);
	}

}
