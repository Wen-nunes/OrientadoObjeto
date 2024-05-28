package exercicio8;

public class ReservaHotel extends Reserva {
	
	private String hotel;
    private int noites;

    public ReservaHotel(String id, String hotel, int noites) {
		super(id);
		this.hotel = hotel;
		this.noites = noites;
	}

	@Override
    public void adicionar() {
        System.out.println("Reserva de hotel adicionada: " + hotel + " por " + noites + " noites. (ID: " + id + ")");
    }

    @Override
    public void cancelar() {
        System.out.println("Cancelamento da reserva de hotel: " + hotel + " (ID: " + id + ")");
    }
}
