package atividade3;

class Carro extends Veiculo {
    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void Acelerar() {
        System.out.println("Acelerando carro.");
    }

    @Override
    public void Frear() {
        System.out.println("Freando carro.");
    }
}