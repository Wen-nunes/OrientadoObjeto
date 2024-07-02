package atividade9;

public interface AcessoBanco {
	 void conectar();
	 void desconectar();
	 void inserir(Object objeto);
	 void atualizar(Object objeto);
	 void excluir(Object objeto);
}
