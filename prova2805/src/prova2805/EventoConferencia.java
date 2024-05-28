package prova2805;

public class EventoConferencia extends Evento {
	
	public EventoConferencia(String nome, int id) {
		super(nome, id);
	}
	public void adicionar() {
		System.out.println("O evento da empresa " + nome + " foi agendado com sucesso "  + "( ID: " + id + ")");
		
	}
	public void cancelar() {
		System.out.println("O cancelamento do evento foi feito com sucesso");
	}

}
