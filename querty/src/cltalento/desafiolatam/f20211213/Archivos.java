package cltalento.desafiolatam.f20211213;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Archivos {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese nombre directorio: ");
		String directorio = leer.next();

		System.out.println("Ingrese nombre archivo: ");
		String archivo2 = leer.next();

		crearArchivo(directorio, archivo2);

		System.out.println("Ingrese texto a buscar: ");
		String texto = leer.next();

		buscarTexto(directorio, archivo2, texto);

		leer.close();
	}

	public static void crearArchivo(String carpeta, String archivo) {

		File carpetaPrincipal = new File("src/" + carpeta);

		if (carpetaPrincipal.exists() == false) {
			carpetaPrincipal.mkdir();
			System.out.println("Directorio creado");

		} else {
			System.out.println("Directorio ya existe");
		}

		File fichero = new File("src/" + carpeta + "/" + archivo + ".txt");

		if (fichero.exists() == false) {
			try {
				fichero.createNewFile();

				ArrayList<String> lista = new ArrayList<String>();
				lista.add("Perro");
				lista.add("Gato");
				lista.add("Juan");
				lista.add("Daniel");
				lista.add("Juan");
				lista.add("Gato");
				lista.add("Perro");
				lista.add("Camila");
				lista.add("Daniel");
				lista.add("Camila");

				FileWriter fileWriter = new FileWriter(fichero);
				BufferedWriter buff = new BufferedWriter(fileWriter);

				for (Iterator<String> iterator = lista.iterator(); iterator.hasNext();) {
					String elemento = (String) iterator.next();
					buff.write(elemento + "\n");
				}
				buff.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Archivo creado");
			System.out.println();
		} else {
			System.out.println("Archivo ya existe");
		}

	}

	public static void buscarTexto(String nombreCarpeta, String nombreArchivo, String textoBuscado) {

		int contador = 0;

		File archivoLeer = new File("src/" + nombreCarpeta + "/" + nombreArchivo + ".txt");

		try {
			FileReader fileReader = new FileReader(archivoLeer);
			BufferedReader buffReader = new BufferedReader(fileReader);

			String textoFila = buffReader.readLine();
			while (textoFila != null) {
				if (textoFila.equalsIgnoreCase(textoBuscado)) {
					contador++;

				}
				System.out.println(textoFila);
				textoFila = buffReader.readLine();
			}
			System.out.println("cantidad de repeticiones del texto ->" + contador);
			buffReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
