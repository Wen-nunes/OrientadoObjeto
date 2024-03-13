package Aula;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		float[] numeros = new float[30];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um numero: " + i);
			numeros[i] = teclado.nextFloat();
		}
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i]<0)
				System.out.println("Elemento: " + numeros[i] + " posicao: " + i);
		}

	}

}
