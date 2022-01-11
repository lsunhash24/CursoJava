package cl.desafiolatam.clases;

import java.util.ArrayList;

public class ProductoServicio {
	// atributo, una lista din�mica con par�metro tipo objeto
	ArrayList<Producto> listaProductos = new ArrayList<>();
	
	// declaraci�n de variable instance de tipo ProductoServicio, para utilizarla como patr�n de dise�o
	private static ProductoServicio instance;
	// privatizaci�n y encapsulamiento del constructor
	private ProductoServicio() {
		
	}
	// m�todo getInstance que sirve para llamar a la unica instancia de la clase ProductoServicio
	public static ProductoServicio getInstance() {
		
		if (instance == null) {
				
			instance = new ProductoServicio();
		}
		return instance;
				
	}
	

	// constructor con par�metros

	public ProductoServicio(ArrayList<Producto> listaProductos) {
		super();
		this.listaProductos = listaProductos;
	}

	// m�todos accesadores y mutadores

	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	// m�todos

	public void listarProductos() {  // m�todo para listar productos desde una arreglo din�mico

		if (listaProductos.isEmpty()) {						// verifica que la lista no est� vacia
			System.out.println("Lista vacia......");
		} else {
			System.out.println("**** Lista de art�culos ****");
			System.out.println();
			
			int numero = 1;
			for (Producto producto : listaProductos) {      // imprime por consola todos los productos itemizados

				System.out.println(" *******  ARTICULO N� " + numero + " *******");
				System.out.println("Nombre art�culo: " + producto.getArticulo());
				System.out.println("C�digo         : " + producto.getCodigo());
				System.out.println("Marca          : " + producto.getMarca());
				System.out.println("Color          : " + producto.getColor());
				System.out.println("Descripci�n    : " + producto.getDescripcion());
				System.out.println("Precio         : " + producto.getPrecio());
				System.out.println("Talla          : " + producto.getTalla());
				System.out.println("----------------------------------------------------");
				numero++;

			}
		}
	}
	
	public void editarProductos(String codigo2) {  // m�todo para editar productos seg�n su c�digo

		if (listaProductos.isEmpty()) {						// verifica que la lista no est� vacia
			System.out.println("Lista vacia......");
		} else {
			System.out.println("**** Datos del producto ****");
			System.out.println();
			
			for (Producto producto : listaProductos) {      // imprime por consola el producto buscado
				
				if(codigo2.equalsIgnoreCase(producto.getCodigo())) {
					
				System.out.println("Nombre art�culo: " + producto.getArticulo());
				System.out.println("C�digo         : " + producto.getCodigo());
				System.out.println("Marca          : " + producto.getMarca());
				System.out.println("Color          : " + producto.getColor());
				System.out.println("Descripci�n    : " + producto.getDescripcion());
				System.out.println("Precio         : " + producto.getPrecio());
				System.out.println("Talla          : " + producto.getTalla());
				System.out.println("----------------------------------------------------");
				}

			}
		 }
		
	}
	
}
