package atividade13;

public class Main {
    public static void main(String[] args) {
        try {
            Triangulo triangulo1 = new Triangulo(3, 4, 5);
            System.out.println("Triangulo criado: " + triangulo1.getL1() + ", " + triangulo1.getL2() + ", " + triangulo1.getL3());
            
            Triangulo triangulo2 = new Triangulo(1, 1, 3); 
            System.out.println("Triangulo criado: " + triangulo2.getL1() + ", " + triangulo2.getL2() + ", " + triangulo2.getL3());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar triangulo: " + e.getMessage());
        }
    }
}
