package exercicio1;

public class ContaCorrente extends Conta {

	@Override
	public double depositar() {
	    System.out.println("Deposito de 2000 reais efetuado...");
		return saldo = saldo + 20000;
	}

	@Override
	public double sacar() {
		System.out.println("Saque de 20 reais efetuado...");
		return saldo = saldo - 20;
	}
	

}
