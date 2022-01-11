package cl.desafiolatam;

public class Taxi {
	// declaración de variables (atributos)
	private String color;
	private String patente;
	private int valorPasaje;

	// método constructor con parámetros

	public Taxi(String color, String patente, int valorPasaje) {
		super();
		this.color = color;
		this.patente = patente;
		this.valorPasaje = valorPasaje;
	}

	// método constructor sin parámetros

	public Taxi() {
		super();
	}

	// métodos accesadores

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPatente() {
		return patente;
	}

	// métodos mutadores

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public int getValorPasaje() {
		return valorPasaje;
	}

	public void setValorPasaje(int valorPasaje) {
		this.valorPasaje = valorPasaje;
	}

	// método toString, convierte en String la clase Taxi

	@Override
	public String toString() {
		return "Taxi [color=" + color + ", patente=" + patente + ", valorPasaje=" + valorPasaje + "]";
	}

	// método pagar pasaje

	public void pagarPasaje(int pasaje) {

	}

}
