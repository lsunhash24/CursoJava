package cltalento.desafiolatam.f20211221.figuras;

public class Figura {
	
	private String color;

	public Figura() {
		super();
	}

	public Figura(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Figura [color=" + color + "]";
	}
	
	// metodos
	public void pintar() {
		System.out.println("Metodo pintar() en Figura");
		
	}
	
	

}
