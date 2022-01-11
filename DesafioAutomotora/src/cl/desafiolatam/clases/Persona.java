package cl.desafiolatam.clases;

public class Persona {
	// atributos con modificadores de acceso públicos porque es una superclase
	public String rut;
	public String nombre;
	
	// método constructor sin parámetros
	public Persona() {
		super();
	}
	// método constructor con parámetros
	public Persona(String rut, String nombre) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		
	}
	//accesadores y mutadores
	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	// métodos
	@Override
	public String toString() {
		return "Persona [rut=" + rut + ", nombre=" + nombre + "]";
	}
	
	
}
