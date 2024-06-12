package exemplo2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws MinhaExcecao {
		Scanner sc = new Scanner (System.in);
		Double n1, n2;
		
		System.out.println("Digite dois numero: ");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		
		Divide(n1, n2);

	}
	
	public static void Divide (Double n1, Double n2) throws MinhaExcecao {	
			if(n2 == 0) {
				throw new MinhaExcecao("Impossivel divisao por zero!!");
			
			}else
			System.out.println("o resultado da divisao e: " + (n1/n2));
	}

}
