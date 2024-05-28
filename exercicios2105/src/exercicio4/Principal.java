package exercicio4;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		ContaBancaria c = new ContaBancaria();
		Scanner sc = new Scanner(System.in);
		int op;
		
		System.out.println("Digite 1 para deposita valor em dinheiro");
		System.out.println("Digite 2 para deposita valor em cheque");
		op = sc.nextInt();
		
		if(op == 1) {
			c.depositar(2000.00);
		}
		else if(op== 2){ 
			c.depositar(3000.00, true);
		}
		
	}
}
