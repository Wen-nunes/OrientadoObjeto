package exercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContaBancaria b = new ContaBancaria(1500.00, 4000.00);
		Double vsaque;
		
		System.out.println("Saldo disponivel: " + b.getSaldo());
		System.out.println("Limite disponivel: " + b.getLimite());
		
		System.out.println("Digite o valor que quer sacar: ");
		vsaque = sc.nextDouble();
		
		System.out.println(b.Saque(vsaque));
		

	}

}
