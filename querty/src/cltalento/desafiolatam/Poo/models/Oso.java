package cltalento.desafiolatam.Poo.models;

public class Oso extends Animal{
	
	private String tipo;
	
	
	public Oso() {
		// TODO Auto-generated constructor stub
	}


	public Oso(String nombre, String raza, String color, String tipo) {
		super(nombre, raza, color);
		this.tipo = tipo;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
	
}
