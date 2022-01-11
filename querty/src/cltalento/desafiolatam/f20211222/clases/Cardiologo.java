package cltalento.desafiolatam.f20211222.clases;

public class Cardiologo extends Medico {
	
	private String especialidad;

	public Cardiologo() {
		super();
		
	}

	public Cardiologo(String nombre, String rut, int edad, String especialidad) {
		super(nombre, rut, edad);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Cardiologo [especialidad=" + especialidad + "]";
	}

	public void consulta() {
		System.out.println("Cardiólogo: Diagnostica y trata problemas y cardiacos y del aparato circulatorio");
	}

}
