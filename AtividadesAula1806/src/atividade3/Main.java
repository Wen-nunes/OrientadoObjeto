package atividade3;

public class Main{
    public static void main(String[] args) {
        Veiculo carro = new Carro("Nissan", "Skylline R34", 2018);
        Veiculo moto = new Moto("Yamaha", "Africa 1000cc", 2021);

        carro.Acelerar();
        moto.Frear();
    }
}