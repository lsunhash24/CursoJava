package cl.desafiolatam.clases;



import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static void menuPrincipal()  {

		boolean salirMenu = false;
		
		int opcionMenu;
		// se declaran las variables para capturar datos ingresados por el usuario
		String nombreArticulo;
		String precioArticulo;
		String descripcionArticulo;
		String codigoArticulo;
		String tallaArticulo;
		String marcaArticulo;
		String colorArticulo;
		
		ProductoServicio servicio = new ProductoServicio();					// se crea instancia de la clase ProductoServicio
		
	    Producto producto = new Producto();									// se crea instancia de la clase producto
	    
	    ExportarTxt exportarDatos = new ExportarTxt();						// se crea instancia de la clase ExportarTxt
		
		Scanner leer = new Scanner(System.in);								// se crea instancia de la clase Scanner

		while (!salirMenu) {											    // ciclo while que se ejecuta hasta que la variable
																		    // salirMenu sea verdadera
			System.out.println("*****************************");
			System.out.println("*           MENU            *");
			System.out.println("*****************************");
			System.out.println("* 1 .- Listar Producto      *");
			System.out.println("* 2 .- Agregar Producto     *");
			System.out.println("* 3 .- Exportar Datos       *");
			System.out.println("* 4 .- Salir                *");
			System.out.println("*****************************");

			try {

				System.out.println("Ingrese una opción: ");

				opcionMenu = leer.nextInt();
								
					switch (opcionMenu) {          					   // inicio ciclo switch case

					case 1:                                             // si la opcion es 1, invoca el método para listar productos
						servicio.listarProductos();	
						Utilidad.continuar();							// pausa			    					
						Utilidad.limpiar();								// limpia consola
						break;
						
					case 2:												// si la opción es 2, solicita que el usuario ingrese los datos del producto	
						//Utilidad.limpiar();
						Scanner leer2 = new Scanner(System.in);
						
						System.out.println("** Crear Producto **");
						System.out.println("____________________");
						System.out.println("Ingrese nombre artículo:");
						nombreArticulo=leer2.nextLine();
											
						System.out.println("Ingrese precio:");
						precioArticulo=leer2.nextLine();
											
						System.out.println("Ingrese descripción artículo:");
						descripcionArticulo=leer2.nextLine();
											
						System.out.println("Ingrese código artículo:");
						codigoArticulo=leer2.nextLine();
											
						System.out.println("Ingrese talla artículo:");
						tallaArticulo=leer2.nextLine();
											
						System.out.println("Ingrese marca artículo:");
						marcaArticulo=leer2.nextLine();
										
						System.out.println("Ingrese color artículo:");
						colorArticulo=leer2.nextLine();
						// Se almacenan los datos en el objeto producto instanciado a través de su método constructor					
						producto = new Producto(nombreArticulo,precioArticulo,descripcionArticulo,codigoArticulo,tallaArticulo,marcaArticulo,colorArticulo);
												
						servicio.agregarProductos(producto);    // se invoca el método agregarProductos para ingresar el objeto producto al arreglo dinámico
						 
						Utilidad.continuar();						 
						Utilidad.limpiar();                     // limpia consola
						break;
					case 3:										// Si la opción es 3, se invoca el método exportarDatos con el arreglo dinámico como parámetro
						exportarDatos.exportar(servicio.getListaProductos());
						Utilidad.continuar();                   // pausa 
						Utilidad.limpiar();                     // limpia la consola
						break;
					case 4:                                     // si la opción es 4 cambia el valor de la variable booleana salirMenu para quebrar el ciclo while      
						salirMenu = true;
						Utilidad.limpiar();                     // limpia consola 
						break;
					default:                                    // en caso que se ingrese otra opción            
						Utilidad.limpiar();
						System.out.println("Ingrese opción entre 1 y 4......");
					
				} 
			} catch (InputMismatchException e) {
				System.out.println("La opción a ingresar debe ser un número !");
				leer.next();
			}
		}
		leer.close();
				
		System.out.println("Abandonando el sistema de productos......");
		System.out.println("Acaba de salir del sistema......");
	}
}
