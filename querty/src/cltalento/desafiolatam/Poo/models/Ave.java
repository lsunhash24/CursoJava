package cltalento.desafiolatam.Poo.models;

public class Ave extends Animal {

	private String tipo;

	public Ave() {
		super();
	}

	

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public Ave(String nombre, String raza, String color, String tipo) {
		super(nombre, raza, color);
		this.tipo = tipo;
	}

}
