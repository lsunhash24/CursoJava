package cl.desafiolatam.clases;

public class Cliente extends Persona {  // hereda atributos de la superclase Persona
	// atributos propios
	private int edad;
	// m�todo constructor sin par�metros
	public Cliente() {
		super();
	}
	// m�todo constructor con par�metros
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
	// m�todos
	@Override
	public String toString() {
		return "Cliente [edad=" + edad + ", rut=" + rut + ", nombre=" + nombre + "]";
	}
	
		
	
}
