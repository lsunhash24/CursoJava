package cl.desafiolatam;
// alumno: Luis Sanhueza Soto

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
	
     /* 	Programa que crea un directorio y un 
      *  archivo dentro de él, luego traspasa los
      *  datos de una arreglo dinámico hacia el 
      *  archivo creado. Finalmente, busca un texto
      *  en dicho archivo e indica las veces que 
      *  se repite el registro. Los nombres del
      *  directorio, fichero y texto son ingresados
      *  por el usuario. La ruta para crear estos
      *  elementos es la carpeta "src" del proyecto.
      *  No se realizará validación de las entradas 
      *  de cadenas de caracteres.
      * */
	
	public static void main(String[] args) {
    
		Scanner leer = new Scanner(System.in);

		System.out.println("Ingrese nombre directorio: "); // Captura del nombre de la carpeta ingresado por 
		String directorio = leer.nextLine();			   // el usuario	

		System.out.println("Ingrese nombre archivo: ");    // Captura del nombre del archivo ingresado por 
		String archivo2 = leer.nextLine();                 // el usuario

		crearArchivo(directorio, archivo2);                // se invoca el método para crear carpeta y archivo
														   // con parámetros ingresados anteriormente
		System.out.println();
		System.out.println("*** Buscar texto en el archivo ***"); // Se solicita al usuario que ingrese un texto
																  // para buscar en el archivo	
		System.out.println("Ingrese texto a buscar: ");
		String texto = leer.nextLine();

		buscarTexto(directorio, archivo2, texto);			// se invoca el método que busca el texto ingresado	

		leer.close();
	}

	public static void crearArchivo(String carpeta, String archivo) {   // Método que crea un directorio y archivo

		File carpetaPrincipal = new File("src/" + carpeta);				// Se declara e inicializa la variable tipo File

		if (carpetaPrincipal.exists() == false) {						// Si el nombre de carpeta no existe 
			carpetaPrincipal.mkdir();									// se crea la carpeta en raiz "src"
			System.out.println("Directorio creado");

		} else {
			System.out.println("Directorio ya existe");
		}

		File fichero = new File("src/" + carpeta + "/" + archivo + ".txt"); // Se declara e iniciliza variable tipo File par el archivo

		if (fichero.exists() == false) {								    // Si archivo no existe, se crea 
			
			try {													        // error controlado
				fichero.createNewFile();									// se crea el archivo

				ArrayList<String> lista = new ArrayList<String>();          // Se declara e inicializa el arreglo dinámico
				lista.add("Perro");
				lista.add("Gato");
				lista.add("Juan");
				lista.add("Daniel");
				lista.add("Juan");
				lista.add("Gato");
				lista.add("Perro");
				lista.add("Camila");
				lista.add("Daniel");								            // los datos de este arreglo se traspasan al archivo
				lista.add("Camila");								            // a través de la clase BufferedWriter - FileWriter
																    
				FileWriter escribirArchivo = new FileWriter(fichero);            // se instancia variable "escribirArchivo" tipo FileWriter           
				BufferedWriter temporal = new BufferedWriter(escribirArchivo);   // se instancia variable "temporal" tipo BufferedWriter

				for (Iterator<String> iterator = lista.iterator(); iterator.hasNext();) { // traspaso de datos desde la lista al archivo
					String elemento = (String) iterator.next();                           // se recorre la lista con el patrón Iterator 
					temporal.write(elemento + "\n");                                      // se escribe el dato mediante el método write   
				}
				temporal.close();

			} catch (IOException e) {
				System.out.println("Error al crear el archivo");                 // Mensaje en caso que no se pueda crear el archivo
				e.printStackTrace();
			}
			System.out.println("Archivo creado");
			System.out.println();
		} else {
			System.out.println("Archivo ya existe");
		}

	}
           // método que busca un texto ingresado por el usuario 
	       // los argumentos de entrada son los mismos del método crearArchivo
	
	public static void buscarTexto(String nombreCarpeta, String nombreArchivo, String textoBuscado) {
		  // se declara e inicializa una variable para contar los textos repetidos
		int contador = 0;		           	
          // se crea una variable de instancia de tipo File ("archivoLeer")
		File archivoLeer = new File("src/" + nombreCarpeta + "/" + nombreArchivo + ".txt");

		try { // se controla el error en el caso que no se pueda leer el archivo
			
			// para leer los datos del archivo, se hace mediante la clase BufferedWriter-FileReader
			// Se crean variables de tipo FileReader con archivo File y  otra de tipo BufferedReader
			// con un objeto FileReader
			FileReader leerArchivo = new FileReader(archivoLeer);
			BufferedReader memoriaArchivo = new BufferedReader(leerArchivo);
			
			// se lee toda la información del archivo y se almacena en la variable textoFila	
			String textoFila = memoriaArchivo.readLine();
			while (textoFila != null) {								// con el ciclo while se recorren los datos	
				if (textoFila.equalsIgnoreCase(textoBuscado)) {     // compara el texto del archivo con el
					contador++;					                    // texto ingresado, si es igual se incrementa
																	// el contador
				}
				textoFila = memoriaArchivo.readLine();				// siguiente texto del
			}
			System.out.println("cantidad de repeticiones del texto ->" + contador);
			memoriaArchivo.close();	 									// se cierra el archivo de memoria
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
