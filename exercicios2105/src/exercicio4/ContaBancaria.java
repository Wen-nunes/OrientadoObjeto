package exercicio4;

public class ContaBancaria {
	
	public void depositar(Double valor) {
		int saldo = 2000;
		System.out.println("Deposito de " + valor +" mudando o saldo para "+ (valor+saldo));
		
	}
	
	public void depositar(Double valor, Boolean cheque) {
		int saldo = 2000;
		System.out.println("Deposito de " + valor +" mudando o saldo para "+ (valor+saldo));
		
	}
}
