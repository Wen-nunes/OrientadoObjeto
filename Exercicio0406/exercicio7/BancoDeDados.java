package exercicio7;

public class BancoDeDados implements AcessoDados {

	@Override
	public void conectar() {
		System.out.println("Conectado com sucesso");
	}

	@Override
	public void desconectar() {
		System.out.println("Desconectado...");
	}

	@Override
	public void inserir() {
		System.out.println("Inserindo..");
	}

	@Override
	public void atualizar() {
		System.out.println("Atualizando...");
	}

	@Override
	public void excluir() {
		System.out.println("Excluido com sucesso");
	}

}
