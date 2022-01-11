package cl.desafiolatam;
// alumno: Luis Sanhueza
import java.util.ArrayList;

public class Ejercicio1 { //  uso de ArrayList

	public static void main(String[] args) {
		// se crean instancias de arreglos tipo string
		ArrayList<String> marcas = new ArrayList<>();
		ArrayList<String> nuevasMarcas = new ArrayList<>();
		ArrayList<String> posiblesMarcas = new ArrayList<>();
		// se agregan elementos a la lista
		marcas.add("Compaq");
		marcas.add("Kodak");
		marcas.add("Banesto");
		marcas.add("Brahama");
		marcas.add("Corte Ingles");
		marcas.add("Nuria");
		marcas.add("Macromedia");
		marcas.add("Calaf");
		marcas.add("Free");
		marcas.add("MitiMiti");
		System.out.println(marcas);
		// se agregan elementos a lista de nuevas marcas
		nuevasMarcas.add("Blokbaster");
		nuevasMarcas.add("Carrefour");
		nuevasMarcas.add("Jetix");
		// se agregan a la lista "marcas" las nuevas marcas
		marcas.addAll(nuevasMarcas);
		System.out.println();
		System.out.println(marcas);
		// se modifica un elemento
		marcas.set(10,"Blockbuster");
		System.out.println();
		System.out.println(marcas);
		// se remueve o elimina un elemento
		System.out.println();
		System.out.println(marcas.remove("Carrefour"));
		System.out.println(marcas);
		// se agregan marcas a la lista de posibles marcas
		posiblesMarcas.add("Nextel");
		posiblesMarcas.add("Machasa");
		posiblesMarcas.add("Globus 120");
		posiblesMarcas.add("Telex-Chile");
		// se agregan elementos a lista "marcas" desde la lista "posiblesMarcas"
		marcas.addAll(posiblesMarcas);
		System.out.println();
		System.out.println(marcas);
		System.out.println();
		// Se imprime por consola la cantidad de marcas de la lista "marcas"
		System.out.println("La cantidad de marcas ingresadas es: " + marcas.size());
		
		
		
	
	}

}
