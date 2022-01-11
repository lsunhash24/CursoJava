package cltalento.desafiolatam.uml.models;

public class Bateria {

	private int cantidadPlatillos;
	private int tipoPedal;
	private int cantidadCajas;
	
	public Bateria(int cantidadPlatillos, int tipoPedal, int cantidadCajas) {
		super();
		this.cantidadPlatillos = cantidadPlatillos;
		this.tipoPedal = tipoPedal;
		this.cantidadCajas = cantidadCajas;
	}
	
	public Bateria() {
		super();
	}

	public int getCantidadPlatillos() {
		return cantidadPlatillos;
	}

	public void setCantidadPlatillos(int cantidadPlatillos) {
		this.cantidadPlatillos = cantidadPlatillos;
	}

	public int getTipoPedal() {
		return tipoPedal;
	}

	public void setTipoPedal(int tipoPedal) {
		this.tipoPedal = tipoPedal;
	}

	public int getCantidadCajas() {
		return cantidadCajas;
	}

	public void setCantidadCajas(int cantidadCajas) {
		this.cantidadCajas = cantidadCajas;
	}

	@Override
	public String toString() {
		return "Bateria [cantidadPlatillos=" + cantidadPlatillos + ", tipoPedal=" + tipoPedal + ", cantidadCajas="
				+ cantidadCajas + "]";
	}
	
	
	
	
	
	
}
