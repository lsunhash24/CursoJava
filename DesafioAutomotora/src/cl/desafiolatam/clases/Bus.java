package cl.desafiolatam.clases;

public class Bus extends Vehiculo { // hereda atributos de la superclase Vehiculo
	// atributos
	public int cantidadDeAsientos;  // modificador de acceso público porque es superclase

	// constructor sin parametros
	public Bus() {
		super();
	}
	 // constructor con parametros
	public Bus(String color, String patente, int cantidadDeAsientos) {
		super(color, patente);
		this.cantidadDeAsientos = cantidadDeAsientos;
	}
		// accesadores y mutadores
	public int getCantidadDeAsientos() {
		return cantidadDeAsientos;
	}

	public void setCantidadDeAsientos(int cantidadDeAsientos) {
		this.cantidadDeAsientos = cantidadDeAsientos;
	}
	// métodos
	@Override
	public String toString() {
		return "Bus [cantidadDeAsientos=" + cantidadDeAsientos + ", color=" + color + ", patente=" + patente + "]";
	}

	public int asientosDisponibles(int asientosOcupados) {
		
		int asientosDesocupados = this.cantidadDeAsientos - asientosOcupados;
				
		return asientosDesocupados;
	}

}
