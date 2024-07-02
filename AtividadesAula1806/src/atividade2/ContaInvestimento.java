package atividade2;

class ContaInvestimento {
    private double saldo;

    public ContaInvestimento(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void atualizaRendimentos() {
        saldo *= 1.05;
    }
}
