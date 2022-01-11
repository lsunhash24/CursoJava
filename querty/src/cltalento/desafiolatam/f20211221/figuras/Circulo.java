package cltalento.desafiolatam.f20211221.figuras;

public class Circulo extends Figura {
	
	private float radio;

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

	public void pintar() {
		System.out.println("Metodo pintar() en Círculo");
		
	}
	
	
}
