package cl.desafiolatam.clases;

public class Vendedor extends Persona{ // hereda atributos de la superclase Persona
	// atributos propios
	private String direccion;
	
	// m�todo constructor sin par�metros
	public Vendedor() {
		super();
	}
	// m�todo constructor con parametros
	public Vendedor(String rut, String nombre, String direccion) {
		super(rut, nombre);
		this.direccion = direccion;
	}
	// accesadores y mutadores
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	// m�todos
	@Override
	public String toString() {
		return "Vendedor [direccion=" + direccion + ", rut=" + rut + ", nombre=" + nombre + "]";
	}
	

	
	
	
	
}
