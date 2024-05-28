package exercicio8;

public class Principal {

	public static void main(String[] args) {
		 Reserva reservaHotel = new ReservaHotel("wdll22", "Hotel Habbo", 3);
	     reservaHotel.adicionar();
	        
	     ReservaDeVoo reservaVooEconomica = new ReservaDeVoo("V456", "TAM", "ultimate class");
	     reservaVooEconomica.adicionar();
	        
	     reservaVooEconomica.adicionar("Executiva");

	     reservaHotel.cancelar();
	     reservaVooEconomica.cancelar();

	}

}