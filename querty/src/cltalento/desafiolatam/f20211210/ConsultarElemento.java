package cltalento.desafiolatam.f20211210;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ConsultarElemento {

	public static void main(String[] args) {

		consultarNombre();

	}

	public static void consultarNombre() {

		ArrayList<String> nombres = new ArrayList<String>();
		ArrayList<String> nombreNoEncontrado = new ArrayList<String>();
		ArrayList<String> nombreEncontrado = new ArrayList<String>();

		nombres.add("Luis");
		nombres.add("Alberto");
		nombres.add("Pedro");
		nombres.add("Claudia");
		nombres.add("Rodrigo");

		int opcion1=0;
		do {
			Scanner leer = new Scanner(System.in);
			System.out.println("Ingrese un nombre: ");
			String nombre = leer.next();

			for (Iterator<String> iterator = nombres.iterator(); iterator.hasNext();) {

				String elemento = (String) iterator.next();

				if (elemento.equalsIgnoreCase(nombre)) {

					nombreEncontrado.add(nombre);

				} else {
					nombreNoEncontrado.add(elemento);
					
				}
			}
			System.out.println("*Desea consultar otro nombre *");
			System.out.println("* (0) NO - (1) SI *");
		    opcion1 = leer.nextInt();
			leer.nextLine();
			
			
		}while (opcion1 == 1);
		
		nombres.removeAll(nombreNoEncontrado);
		System.out.println("Nombres encontrados: " + nombreEncontrado);
		System.out.println("Nombres no encontrados eliminados !!!" + nombreNoEncontrado);

		System.out.println();
	}

}
