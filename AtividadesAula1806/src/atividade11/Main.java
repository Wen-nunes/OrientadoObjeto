package atividade11;

public class Main {
    public static void main(String[] args) {
        try {
            Pessoa pessoa1 = new Pessoa("Wendel", 25);
            System.out.println("Pessoa criada: " + pessoa1.getNome() + ", Idade: " + pessoa1.getIdade());
            
            Pessoa pessoa2 = new Pessoa("Ricardo", 100);
            System.out.println("Pessoa criada: " + pessoa2.getNome() + ", Idade: " + pessoa2.getIdade());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar pessoa: " + e.getMessage());
        }
    }
}