package cl.desafiolatam;

import java.util.Map;
import java.util.TreeMap;

public class Ejercicio3 { // uso interfaz Map

	public static void main(String[] args) {
		// se instancia una lista Map tipo TreeMap para que entregue los elementos ordenados
		Map<String, Integer> golosinas = new TreeMap<>();
		
		// se agregan elementos mediante el método "put"
		golosinas.put("Chocman", 100);
		golosinas.put("Trululú", 100);
		golosinas.put("Centella", 100);
		golosinas.put("Kilate", 50);
		golosinas.put("Miti-miti", 30);
		golosinas.put("Traga Traga", 150);
		golosinas.put("Tabletón", 5);
		
		// se imprime por consola el mapa de golosinas
		System.out.println(golosinas);
		System.out.println();
		
		// se filtran las golosinas con precio inferior a $ 100 y se listan por consola
		System.out.println("Golosinas con valor inferior a 100 pesos");
		golosinas.entrySet().stream().filter(precio -> precio.getValue()<100).forEach(System.out::println);
		
		}

}
