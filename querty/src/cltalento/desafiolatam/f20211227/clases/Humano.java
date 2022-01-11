package cltalento.desafiolatam.f20211227.clases;

import cltalento.desafiolatam.f20211227.interfaces.Genericos;

public class Humano extends Omnivoro implements Genericos{
	
	private boolean razonamiento;

	public Humano() {
		super();
	}

	public Humano(boolean razonamiento) {
		super();
		this.razonamiento = razonamiento;
	}

	public boolean isRazonamiento() {
		return razonamiento;
	}

	public void setRazonamiento(boolean razonamiento) {
		this.razonamiento = razonamiento;
	}

	@Override
	public void metodoAnimal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void respirar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int caminar() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
