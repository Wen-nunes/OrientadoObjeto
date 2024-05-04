package exercicio1;

import java.util.Objects;

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



	public String Saque(Double vsaque) {
		if (vsaque > limite + saldo) {
			System.out.println("Saque nao autorizado!");
			return "Nao sacou";
		}
		else{
			System.out.println("Saque autorizado!");
		}
		return "Sacou";
	}
}
