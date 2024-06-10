package exercicio4;

public abstract class Animal {
	
	protected String especie;
	protected int   idade;

	
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public abstract void emiteSom();
	
	public void mostrarDados() {
		System.out.println("Especie: "+especie+"  Idade: " + idade);
	}

}
