package Aula;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um numero: " + i);
			numeros[i] = teclado.nextInt();
		}
		System.out.println("Numeros pares: ");
		for (int i = 0; i < numeros.length; i++) {
			if(i%2==0)
				System.out.println(i);
		}
		System.out.println("Numeros impares: ");
		for (int i = 0; i < numeros.length; i++) {
			if(i%2!=0)
				System.out.println(i);
		}

	}

}
