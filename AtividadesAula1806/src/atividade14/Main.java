package atividade14;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        
        try {
            agenda.adicionarContato("Ana", "123456789");
            System.out.println("Contato adicionado com sucesso");
            
            agenda.adicionarContato("", "987654321"); 
            System.out.println("Contato adicionado com sucesso");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao adicionar contato: " + e.getMessage());
        }
    }
}
