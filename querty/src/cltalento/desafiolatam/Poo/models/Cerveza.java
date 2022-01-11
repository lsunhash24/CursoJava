package cltalento.desafiolatam.Poo.models;

public class Cerveza extends Botella {
	private int precio;

	public Cerveza() {
		super();

	}

	public Cerveza(String tipoBotella, String marca, int precio) {
		super(tipoBotella, marca);
		this.precio = precio;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

}
