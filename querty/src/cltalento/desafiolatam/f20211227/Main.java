package cltalento.desafiolatam.f20211227;

import java.util.ArrayList;
import cltalento.desafiolatam.f20211227.clases.Animal;
import cltalento.desafiolatam.f20211227.clases.Caballo;
import cltalento.desafiolatam.f20211227.clases.Conejo;
import cltalento.desafiolatam.f20211227.clases.Herbivoro;
import cltalento.desafiolatam.f20211227.clases.Humano;

public class Main {

	public static void main(String[] args) {
		// no se puede instanciar
		//Animal animal = new Animal();
		//Omnivoro omni = new Omnivoro();
		
		//Humano humano = new Humano();
		
		ArrayList<Animal> listaAnimales= new ArrayList<Animal>();
		ArrayList<Herbivoro> listaHerbivoros= new ArrayList<Herbivoro>();
		
		Conejo conejo = new Conejo();
		Caballo caballo = new Caballo();
		
		listaAnimales.add(conejo);  // lista polimórfica
		listaAnimales.add(caballo);
		listaHerbivoros.add(conejo); // lista polimórfica
		listaHerbivoros.add(caballo);
		

		
		for (Animal animales : listaAnimales) {
			System.out.println(animales.toString());
					
		}
		
		for (Herbivoro herbivoro : listaHerbivoros) {
			System.out.println(herbivoro.toString());
			
		}
			
	}

}
