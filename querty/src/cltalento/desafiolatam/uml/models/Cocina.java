package cltalento.desafiolatam.uml.models;

public class Cocina {
	// atributos
	private Double altura;
	private int cantidadHornillas;
	
	// constructor con parametros
	public Cocina(Double altura, int cantidadHornillas) {
		super();
		this.altura = altura;
		this.cantidadHornillas = cantidadHornillas;
	}


	// contructor sin parametros
	public Cocina() {
		super();
	}

	// get and setter
	public Double getAltura() {
		return altura;
	}


	public void setAltura(Double altura) {
		this.altura = altura;
	}


	public int getCantidadHornillas() {
		return cantidadHornillas;
	}


	public void setCantidadHornillas(int cantidadHornillas) {
		this.cantidadHornillas = cantidadHornillas;
	}

// to string
	@Override
	public String toString() {
		return "Cocina [altura=" + altura + ", cantidadHornillas=" + cantidadHornillas + "]";
	}

	// metodo
		public String prenderHorno() {
			return null;
			
			
			
		}
	
	

}
