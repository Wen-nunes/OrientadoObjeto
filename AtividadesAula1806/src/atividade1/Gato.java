package atividade1;

class Gato extends Animal {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void EmitirSom() {
        System.out.println("O gato mia.");
    }
}