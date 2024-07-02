package atividade3;

class Moto extends Veiculo {
    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void Acelerar() {
        System.out.println("Acelerando moto.");
    }

    @Override
    public void Frear() {
        System.out.println("Freando moto.");
    }
}