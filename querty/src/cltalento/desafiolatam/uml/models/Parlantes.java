package cltalento.desafiolatam.uml.models;

public class Parlantes {
	
	private int tamaño;
	private double altura;
	private String marca;
	
	
	public Parlantes(int tamaño, double altura, String marca) {
		super();
		this.tamaño = tamaño;
		this.altura = altura;
		this.marca = marca;
	}


	public Parlantes() {
		super();
	}


	public int getTamaño() {
		return tamaño;
	}


	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
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
		return "Parlantes [tamaño=" + tamaño + ", altura=" + altura + ", marca=" + marca + "]";
	}
	
//	
	

}
