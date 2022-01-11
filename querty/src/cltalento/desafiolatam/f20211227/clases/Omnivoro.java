package cltalento.desafiolatam.f20211227.clases;

public abstract class Omnivoro extends Animal{
	
	private String comidasFavoritas;

	public Omnivoro(String comidasFavoritas) {
		super();
		this.comidasFavoritas = comidasFavoritas;
	}

	public Omnivoro() {
		super();
	}

	public String getComidasFavoritas() {
		return comidasFavoritas;
	}

	public void setComidasFavoritas(String comidasFavoritas) {
		this.comidasFavoritas = comidasFavoritas;
	}
	
	public void metodoOmnivoro() {
		
		System.out.println("Método Omnivoro");
		
		
		
	}
	
	
	

}
