package exercicio;

public abstract class Conta {
	protected Double saldo;
	protected Double limite;
	public Conta(Double saldo, Double limite) {
		super();
		this.saldo = saldo;
		this.limite = limite;
	}
		
	public abstract void depositar(double valor);
	public abstract void sacar(double valor);
	
	
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Double getLimite() {
		return limite;
	}
	public void setLimite(Double limite) {
		this.limite = limite;
	}
	
}
