package exercicio;

public class ContaCorrente extends Conta { 

	 public ContaCorrente(Double saldo, Double limite) {
		super(saldo, limite);
	}

	@Override
	    public void depositar(double valor) {
	        if (valor < 0) {
	            throw new IllegalArgumentException("O valor do depósito não pode ser negativo.");
	        }
	        saldo = saldo + valor;
	    }

	    @Override
	    public void sacar(double valor) {
	        if (valor < 0) {
	            throw new IllegalArgumentException("O valor do saque não pode ser negativo.");
	        }
	        if (valor > this.saldo + this.limite) {
	            throw new IllegalArgumentException("Saldo insuficiente para o saque.");
	        }
	        saldo = saldo - valor;
	    }

}
