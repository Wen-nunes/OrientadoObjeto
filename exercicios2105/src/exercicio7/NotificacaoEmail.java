package exercicio7;

public class NotificacaoEmail extends Notificacao {
	private String[] destinatarios;
    private String mensagem;

    public void enviar(String destinatario, String mensagem) {
        this.destinatarios = new String[]{destinatario};
        this.mensagem = mensagem;
        enviar();
    }

    public void enviar(String[] destinatarios, String mensagem) {
        this.destinatarios = destinatarios;
        this.mensagem = mensagem;
        enviar();
    }

    @Override
    public void enviar() {
        for (String destinatario : destinatarios) {
            System.out.println("Enviando email para " + destinatario + ": " + mensagem);
        }
    }
}