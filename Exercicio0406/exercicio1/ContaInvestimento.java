package exercicio1;

public class ContaInvestimento extends Conta {

	@Override
	public double depositar() {
		 System.out.println("Deposito de 250000 reais efetuado...");
			return saldo = saldo + 2500000;
	}

	@Override
	public double sacar() {
		System.out.println("Saque de 120 reais efetuado...");
		return saldo = saldo - 120;
	}

}
