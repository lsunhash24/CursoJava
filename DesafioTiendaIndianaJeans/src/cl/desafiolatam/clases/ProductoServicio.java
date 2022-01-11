package cl.desafiolatam.clases;

import java.util.ArrayList;

public class ProductoServicio {
	// atributo, una lista dinámica con parámetro tipo objeto

	ArrayList<Producto> listaProductos = new ArrayList<>();

	// constructor con parámetros

	public ProductoServicio(ArrayList<Producto> listaProductos) {
		super();
		this.listaProductos = listaProductos;
	}

	// constructor sin parámetros

	public ProductoServicio() {
		super();
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

			for (Producto producto : listaProductos) {      // imprime por consola todos los productos itemizados

				System.out.println("**** Lista de artículos ****");
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

	public void agregarProductos(Producto producto1) {         // método que agrega un producto a la lista, recibe como parámetro  

		listaProductos.add(producto1);                         // un objeto tipo Producto
		System.out.println("Producto ingresado....");

	}

}
