package exemplo2;

public class Principal {

	public static void main(String[] args) {
	    Forma f = new Retangulo(13, 10);
	    
	    System.out.println("A area do retangulo e: " + f.area() );
	    System.out.println("O perimetro do retangulo e: " + f.perimetro() );
	    
	    Circulo c = new Circulo(4);
	    
	    System.out.println("A area do retangulo e: " + c.area());
	    System.out.println("O perimetro do retangulo e: " + c.perimetro());

	}

}
