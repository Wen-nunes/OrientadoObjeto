package atividade4;

abstract class Pessoa {
 private String nome;
 private String cidade;

 public Pessoa(String nome, String cidade) {
     this.nome = nome;
     this.cidade = cidade;
 }

 public String getNome() {
     return nome;
 }

 public String getCidade() {
     return cidade;
 }

 public abstract void efetuarCompra();
}
