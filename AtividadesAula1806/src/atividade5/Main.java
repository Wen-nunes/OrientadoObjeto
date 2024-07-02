package atividade5;

public class Main {
    public static void main(String[] args) {
        
        Funcionario gerente = new Gerente("Wendel", 100000.0);
        gerente.calcularSalario();
        System.out.println("Salario do gerente " + gerente.nome + ": " + gerente.salario);
        
        Funcionario vendedor = new Vendedor("fulaninho", 2500.0);
        vendedor.calcularSalario();
        System.out.println("Salario do vendedor " + vendedor.nome + ": " + vendedor.salario);
    }
}