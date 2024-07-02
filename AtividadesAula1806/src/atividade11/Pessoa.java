package atividade11;

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        validarIdade(idade);
        this.idade = idade;
    }

    private void validarIdade(int idade) {
        if (idade < 0 || idade > 90) {
            throw new IllegalArgumentException("Idade fora do intervalo permitido (0-90)");
        }
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}