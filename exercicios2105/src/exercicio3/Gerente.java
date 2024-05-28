package exercicio3;

public class Gerente extends Funcionario {
	public void calcularSalario(String nome, Double salario) {
		System.out.println("O gerente " + nome + " recebe de salario " + (salario + (salario * 0.30)));
	}
}
