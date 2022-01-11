package cl.desafiolatam.clases;

public class Taxi extends Vehiculo { // hereda los atributos de la superclase vehiculo
	// atributos propios
	private int valorPasaje;

	// constructor sin parametros
	public Taxi() {
		super();
	}

	// constructor con parametros
	public Taxi(String color, String patente, int valorPasaje) {
		super(color, patente);
		this.valorPasaje = valorPasaje;
	}
	
	// accesadores y mutadores de la subclase Taxi
	public int getValorPasaje() {
		return valorPasaje;
	}

	public void setValorPasaje(int valorPasaje) {
		this.valorPasaje = valorPasaje;
	}
	// métodos
	
	@Override
	public String toString() {
		return "Taxi [valorPasaje=" + valorPasaje + ", color=" + color + ", patente=" + patente + "]";
	}

	public void pagarPasaje(int valorPagado) {
		
		if (valorPagado>valorPasaje) {
			
			int vuelto=valorPagado-valorPasaje;
			System.out.println("El valor del vuelto es: "+vuelto);
		}else {
			
			System.out.println("Valor pagado inferior a tarifa inicial, falta completar !!!");
		}
		
		
	}
	
	
	
}
