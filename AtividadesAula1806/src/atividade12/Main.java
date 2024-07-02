package atividade12;

public class Main {
    public static void main(String[] args) {
        try {
            Data data1 = new Data(15, 6, 2024);
            System.out.println("Data criada: " + data1.getDia() + "/" + data1.getMes() + "/" + data1.getAno());
            
            Data data2 = new Data(31, 2, 2024); 
            System.out.println("Data criada: " + data2.getDia() + "/" + data2.getMes() + "/" + data2.getAno());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar data: " + e.getMessage());
        }
    }
}
