package cl.desafiolatam;

public class Bus {
	
	private String color;
	private String patente;
	private int cantidaDeAsientos;
	
	
	public Bus(String color, String patente, int cantidaDeAsientos) {
		super();
		this.color = color;
		this.patente = patente;
		this.cantidaDeAsientos = cantidaDeAsientos;
	}


	public Bus() {
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


	public int getCantidaDeAsientos() {
		return cantidaDeAsientos;
	}


	public void setCantidaDeAsientos(int cantidaDeAsientos) {
		this.cantidaDeAsientos = cantidaDeAsientos;
	}


	@Override
	public String toString() {
		return "Bus [color=" + color + ", patente=" + patente + ", cantidaDeAsientos=" + cantidaDeAsientos + "]";
	}
	
	public int asientosDisponibles() {
		int asientos=0;
		return asientos;
	}
	

	
	
	
	
	
	
	
	
	
}
