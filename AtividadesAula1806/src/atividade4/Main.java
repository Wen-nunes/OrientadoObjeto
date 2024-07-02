package atividade4;


public class Main {
    public static void main(String[] args) {
        Pessoa cliente1 = new PessoaFisica("Wendel", "Santa Maria", "111.222.333-44");
        Pessoa cliente2 = new PessoaJuridica("Becker", "Cerro Largo", "00.000.000/0001-00");

        cliente1.efetuarCompra();
        cliente2.efetuarCompra();
    }
}
