package cltalento.desafiolatam.f20211220.models;

import java.util.ArrayList;
import java.util.Scanner;

public class Reproductor {

	public static void main(String[] args) {
		
		Scanner leer=new Scanner(System.in);
		
		System.out.println("1.- La isla bonita");
		System.out.println("2.- What is love");
		System.out.println("3.- Good Times");
		System.out.println("4.- Celebrations");
		System.out.println("5.- Ladys night");
		System.out.println("6.- Ciudad de la furia");
		System.out.println("7.- Get down on it");
				
		
		System.out.println("Ingrese número canción:...");
		
		String num=leer.nextLine();
		
		
		
		String tema=reproductor(num);
		System.out.println("La cancion seleccionada es: " + tema);
		
		leer.close();
		
	}
		
		public static String reproductor(String numero) {
			
			ArrayList<String> canciones = new ArrayList<String>();
			String cancion="";
			
			canciones.add("La isla bonita");
			canciones.add("What is love");
			canciones.add("Good Times");
			canciones.add("Celebrations");
			canciones.add("Ladys night");
			canciones.add("Ciudad de la furia");
			canciones.add("Get down on it");
						
			try {
			
				
			int indice = Integer.parseInt(numero)-1;
			//if(indice >=0) {
			cancion = canciones.get(indice);
			//}
			
			}
			catch (IndexOutOfBoundsException e) {
			// Error si el indice de la cancion es mayor al tamaño del arreglo
				
			System.out.println("Error, índice ingresado fuera de rango");
			throw new IndexOutOfBoundsException(e.getMessage());
			}
			catch (NumberFormatException e) {
			// Error cuando el parámetro sea distinto a un numero
				
			System.out.println("Parámetro ingresado incorrecto..");	
			throw new NumberFormatException(e.getMessage());
			}
			return cancion;

	}

}
