package exercicio8;

public class ReservaDeVoo extends Reserva {
	
	private String voo;
    private String classe;
    
	public ReservaDeVoo(String id, String voo, String classe) {
		super(id);
		this.voo = voo;
		this.classe = classe;
	}
    
	 public void adicionar(String classe) {
	        this.classe = classe;
	        adicionar();
	    }

	    @Override
	    public void adicionar() {
	        System.out.println("Reserva de voo adicionada: Voo " + voo + " na classe " + classe + ". (ID: " + id + ")");
	    }

	    @Override
	    public void cancelar() {
	        System.out.println("Cancelamento da reserva de voo: Voo " + voo + " na classe " + classe + " (ID: " + id + ")");
	    }

}
