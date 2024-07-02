package atividade4;

class PessoaJuridica extends Pessoa {
 private String cnpj;

 public PessoaJuridica(String nome, String cidade, String cnpj) {
     super(nome, cidade);
     this.cnpj = cnpj;
 }

 public String getCnpj() {
     return cnpj;
 }

 @Override
 public void efetuarCompra() {
     System.out.println("Cliente Pessoa Juridica " + getNome() + ", CNPJ: " + getCnpj() + ", endereco " + getCidade() + " compra realizada...");
 }
}
