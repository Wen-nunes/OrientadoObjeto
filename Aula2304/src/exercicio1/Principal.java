package exercicio1;

import java.util.Scanner;

public class Principal {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContaBancaria conta = new ContaBancaria(1200.00, 5000.00);
		Double vsaque;
	
		System.out.println("O seu limite e: " + conta.getLimite());
		System.out.println("O seu saldo e: " + conta.getSaldo());
		System.out.println("Digite o Valor que quer sacar: ");
		vsaque = sc.nextDouble();
		
		
		System.out.println(conta.saque(vsaque));
		
		

	}

}
