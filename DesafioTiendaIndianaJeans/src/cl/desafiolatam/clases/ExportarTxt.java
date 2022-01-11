package cl.desafiolatam.clases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ExportarTxt extends ExportadorTxt {                                 // clase que hereda de clase abstracta ExportadorTxt

	//m�todo que exporta productos desde una arreglo din�mico hacia un archivo externo con extensi�n txt
	// cabe se�alar que la exportaci�n es temporal mientras est� activo el menu, si se cierra el men� 
	// el archivo externo se vac�a una vez que se vuelve a exportar.
	@Override
	public void exportar(ArrayList<Producto> lista) {                              // m�todo sobreescrito heredado de la clase abstracta ExportadorTxt

		boolean error = false;
		
		try { 																		// error controlado
			
			Scanner leer4 = new Scanner(System.in);
			String ruta;
			
			System.out.println("Ingrese la ruta en donde desea exportar el archivo Productos.txt: ");
			ruta = leer4.nextLine();

			File archivo = new File(ruta + "/Productos.txt");	      				// Se declara e iniciliza variable tipo
																					// File para el archivo
			
			if (archivo.exists() == false) { 										// Si archivo no existe, se crea archivo
				archivo.createNewFile();
				System.out.println("Archivo creado");
			}
				FileWriter escribirArchivo; 										// se instancia variable "escribirArchivo" tipo FileWriter
				escribirArchivo = new FileWriter(archivo);
				
				BufferedWriter temporal = new BufferedWriter(escribirArchivo); 	   // se instancia variable "temporal" tipo BufferedWriter
				
				if (lista.isEmpty() ) {
					System.out.println("Lista vacia.....no se puede exportar datos....");
				}else {
						
					   for (Producto producto : lista) {                          // se recorre lista a trav�s de bucle for each
																										// 
					     temporal.write(producto + "\n");                         // graba los productos en archivo temporal

					   }
					   System.out.println("Datos de productos exportados correctamente en formato txt");	   	
					   temporal.close();

				}
				
			
		} catch (FileNotFoundException e) {
			System.out.println(e); // Mensaje en caso que no se encuentre archivo
			error = true;

		} catch (IOException e) { // Mensaje en caso que no se pueda crear el archivo
			System.out.println(e);
			error = true;
		
		} finally { // se ejecuta independiente de lo que ocurra en try-catch

			if (error == false) {

				
				System.out.println("M�todo exportar se ejecut� satisfactoriamente");

			} else {
				System.out.println("Ocurri� un error al ejecutar el programa");
			}

		}
	}

}
