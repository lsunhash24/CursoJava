package cl.desafiolatam.clases;

public class Vehiculo {
	// atributos con modificadores de acceso tipo público porque es una superclase
	public String color;
	public String patente;
	
	// constructor sin parametros
	public Vehiculo() {
		super();
	}
	// constructor con parámetros
	public Vehiculo(String color, String patente) {
		super();
		this.color = color;
		this.patente = patente;
	}
		 
	// accesadores y mutadores
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
		
	// método toString que devuelve el valor de los atributos
	}
	@Override
	public String toString() {
		return "Vehiculo [color=" + color + ", patente=" + patente + "]";
	}

}
