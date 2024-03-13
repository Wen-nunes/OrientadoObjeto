package Aula;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um numero: " + i);
			numeros[i] = teclado.nextInt();
		}
		
		for (int i = 9; i >= 0; i--) {
			
			System.out.println("o elemento de indice " + i + " e " + numeros[i]);
		}
		
		
		
	}

}
