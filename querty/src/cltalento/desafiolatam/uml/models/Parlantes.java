package cltalento.desafiolatam.uml.models;

public class Parlantes {
	
	private int tama�o;
	private double altura;
	private String marca;
	
	
	public Parlantes(int tama�o, double altura, String marca) {
		super();
		this.tama�o = tama�o;
		this.altura = altura;
		this.marca = marca;
	}


	public Parlantes() {
		super();
	}


	public int getTama�o() {
		return tama�o;
	}


	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	@Override
	public String toString() {
		return "Parlantes [tama�o=" + tama�o + ", altura=" + altura + ", marca=" + marca + "]";
	}
	
//	
	

}
