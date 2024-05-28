package exercicio6;

public class Gerente extends Funcionario {
	private Double bonusAnual;

	public Gerente(String nome, Double salario, Double bonusAnual) {
		super(nome, salario);
		this.bonusAnual = bonusAnual;
	}
	
	 public void aumentarSalario(Double porcentagem) {
	        super.aumentarSalario(porcentagem);
	        salario += bonusAnual;
	    }

	@Override
	public String toString() {
		return super.toString() + " Bonus gerente: " + bonusAnual;
	}
	
}
