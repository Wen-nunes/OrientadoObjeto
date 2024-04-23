package Exercicio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Aluno al = new Aluno("wendel", 5.1, 8.3);
		
		
		
		System.out.println("O nome e:  " + al.getNome());
		System.out.println("Nota 1: " + al.getNota1());
		System.out.println("Nota 2: " + al.getNota2());
		System.out.println("A media e: " + al.calculaMedia());

	}

}
