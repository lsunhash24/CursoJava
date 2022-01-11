package cltalento.desafiolatam.uml;

import java.util.Date;

	public class Persona() {
	String nombre;
	int edad;
	date fechaNacimiento;



	// constructor con parametros
	public Persona(String nombre, int edad, Date fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
	}

// constructor sin parametros
	public Persona() {

	}

public static void caminar() {

}





public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public Date getFechaNacimiento() {
	return fechaNacimiento;
}

public void setFechaNacimiento(Date fechaNacimiento) {
	this.fechaNacimiento = fechaNacimiento;
}
}