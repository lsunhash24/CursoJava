package cl.desafiolatam.clases;

import java.util.ArrayList;

public class ProductoServicio {
	// atributo, una lista din�mica con par�metro tipo objeto

	ArrayList<Producto> listaProductos = new ArrayList<>();

	// constructor con par�metros

	public ProductoServicio(ArrayList<Producto> listaProductos) {
		super();
		this.listaProductos = listaProductos;
	}

	// constructor sin par�metros

	public ProductoServicio() {
		super();
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

			for (Producto producto : listaProductos) {      // imprime por consola todos los productos itemizados

				System.out.println("**** Lista de art�culos ****");
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

	public void agregarProductos(Producto producto1) {         // m�todo que agrega un producto a la lista, recibe como par�metro  

		listaProductos.add(producto1);                         // un objeto tipo Producto
		System.out.println("Producto ingresado....");

	}

}
