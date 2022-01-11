package cl.desafiolatam.principal;
// alumno: Luis Sanhueza Soto

import cl.desafiolatam.clases.Cliente;
import cl.desafiolatam.clases.LibroVenta;
import cl.desafiolatam.clases.Vehiculo;

public class Main {

	public static void main(String[] args) {
		// instancias de clases a trav�s del m�todo constructor con par�metros
		Vehiculo vehiculo = new Vehiculo("Gris", "HSLP-33");
		Cliente cliente = new Cliente("09.209.714-5", "Marisol Barrientos", 45);
		LibroVenta libro = new LibroVenta("Venta001", "22122021");

		// invocar m�todo de clase libroVenta con atributos tipo cliente y vehiculo

		libro.guardarVenta(cliente, vehiculo);

	}

}
