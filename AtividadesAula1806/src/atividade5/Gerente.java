package atividade5;

class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularSalario() {
        salario = salario * 1.20; 
    }
}