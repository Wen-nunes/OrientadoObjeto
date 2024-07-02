package atividade10;

public class Main {
    public static void main(String[] args) {
        AcessoDados bancoDeDados = new BancoDeDados();
        
        bancoDeDados.conectar();
        
        Object objeto1 = new Object();
        bancoDeDados.inserir(objeto1);
        
        Object objeto2 = new Object();
        bancoDeDados.atualizar(objeto2);
        
        Object objeto3 = new Object();
        bancoDeDados.excluir(objeto3);
        
        bancoDeDados.desconectar();
    }
}