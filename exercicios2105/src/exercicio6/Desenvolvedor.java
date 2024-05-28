package exercicio6;

public class Desenvolvedor extends Funcionario {
	 private int horasExtras;

	    public Desenvolvedor(String nome, double salario, int horasExtras) {
	        super(nome, salario);
	        this.horasExtras = horasExtras;
	    }

	    @Override
	    public void aumentarSalario(Double porcentagem) {
	        super.aumentarSalario(porcentagem);
	        salario += horasExtras * 50;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + ", Horas Extras: " + horasExtras;
	    }
	
}
