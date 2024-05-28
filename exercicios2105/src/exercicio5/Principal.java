package exercicio5;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Produto c = new Produto();
		Scanner sc = new Scanner(System.in);
		int op;
		
		System.out.println("Digite 1 se não for cliente cadastrado");
		System.out.println("Digite 2 se for cliente cadastrado");
		op = sc.nextInt();
		
		if(op == 1) {
			c.calcularPrecoFinal(21.00, "Arroz");
		}
		else if(op== 2){ 
			c.calcularPrecoFinal(21.00, "Arroz", 0.10);
		}

	}

}
