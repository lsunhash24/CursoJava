package cl.desafiolatam.clases;

public class Vendedor extends Persona{ // hereda atributos de la superclase Persona
	// atributos propios
	private String direccion;
	
	// método constructor sin parámetros
	public Vendedor() {
		super();
	}
	// método constructor con parametros
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
	// métodos
	@Override
	public String toString() {
		return "Vendedor [direccion=" + direccion + ", rut=" + rut + ", nombre=" + nombre + "]";
	}
	

	
	
	
	
}
