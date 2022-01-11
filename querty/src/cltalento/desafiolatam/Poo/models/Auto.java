package cltalento.desafiolatam.Poo.models;

public class Auto {
	
	private String color;
	private float velocidad;
	private Float motor;
	private int ruedas;
	public String nombre;
	
	
	public Auto() {
		super();
	}


	public Auto(String color, float velocidad, float motor, int ruedas) {
		super();
		this.color = color;
		this.velocidad = velocidad;
		this.motor = motor;
		this.ruedas = ruedas;
	}


	// otro constructor con dos atributos
	public Auto(String color, int ruedas) {
		super();
		this.color = color;
		this.ruedas = ruedas;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public float getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(float velocidad) {
		this.velocidad = velocidad;
	}


	public float getMotor() {
		return motor;
	}


	public void setMotor(float motor) {
		this.motor = motor;
	}


	public int getRuedas() {
		return ruedas;
	}


	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}


	@Override
	public String toString() {
		return "Mi Super auto [Color=" + color + ", velocidad=" + velocidad + ", motor=" + motor + ", ruedas=" + ruedas + "]";
	}
		
	public void miMetodo() {
		System.out.println("Estoy en mi método");
		
	}
	
	
	

}
