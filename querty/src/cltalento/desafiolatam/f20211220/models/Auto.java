package cltalento.desafiolatam.f20211220.models;

public class Auto {

	// atributos
	private String marca;
	private Float motor;
	private String color;
	private float velocidad;
	public String pruebaEstatica;
	private boolean patente;
	private boolean permisoCirculacion;
	private int revisionTecnica;

	// constructores

	public Auto() {
		super();
	}

	public Auto(String marca, Float motor, String color, float velocidad, boolean patente, boolean permisoCirculacion,
			int revisionTecnica) {
		super();
		this.marca = marca;
		this.motor = motor;
		this.color = color;
		this.velocidad = velocidad;
		this.patente = patente;
		this.permisoCirculacion = permisoCirculacion;
		this.revisionTecnica = revisionTecnica;
	}

	// getters&Setters

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Float getMotor() {
		return motor;
	}

	public void setMotor(Float motor) {
		this.motor = motor;
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

	public boolean isPatente() {
		return patente;
	}

	public void setPatente(boolean patente) {
		this.patente = patente;
	}

	public boolean isPermisoCirculacion() {
		return permisoCirculacion;
	}

	public void setPermisoCirculación(boolean permisoCirculacion) {
		this.permisoCirculacion = permisoCirculacion;
	}

	public int getRevisionTecnica() {
		return revisionTecnica;
	}

	public void setRevisionTecnica(int revisionTecnica) {
		this.revisionTecnica = revisionTecnica;
	}

	// metodos

	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", motor=" + motor + ", color=" + color + ", velocidad=" + velocidad
				+ ", patente=" + patente + ", permisoCirculacion=" + permisoCirculacion + ", revisionTecnica="
				+ revisionTecnica + "]";
	}

	public void aumentarVelocidad() {
		velocidad = velocidad + 10;
		System.out.println("La velocidad es: " + velocidad);
	}

	public void aumentarVelocidad(float velocidad) {
		if (velocidad < 15) {
			velocidad = 0;
		} else {
			velocidad = velocidad -5;

			System.out.println("La velocidad es: " + velocidad);
		}
	}

	public void aumentarVelocidad(boolean acelerar, boolean frenar) {
		if (acelerar) {
			velocidad = velocidad + 15;
		} else if (frenar) {
			velocidad = velocidad - 15;
		}

		System.out.println("La velocidad es: " + velocidad);
	}

	public void circulacionCiudad(int revisionTecnica) {

		this.revisionTecnica = 2021;

	}

	public void circulacionCiudad(int revision,boolean permiso, boolean patente) {
		this.revisionTecnica=revision;
		this.permisoCirculacion = permiso;
		this.patente = patente;

	}

	public void circulacionCiudad() {
		if (revisionTecnica >= 2021 && permisoCirculacion == true && patente == true) {
			System.out.println("El auto puede circular");
		} else {

			System.out.println("El auto no puede circular");

		}

	}

}
