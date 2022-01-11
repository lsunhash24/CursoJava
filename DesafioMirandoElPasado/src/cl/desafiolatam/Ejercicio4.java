package cl.desafiolatam;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio4 {// uso coleccion Queue

	public static void main(String[] args) {
		    // se instancia la colección Queue tipo string llamada juegos implementada con LinkedList
			Queue<String> juegos = new LinkedList<>();
			
			// se agregan elementos a la lista
			juegos.add("Tombo");
			juegos.add("Congelado");
			juegos.add("Quemaditas");
			juegos.add("Cachipun");
			juegos.add("Pillarse");
			
			System.out.println(juegos);
			System.out.println();
			
			// Imprime por consola la cantidad de elementos ingresados a la cola 
			System.out.println("La cantidad de juegos ingresados a la cola es: " + juegos.size());
		

	}

}
