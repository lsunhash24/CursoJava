package cltalento.desafiolatam.uml.models;

public class Guitarra {
	
	private String tipoMastil;
	private String marca;
	
	
	public Guitarra(String tipoMastil, String marca) {
		super();
		this.tipoMastil = tipoMastil;
		this.marca = marca;
	}


	public Guitarra() {
		super();
	}


	public String getTipoMastil() {
		return tipoMastil;
	}


	public void setTipoMastil(String tipoMastil) {
		this.tipoMastil = tipoMastil;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	@Override
	public String toString() {
		return "Guitarra [tipoMastil=" + tipoMastil + ", marca=" + marca + "]";
	}
	
	
	
	

}
