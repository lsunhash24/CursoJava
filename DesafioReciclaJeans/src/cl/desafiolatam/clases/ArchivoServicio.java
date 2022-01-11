package cl.desafiolatam.clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArchivoServicio {
  // método para importar datos desde un archivo externo con extensión csv
	public void cargarDatos(String ruta) {
		
		if (ProductoServicio.getInstance().listaProductos.isEmpty()) { // verificar que la lista esté vacia
																	   // la lista se accesa por medio del método getInstance
																	   // de la clase Singleton ProductoServicio 	

		try {
			FileReader archivo = new FileReader(ruta +"\\ProductosImportados.csv"); // se instancia la variable archivo tipo FileReader

			BufferedReader temporal = new BufferedReader(archivo);					// se instancia la variable remporal1 tipo BufferedReader

			String registro = temporal.readLine();                 // se crea una variable tipo string para almacenar el registro del archivo

			
			while (registro != null) { 		 // ciclo que se ejecuta hasta que el registro sea igual a nulo
				
				String lista[];				 // se inicializa una lista tipo string para almacenar los campos del producto
				lista = registro.split(","); // se delimita el registro separados por comas a través del método split
				// se asigna a cada campo del registro los valores por medio de la lista estática
				String nombreArticulo = lista[0];
				String precioArticulo = lista[1];
				String descripcionArticulo = lista[2];
				String codigoArticulo = lista[3];
				String tallaArticulo = lista[4];
				String marcaArticulo = lista[5];
				String colorArticulo = lista[6];
				// se agrega el objeto producto a la lista dinámica
				ProductoServicio.getInstance().getListaProductos().add(new Producto(nombreArticulo, precioArticulo,
						descripcionArticulo, codigoArticulo, tallaArticulo, marcaArticulo, colorArticulo));
				
				registro = temporal.readLine(); // se lee el siguiente registro del archivo

			}
			
			temporal.close();
			// se imprime por consola la lista dinámica con datos importados desde un archivo externo
			System.out.println(ProductoServicio.getInstance().getListaProductos());
			System.out.println();
			System.out.println("Datos cargados correctamente en la lista....");

		} catch (IOException e) {

			System.out.println("Ocurrio un error al importar datos, ruta no coincide...");

		}
	  }else {
		  System.out.println("Datos ya fueron  importados....");
	  }
	
		
	}
		
		
	
}
