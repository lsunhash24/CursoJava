package cl.desafiolatam.clases;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static void menuPrincipal()   {

		boolean salirMenu = false;
		
		int opcionMenu;
		// se declaran las variables para editar y modificar datos 
		String nombreArticulo;
		String precioArticulo;
		String descripcionArticulo;
		String codigoArticulo;
		String tallaArticulo;
		String marcaArticulo;
		String colorArticulo;
		
			
	    //Producto producto = new Producto();					     		// se crea instancia de la clase producto
	    
	    ArchivoServicio importarDatos = new ArchivoServicio();			    // se crea instancia de la clase ArchivoServicio
		
		Scanner leer = new Scanner(System.in);								// se crean instancias de la clase Scanner
		Scanner leer2 = new Scanner(System.in);	
		Scanner leer3 = new Scanner(System.in);	
		Scanner leer4 = new Scanner(System.in);	
		Scanner leer5 = new Scanner(System.in);	
		
		while (!salirMenu) {											    // ciclo while que se ejecuta hasta que la variable
																		    // salirMenu sea verdadera
			System.out.println("*****************************");
			System.out.println("*           MENU            *");
			System.out.println("*****************************");
			System.out.println("* 1 .- Listar Producto      *");
			System.out.println("* 2 .- Editar  Producto     *");
			System.out.println("* 3 .- Importar Datos       *");
			System.out.println("* 4 .- Salir                *");
			System.out.println("*****************************");

			try {

				System.out.println("Ingrese una opción: ");

				opcionMenu = leer.nextInt();
								
					switch (opcionMenu) {          					        // inicio ciclo switch case

					case 1:                                                 // si la opcion es 1, invoca el método para listar productos
						ProductoServicio.getInstance().listarProductos();   // a través del método getInstance de la clase Singleton
						Utilidad.continuar();								// pausa
						Utilidad.limpiar();					     			// limpia consola
						break;
						
					case 2:		   									        // si la opción es 2, solicita que el usuario ingrese código del producto a editar	
										
						System.out.println("** Editar Producto **");
						System.out.println("*********************");
						
						System.out.println("Ingrese código artículo:");
						codigoArticulo=leer2.nextLine();
						
						boolean articuloEncontrado = false;
						// se recorre la lista por medio de un bucle for each, la lista se invoca a través del método getInstance de la clase Singleton
						for (Producto producto : ProductoServicio.getInstance().getListaProductos()) {
							// si el código ingresado encuentra una coincidencia se editan los datos
							if (codigoArticulo.equalsIgnoreCase(producto.getCodigo())) {
								// el código del artículo no se modifica porque actúa como índice
								System.out.println("1.- El nombre del artículo actual es: " + producto.getArticulo());
								System.out.println("2.- El color del producto           : " + producto.getColor());
								System.out.println("3.- La descripción del producto     : " + producto.getDescripcion());
								System.out.println("4.- La marca del producto           : " + producto.getMarca());
								System.out.println("5.- El precio del producto          : " + producto.getPrecio());
								System.out.println("6.- La talla del producto           : " + producto.getTalla());
								
								System.out.println();
								System.out.println("Ingrese la opción a editar de los datos del artículo: ");
								int opcion2 = leer3.nextInt();
								
								switch (opcion2) {
								
								case 1:                   // en caso que el usuario decida modificar el nombre del artículo
									System.out.println();
									System.out.println("Ingrese el nuevo nombre del artículo: ");
									nombreArticulo = leer4.nextLine();   
									producto.setArticulo(nombreArticulo);  // el nuevo valor es modificado a través del mutador del objeto producto 
									ProductoServicio.getInstance().editarProductos(codigoArticulo);  // se edita el producto con la modificación solicitada
									break;
								
								case 2: 				// en caso que el usuario decida modificar el color del artículo
									System.out.println();
									System.out.println("Ingrese el nuevo color del artículo: ");
									colorArticulo = leer4.nextLine();
									producto.setColor(colorArticulo);
									ProductoServicio.getInstance().editarProductos(codigoArticulo);
									break;
								
								case 3: 				// en caso que el usuario decida modificar la descripción del artículo
									System.out.println();
									System.out.println("Ingrese la nueva descripción del artículo: ");
									descripcionArticulo = leer4.nextLine();
									producto.setDescripcion(descripcionArticulo); 
									ProductoServicio.getInstance().editarProductos(codigoArticulo);
									break;
									
								case 4: 				// en caso que el usuario decida modificar la marca del artículo
									System.out.println();
									System.out.println("Ingrese la nueva marca del artículo: ");
									marcaArticulo = leer4.nextLine();
									producto.setMarca(marcaArticulo); 
									ProductoServicio.getInstance().editarProductos(codigoArticulo);
									break;
									
								case 5: 				// en caso que el usuario decida modificar el precio del artículo
									System.out.println();
									System.out.println("Ingrese el nuevo precio del artículo: ");
									precioArticulo = leer4.nextLine();
									producto.setPrecio(precioArticulo);
									ProductoServicio.getInstance().editarProductos(codigoArticulo);
									break;
									
								case 6: 				// en caso que el usuario decida modificar la talla del artículo
									System.out.println();
									System.out.println("Ingrese la nueva talla del artículo: ");
									tallaArticulo = leer4.nextLine();
									producto.setTalla(tallaArticulo);
									ProductoServicio.getInstance().editarProductos(codigoArticulo);
									break;
								
								default:                                    // en caso que se ingrese otra opción            
									System.out.println("Ingrese opción entre 1 y 6......");
																
								}
								articuloEncontrado = true;
								break;
							}
						
						}
						if (!articuloEncontrado) { // si el usuario ingresa un código que no existe
							
						 	System.out.println("Articulo no encontrado.....");
						}
						
						System.out.println(); 
						Utilidad.continuar();						 
						Utilidad.limpiar();                     // limpia consola
						break;
					case 3:	
						// Si la opción es 3, se invoca el método cargarDatos con parámetro la ruta ingresada por el usuario 
						System.out.println("Ingrese ruta en donde se encuentra el archivo ProductosImportados.csv");
						String rutaArchivo = leer5.nextLine();
						importarDatos.cargarDatos(rutaArchivo);
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
		leer2.close();
		leer3.close();
		leer4.close();
		leer5.close();
				
		System.out.println("Abandonando el sistema de productos......");
		System.out.println("Acaba de salir del sistema......");
	}
}
