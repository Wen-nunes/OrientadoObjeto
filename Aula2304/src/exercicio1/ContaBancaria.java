package exercicio1;

public class ContaBancaria {
	
	private Double saldo;
	private Double limite;
	
	public ContaBancaria(Double saldo, Double limite) {
		super();
		this.saldo = saldo;
		this.limite = limite;
	}
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
	public String saque(Double vsaque) {
		if(vsaque <= saldo + limite) {
			System.out.println("Saque autorizado!");
			
			return "sacou";
		}
		
		else {
			System.out.println("Saque nao Autorizado!");
		}
		return "nao sacaou";
	}
	
	
}

