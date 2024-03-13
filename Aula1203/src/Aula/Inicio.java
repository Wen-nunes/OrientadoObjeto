package Aula;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
			
			Scanner teclado = new Scanner(System.in);
			
			int[] numeros = new int[1];
			
			for (int i = 0; i < numeros.length; i++) {
				System.out.println("Digite um numero: " + i);
				numeros[i] = teclado.nextInt();
			}
			
			for (int i = 0; i < numeros.length; i++) {
				
				System.out.println("o elemento de indice " + i + " e " + numeros[i]);
			}
			
			numeros = new int[2];
			
			for (int i = 0; i < numeros.length; i++) {
				System.out.println("Digite um numero: " + i);
				numeros[i] = teclado.nextInt();
			}
			
			for (int i = 0; i < numeros.length; i++) {
				
				System.out.println("o elemento de indice " + i + " e " + numeros[i]);
			}
			
			int n;
			System.out.println("Digite o tamanho do Vetor: ");
			n = teclado.nextInt();
			
			numeros = new int[n];
			
			for (int i = 0; i < numeros.length; i++) {
				System.out.println("Digite um numero: " + i);
				numeros[i] = teclado.nextInt();
			}
			
			for (int i = 0; i < numeros.length; i++) {
				
				System.out.println("o elemento de indice " + i + " e " + numeros[i]);
			}
			
			
			int[][] matriz = new int[3][3];
			
			for (int i = 0; i < matriz.length; i++)
				for (int j = 0; j < matriz.length; j++) {
					System.out.println("Digite a matriz ["+ i +"]["+ j +"] ");
					matriz [i][j]= teclado.nextInt();
				}
			for (int i = 0; i < matriz.length; i++)
				for (int j = 0; j < matriz.length; j++) {
				System.out.println(matriz[i][j] + " ");
				
			}
			for(int[] linha : matriz) {
				for(int elemento : linha) {
					System.out.println("elemento" + elemento);
				}
				System.out.println("Final da linha!");
			}
		}

}

