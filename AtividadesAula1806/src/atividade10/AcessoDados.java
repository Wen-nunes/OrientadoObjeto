package atividade10;

interface AcessoDados {
 void conectar();
 void desconectar();
 void inserir(Object objeto);
 void atualizar(Object objeto);
 void excluir(Object objeto);
}

