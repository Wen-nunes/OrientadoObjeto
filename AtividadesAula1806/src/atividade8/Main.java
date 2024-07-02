package atividade8;

public class Main {
    public static void main(String[] args) {
        Produto livro = new Livro("os tres porquinhos", 9.99, "Livro infantil");
        System.out.println("Livro:");
        System.out.println("Nome: " + livro.getNome());
        System.out.println("Preço: " + livro.getPreco());
        System.out.println("Descrição: " + livro.getDescricao());
        System.out.println();
        
        Produto cd = new CD("Summer eletro Hits", 19.99, "CD com os maiores sucessos da epoca");
        System.out.println("CD:");
        System.out.println("Nome: " + cd.getNome());
        System.out.println("Preço: " + cd.getPreco());
        System.out.println("Descrição: " + cd.getDescricao());
    }
}