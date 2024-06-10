package exercicio1;

public class Principal {
	public static void main(String[] args) {
		ContaInvestimento cp = new ContaInvestimento ();
		ContaCorrente cc = new ContaCorrente();
		cp.depositar();
		cp.sacar();
		
		cc.depositar();
		cc.sacar();
		
	}

}
