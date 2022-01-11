package cl.desafiolatam;

public class Taxi {
	// declaraci�n de variables (atributos)
	private String color;
	private String patente;
	private int valorPasaje;

	// m�todo constructor con par�metros

	public Taxi(String color, String patente, int valorPasaje) {
		super();
		this.color = color;
		this.patente = patente;
		this.valorPasaje = valorPasaje;
	}

	// m�todo constructor sin par�metros

	public Taxi() {
		super();
	}

	// m�todos accesadores

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPatente() {
		return patente;
	}

	// m�todos mutadores

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public int getValorPasaje() {
		return valorPasaje;
	}

	public void setValorPasaje(int valorPasaje) {
		this.valorPasaje = valorPasaje;
	}

	// m�todo toString, convierte en String la clase Taxi

	@Override
	public String toString() {
		return "Taxi [color=" + color + ", patente=" + patente + ", valorPasaje=" + valorPasaje + "]";
	}

	// m�todo pagar pasaje

	public void pagarPasaje(int pasaje) {

	}

}
