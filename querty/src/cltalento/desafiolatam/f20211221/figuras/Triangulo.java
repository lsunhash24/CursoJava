package cltalento.desafiolatam.f20211221.figuras;

public class Triangulo extends Figura {
	
	 private float altura;
	 
	
	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public void pintar() {
		System.out.println("Metodo pintar() en Triangulo");
		
	}


}
