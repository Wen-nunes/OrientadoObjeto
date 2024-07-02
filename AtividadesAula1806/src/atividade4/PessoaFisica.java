package atividade4;

class PessoaFisica extends Pessoa {
 private String cpf;

 public PessoaFisica(String nome, String cidade, String cpf) {
     super(nome, cidade);
     this.cpf = cpf;
 }

 public String getCpf() {
     return cpf;
 }

 @Override
 public void efetuarCompra() {
     System.out.println("Cliente Pessoa Fisica " + getNome() + ", CPF: " + getCpf() + ", endereco " + getCidade() + " compra efetuada...");
 }
}

