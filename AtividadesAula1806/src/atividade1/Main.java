package atividade1;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Galgo", 5);
        Animal gato = new Gato("DeBotas", 3);

        cachorro.EmitirSom();
        gato.EmitirSom();
    }
}