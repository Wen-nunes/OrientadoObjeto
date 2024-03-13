package Aula;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um numero: " + i);
			numeros[i] = teclado.nextInt();
		}
		
		for (int i = 0; i < numeros.length; i++) {
			int par = 0;
			int impar = 0;
			
			if(numeros[i]%2== 0){
				par ++;
				
			}
			else {
				impar ++;
				
			}
			System.out.println("numeros pares: " + par + "numeros impares: " + impar);
		}
	}
}

