package cltalento.desafiolatam.f20211227.clases;

import java.util.List;

public abstract class Herbivoro extends Animal {

	private List<String> vegetalesFavoritos;

	public Herbivoro() {
		super();
	}

	public List<String> getVegetalesFavoritos() {
		return vegetalesFavoritos;
	}

	public void setVegetalesFavoritos(List<String> vegetalesFavoritos) {
		this.vegetalesFavoritos = vegetalesFavoritos;
	}

	public abstract void metodoHerbivoro();

}
