package exercicio5;

public class Triangulo {
	 
	private Double la, lb, lc;
	public Triangulo() {
	
	}
	public Double getLa() {
		return la;
	}
	public void setLa(Double la) {
		this.la = la;
	}
	public Double getLb() {
		return lb;
	}
	public void setLb(Double lb) {
		this.lb = lb;
	}
	public Double getLc() {
		return lc;
	}
	public void setLc(Double lc) {
		this.lc = lc;
	}
	
	public boolean verificaEquilatero() {
        return la == lb && la == lc;
    }
}
