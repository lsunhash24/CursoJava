package cltalento.desafiolatam.f20211221.models;

public abstract class Mascota {
	
	private String nombre;
	private String color;
	private String raza;
	
	
	public Mascota() {
		super();
	}


	public Mascota(String nombre, String color, String raza) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.raza = raza;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", color=" + color + ", raza=" + raza + "]";
	}
	
	public abstract int horasSueños();
	

}
