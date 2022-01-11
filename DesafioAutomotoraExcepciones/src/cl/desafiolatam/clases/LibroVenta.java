package cl.desafiolatam.clases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class LibroVenta {

	// atributos
	private String nombreVenta;
	private String fechaVenta;

	// método constructor con parámetros
	public LibroVenta(String nombreVenta, String fechaVenta) {
		super();
		this.nombreVenta = nombreVenta;
		this.fechaVenta = fechaVenta;
	}

	// accesadores y mutadores
	public String getNombreVenta() {
		return nombreVenta;
	}

	public void setNombreVenta(String nombreVenta) {
		this.nombreVenta = nombreVenta;
	}

	public String getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	// métodos

	public void guardarVenta(Cliente cliente, Vehiculo vehiculo)  {

		boolean error = false;

		try {																	    // error controlado
			
			File carpetaPrincipal = new File("src/Ficheros"); 						// Se declara e inicializa la variable tipo File para la carpeta
			File archivoDiario = new File("src/Ficheros/" + nombreVenta + ".txt");  // Se declara e iniciliza variable tipo
																					// File para el archivo
			System.out.println("***** Ruta del archivo de venta *****");
			System.out.println(archivoDiario);
			
			if (carpetaPrincipal.exists() == false) { 							    // Si el nombre de carpeta no existe
				carpetaPrincipal.mkdir(); 									    	// se crea la carpeta en raiz "src"
				System.out.println("Directorio creado");

			} else {
				System.out.println("Directorio ya existe");
			}

			if (archivoDiario.exists() == false) { 								// Si archivo no existe, se crea archivo
				archivoDiario.createNewFile(); 

				FileWriter escribirArchivo; 									// se instancia variable "escribirArchivo" tipo FileWriter
				escribirArchivo = new FileWriter(archivoDiario);

				BufferedWriter temporal = new BufferedWriter(escribirArchivo); 	// se instancia variable "temporal" tipo
																				// BufferedWriter
				int fecha = Integer.parseInt(this.fechaVenta);				    // se convierte el atributo fechaVenta de string a entero

				// se escriben datos al archivo mediante el método write
				temporal.write(vehiculo.getPatente() + "\n");
				
				if (cliente.getEdad()>0) {
				temporal.write(cliente.getEdad() + "\n");
				}else {
					System.out.println("Edad debe ser positivo");
				}
				temporal.write(fecha + "\n");
				temporal.write(this.nombreVenta);

				temporal.close();
				
				System.out.println("Archivo creado");
				
			} else {
				System.out.println("Archivo ya existe");
			}
		} catch (FileNotFoundException e) {
			System.out.println(e); 						// Mensaje en caso que no se encuentre archivo
			error = true;
			
		} catch (IOException e) {						// Mensaje en caso que no se pueda crear el archivo
			System.out.println(e);
			error=true;
			
		}catch (NumberFormatException e) {				// Mensaje en caso que el dato ingresado no sea numérico
			System.out.println("El valor de la variable debe ser numérico"+e);
			error=true;
					
		} finally {										// se ejecuta independiente de lo que ocurra en try-catch

			if (error == false) {

				System.out.println("Programa ejecutado satisfactoriamente");
				System.out.println();

			} else {
				System.out.println("Ocurrió un error al ejecutar el programa");
			}

		}
	}
}
