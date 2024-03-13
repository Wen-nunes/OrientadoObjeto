package Aula;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int[] numeros = new int[2];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um numero: " + i);
			numeros[i] = teclado.nextInt();
		}
		int[] numeros2 = new int[2];
		
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println("Digite um numero: " + i);
			numeros2[i] = teclado.nextInt();
		}
		
		int[] soma = new int[2];
		
		for (int i = 0; i < soma.length; i++) {
			soma[i] = numeros[i] + numeros2[i];
		}
		for(int i = 0; i < soma.length; i++) {
			System.out.println("A soma de " + numeros[i] + " + " + numeros2[i] + " e : " + soma[i]);
		}
		
		
	}

}
