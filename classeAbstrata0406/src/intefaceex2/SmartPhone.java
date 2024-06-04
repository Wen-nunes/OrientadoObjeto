package intefaceex2;

public class SmartPhone implements Pc, Celular {
	public int tel;
	public String email;

	public SmartPhone(int tel, String email) {
		super();
		this.tel = tel;
		this.email = email;
	}

	@Override
	public void realizaChamada() {
		System.out.println("Verificando email...");

	}

	@Override
	public void verificaEmail() {
		System.out.println("Realizando chamada...");
	}

}
