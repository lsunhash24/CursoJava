package cl.desafiolatam.clases;

public class MiniBus extends Bus{// hereda atributos de las superclases Vehiculo y Bus
	//atributo propio
	private String tipoViaje;
	
	// método contructor sin parámetros
	public MiniBus() {
		super();
	}
	// método constructor con parámetros
	public MiniBus(String color, String patente, int cantidadDeAsientos, String tipoViaje) {
		super(color, patente, cantidadDeAsientos);
		this.tipoViaje = tipoViaje;
	}
	// accesadores y mutadores
	public String getTipoViaje() {
		return tipoViaje;
	}

	public void setTipoViaje(String tipoViaje) {
		this.tipoViaje = tipoViaje;
	}
	// métodos
	@Override
	public String toString() {
		return "MiniBus [tipoViaje=" + tipoViaje + ", color=" + color + ", patente=" + patente
				+ ", CantidadDeAsientos = " + getCantidadDeAsientos() + "]";
	}

	public void imprimeBus() {
		
		System.out.println("******  Datos MiniBus ******");
		System.out.println("Color mini bus= " +color );
		System.out.println("Patente mini bus= " +patente );
		System.out.println("Tipo viaje mini bus=  " +tipoViaje );
		System.out.println("Cantidad de asientos mini bus= " +getCantidadDeAsientos());
		
	}
	
	
}
