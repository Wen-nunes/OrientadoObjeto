package trabalhoArquivo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        SistemaCadastro sistema = new SistemaCadastro();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Alterar preco produto");
            System.out.println("3 - Excluir produto");
            System.out.println("4 - Exibir");
            System.out.println("5 - Sair do sistema");
            System.out.println("Digite a opcao: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Codigo: ");
                    int cod = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Descricao: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Preco de custo: ");
                    double pc = scanner.nextDouble();
                    System.out.print("Preco de venda: ");
                    double pv = scanner.nextDouble();
                    System.out.print("Estoque disponivel: ");
                    int estoque = scanner.nextInt();
                    Produto produto = new Produto(cod, descricao, pc, pv, estoque);
                    sistema.cadastrarProduto(produto);
                    break;
                case 2:
                    System.out.print("Codigo do produto: ");
                    int codigoAlterar = scanner.nextInt();
                    System.out.print("Novo preco de venda: ");
                    double novoPreco = scanner.nextDouble();
                    sistema.alterarPrecoProduto(codigoAlterar, novoPreco);
                    break;
                case 3:
                    System.out.print("Codigo do produto: ");
                    int codigoExcluir = scanner.nextInt();
                    sistema.excluirProduto(codigoExcluir);
                    break;
                case 4: 
                	sistema.listarProdutos();
                	break;
                case 5:
                    scanner.close();
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        }
    }

}
