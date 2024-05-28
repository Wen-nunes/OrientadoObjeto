package exercicio7;

public class NotificacaoApp extends Notificacao {
	 private String destinatario;
	    private String mensagem;

	    public NotificacaoApp(String destinatario, String mensagem) {
	        this.destinatario = destinatario;
	        this.mensagem = mensagem;
	    }

	    @Override
	    public void enviar() {
	        System.out.println("Enviando notificação de app para " + destinatario + ": " + mensagem);
	    }
	}
