package trabalhoArquivo;

import java.util.ArrayList;
import java.util.List;

public class SistemaCadastro {
    private List<Produto> produtos;
    Arquivo arquivo = new Arquivo("Produtos");

    public SistemaCadastro() {
        this.produtos = new ArrayList<>();
    }

    public void cadastrarProduto(Produto produto) {
        arquivo.gravarArquivo(produto);
    }

    public void alterarPrecoProduto(int cod, double novoPreco) {
        List<Produto> produtos = arquivo.leArquivo();
        boolean produtoEncontrado = false;
        for (Produto produto : produtos) {
            if (produto.getCod() == cod) {
                produto.setPv(novoPreco);
                produtoEncontrado = true;
                break;
            }
        }
        if (produtoEncontrado) {
            arquivo.regravarArquivo(produtos);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void excluirProduto(int codigoExcluir) {
    	List<Produto> produtos = arquivo.leArquivo();
        produtos.removeIf(produto -> produto.getCod() == codigoExcluir);
        arquivo.regravarArquivo(produtos);
    }
    
    public void listarProdutos() {
    	 List<Produto> produtos = arquivo.leArquivo();
         if (produtos.isEmpty()) {
             System.out.println("Não há produtos cadastrados.");
         } else {
             for (Produto p : produtos) {
                 System.out.println("Código: " + p.getCod() +", Descrição: " + p.getDescricao() +", Preço de Venda: " + p.getPv() +", Estoque: " + p.getEstoque());
             }
         }
    }
        
    }
