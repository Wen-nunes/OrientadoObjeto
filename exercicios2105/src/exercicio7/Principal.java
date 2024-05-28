package exercicio7;

public class Principal {

	public static void main(String[] args) {
		 
        NotificacaoEmail emailUnico = new NotificacaoEmail();
        emailUnico.enviar("wendel@ufn.edu", "Parabens Formando!");

       
        NotificacaoEmail emailMultiplo = new NotificacaoEmail();
        String[] destinatarios = {"wendel@ufn.edu", "chaulimmatadordeporco@ufn.edu"};
        emailMultiplo.enviar(destinatarios, "Nao havera aula");

       
        NotificacaoApp notificacaoApp = new NotificacaoApp("wen_nunes", "notificacao instagram");
        notificacaoApp.enviar();
	}

}
