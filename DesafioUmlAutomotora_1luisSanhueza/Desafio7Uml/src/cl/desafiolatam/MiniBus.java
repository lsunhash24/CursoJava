package cl.desafiolatam;

public class MiniBus {

	private String color;
	private String patente;
	private String tipoViaje;
	private int cantidadDeAsientos;

	public MiniBus(String color, String patente, String tipoViaje, int cantidadDeAsientos) {
		super();
		this.color = color;
		this.patente = patente;
		this.tipoViaje = tipoViaje;
		this.cantidadDeAsientos = cantidadDeAsientos;
	}

	public MiniBus() {
		super();
	}

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
	}

	public String getTipoViaje() {
		return tipoViaje;
	}

	public void setTipoViaje(String tipoViaje) {
		this.tipoViaje = tipoViaje;
	}

	public int getCantidadDeAsientos() {
		return cantidadDeAsientos;
	}

	public void setCantidadDeAsientos(int cantidadDeAsientos) {
		this.cantidadDeAsientos = cantidadDeAsientos;
	}

	@Override
	public String toString() {
		return "MiniBus [color=" + color + ", patente=" + patente + ", tipoViaje=" + tipoViaje + ", cantidadDeAsientos="
				+ cantidadDeAsientos + "]";
	}

	public void imprimeBus() {

	}

}
