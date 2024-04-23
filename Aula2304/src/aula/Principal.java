package aula;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		String marca;
		String modelo;
		int op;
		Scanner sc = new Scanner(System.in);
		Carro c = new Carro(marca, modelo);
		
		do {
			System.out.println("Digite uma operação:");
			System.out.println("1-Criar carro informando marca.");
			System.out.println("2- Criar carro informando marca e modelo.");
			System.out.println("3- Exibir informações do carro.");
			System.out.println("4- Atribuir modelo do carro");
			System.out.println("5- Obter modelo do carro.");
			System.err.println("6- Atribuir marca do carro.");
			System.out.println("7- Obter marca do carro.");
			System.out.println("0- Sair.");
			op = sc.nextInt();
			sc.nextLine();
			
			switch(op) {
			
			case 1: 
				System.out.println("");
				break;
			case 2: 
				
				break;
			case 3: 
						
				break;
			case 4: 
				System.out.println("Digite o modelo do carro: ");
				marca = sc.nextLine();
				c.setMarca(marca);
				break;
			case 5: 
				
				break;
			case 6: 
				
				break;
			case 7: 
				
				break;
			case 0: 
				
				break;
			
		
			}
			
		}while(!op == 0);

	}

}
