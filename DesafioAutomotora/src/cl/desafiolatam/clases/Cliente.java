package cl.desafiolatam.clases;

public class Cliente extends Persona {  // hereda atributos de la superclase Persona
	// atributos propios
	private int edad;
	// método constructor sin parámetros
	public Cliente() {
		super();
	}
	// método constructor con parámetros
	public Cliente(String rut, String nombre, int edad) {
		super(rut, nombre);
		this.edad = edad;
	}
	// accesadores y mutadores
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	// métodos
	@Override
	public String toString() {
		return "Cliente [edad=" + edad + ", rut=" + rut + ", nombre=" + nombre + "]";
	}
	
		
	
}
