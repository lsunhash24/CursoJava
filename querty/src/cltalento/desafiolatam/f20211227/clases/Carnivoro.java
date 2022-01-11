package cltalento.desafiolatam.f20211227.clases;

import java.util.ArrayList;

public abstract class Carnivoro extends Animal {
	
	private ArrayList<String> carnesFavoritas;

	public Carnivoro() {
		super();
	}

	public ArrayList<String> getCarnesFavoritas() {
		return carnesFavoritas;
	}

	public void setCarnesFavoritas(ArrayList<String> carnesFavoritas) {
		this.carnesFavoritas = carnesFavoritas;
	}
	
	
	
	

}
