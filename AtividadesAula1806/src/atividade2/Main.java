package atividade2;

public class Main{
    public static void main(String[] args) {
        ContaInvestimento investimento = new ContaInvestimento(1000.0);
        investimento.atualizaRendimentos();

        ContaPoupanca poupanca = new ContaPoupanca(2000.0);
        poupanca.atualizaJuros();
    }
}