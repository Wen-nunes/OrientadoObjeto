package atividade1;

class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void EmitirSom() {
        System.out.println("O cachorro late.");
    }
}
