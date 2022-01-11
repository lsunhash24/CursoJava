package cl.desafiolatam;
//alumno: Luis Sanhueza
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio2 { // uso de colección Set

	public static void main(String[] args) {
		// se instancian colecciones Set tipo string, la lista "invitados" se implementa con TreeSet para
		// entregar la lista ordenada
		Set<String> invitados = new TreeSet<>();
		Set<String> posiblesInvitados = new HashSet<>();
		
		// se agrega elementos a la lista "invitados"
		invitados.add("Daniel");
		invitados.add("Paola");
		invitados.add("Facundo");
		invitados.add("Pedro");
		invitados.add("Jacinta");
		invitados.add("Florencia");
		invitados.add("Juan Pablo");
		System.out.println(invitados);
		System.out.println();
		
		// se agregan elementos a la lista "posiblesInvitados"
		posiblesInvitados.add("Jorge");
		posiblesInvitados.add("Francisco");
		posiblesInvitados.add("Marcos");
		
		// se agregan elementos a la lista "invitados" a través de la lista "posiblesInvitados"
		invitados.addAll(posiblesInvitados);
		
		// se imprime por consola la lista de invitados
		System.out.println(invitados);
		System.out.println();
		
		//se elimina un elemento de la lista "invitados"
		System.out.println(invitados.remove("Jorge")); 
		System.out.println();
		// se imprime por consola la lista final de invitados
		System.out.println(invitados);

	}

}
