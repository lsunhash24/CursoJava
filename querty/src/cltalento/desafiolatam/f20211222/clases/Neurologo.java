package cltalento.desafiolatam.f20211222.clases;

public class Neurologo extends Medico{

	private String especialidad;

	public Neurologo() {
		super();
		
	}

	public Neurologo(String nombre, String rut, int edad, String especialidad) {
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
		return "Neurologo [especialidad=" + especialidad + "]";
	}

	public void consulta() {
		
		System.out.println("Neurología: Diagnostica trastornos de la cognición y conciencia");
	}
	
	
}
