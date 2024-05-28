package exercicio6;

public class Funcionario {
	protected String nome;
	protected Double salario;
	public Funcionario(String nome, Double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void aumentarSalario(Double porcentagem) {
		salario += salario * (porcentagem/100);
	}
	@Override
	public String toString() {
		return "Funcionario/a " + nome + ", com salario de " + salario;
	}
	
}
