package cl.desafiolatam.clases;

import java.util.ArrayList;

public class ProductoServicio {
	// atributo, una lista dinámica con parámetro tipo objeto
	ArrayList<Producto> listaProductos = new ArrayList<>();
	
	// declaración de variable instance de tipo ProductoServicio, para utilizarla como patrón de diseño
	private static ProductoServicio instance;
	// privatización y encapsulamiento del constructor
	private ProductoServicio() {
		
	}
	// método getInstance que sirve para llamar a la unica instancia de la clase ProductoServicio
	public static ProductoServicio getInstance() {
		
		if (instance == null) {
				
			instance = new ProductoServicio();
		}
		return instance;
				
	}
	

	// constructor con parámetros

	public ProductoServicio(ArrayList<Producto> listaProductos) {
		super();
		this.listaProductos = listaProductos;
	}

	// métodos accesadores y mutadores

	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	// métodos

	public void listarProductos() {  // método para listar productos desde una arreglo dinámico

		if (listaProductos.isEmpty()) {						// verifica que la lista no esté vacia
			System.out.println("Lista vacia......");
		} else {
			System.out.println("**** Lista de artículos ****");
			System.out.println();
			
			int numero = 1;
			for (Producto producto : listaProductos) {      // imprime por consola todos los productos itemizados

				System.out.println(" *******  ARTICULO N° " + numero + " *******");
				System.out.println("Nombre artículo: " + producto.getArticulo());
				System.out.println("Código         : " + producto.getCodigo());
				System.out.println("Marca          : " + producto.getMarca());
				System.out.println("Color          : " + producto.getColor());
				System.out.println("Descripción    : " + producto.getDescripcion());
				System.out.println("Precio         : " + producto.getPrecio());
				System.out.println("Talla          : " + producto.getTalla());
				System.out.println("----------------------------------------------------");
				numero++;

			}
		}
	}
	
	public void editarProductos(String codigo2) {  // método para editar productos según su código

		if (listaProductos.isEmpty()) {						// verifica que la lista no esté vacia
			System.out.println("Lista vacia......");
		} else {
			System.out.println("**** Datos del producto ****");
			System.out.println();
			
			for (Producto producto : listaProductos) {      // imprime por consola el producto buscado
				
				if(codigo2.equalsIgnoreCase(producto.getCodigo())) {
					
				System.out.println("Nombre artículo: " + producto.getArticulo());
				System.out.println("Código         : " + producto.getCodigo());
				System.out.println("Marca          : " + producto.getMarca());
				System.out.println("Color          : " + producto.getColor());
				System.out.println("Descripción    : " + producto.getDescripcion());
				System.out.println("Precio         : " + producto.getPrecio());
				System.out.println("Talla          : " + producto.getTalla());
				System.out.println("----------------------------------------------------");
				}

			}
		 }
		
	}
	
}
