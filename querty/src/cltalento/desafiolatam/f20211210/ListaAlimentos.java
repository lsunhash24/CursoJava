package cltalento.desafiolatam.f20211210;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ListaAlimentos {

	public static void main(String[] args) {
		
	obtenerMaxMin();
	
	
		
	}

	public static void obtenerMaxMin() {
		
		ArrayList<Float> notas = new ArrayList<Float>();
		notas.add(4.7f);
		notas.add(2.3f);
		notas.add(5.4f);
		notas.add(6.9f);
		notas.add(4.4f);
		notas.add(2.6f);
		Collections.max(notas);
		Collections.min(notas);
		
		
		
		for (Iterator iterator = notas.iterator(); iterator.hasNext();)
		{
			Float elemento = (Float) iterator.next();
			System.out.println("notas: "+ elemento);
			System.out.println("notas: "+ elemento);
		}
		}

		
		
		
		
		
		
		
		
}
