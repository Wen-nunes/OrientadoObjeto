package prova2805;

public class EventoShow extends Evento {
	private String ingresso;
	private Boolean dataLimte;
	

	public String getIngresso() {
		return ingresso;
	}

	public void setIngresso(String ingresso) {
		this.ingresso = ingresso;
	}

	public EventoShow(String nome, int id, String ingresso) {
		super(nome, id);
		this.ingresso = ingresso;
	}
	
	public void adicionar(String ingresso) {
		System.out.println("O ingresso da area " + ingresso + " foi adiocionada para " + nome + "( ID: " + id + ")");
		
	}
	
	public void cancelar(Boolean dataLimite) {
		if(dataLimite == true) {
			System.out.println("O cancelamento total foi feito com sucesso");
		}
		else if (dataLimite==false) {
			System.out.println("O cancelamento parcial foi feito com sucesso");
		}
	}
	
}
