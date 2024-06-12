package exercicio;

import java.util.Scanner;

public class Principal {
	
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 double valor;
	        try {
	            ContaCorrente cc = new ContaCorrente(1000.00, 5000.00);
	            
	            System.out.println("Saldo inicial: " + cc.saldo);
	            System.out.println("Digite o valor que quer depositar: ");
	            valor = sc.nextDouble();
	            cc.depositar(valor);
	            System.out.println("Saldo após depósito: " + cc.saldo);
	            
	            
	            System.out.println("Digite o valor que quer sacar: ");
	            valor = sc.nextDouble();
	            cc.sacar(valor);
	            System.out.println("Saldo após saque: " + cc.saldo);
	        } catch (IllegalArgumentException e) {
	            System.out.println("Erro: " + e.getMessage());
	        }
	    }
}
