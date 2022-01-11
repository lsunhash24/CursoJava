package cltalento.desafiolatam.Poo.models;

public class Vehiculo {
	
	public String color;
	public float velocidad;
	public int ruedas;
	public Float motor;
	
	public Vehiculo(String color, float velocidad, int ruedas, Float motor) {
		super();
		this.color = color;
		this.velocidad = velocidad;
		this.ruedas = ruedas;
		this.motor = motor;
	}

	public Vehiculo() {
		super();
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

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public Float getMotor() {
		return motor;
	}

	public void setMotor(Float motor) {
		this.motor = motor;
	}
	
	
	
}
	
	