package cl.desafiolatam.principal;
// alumno: Luis Sanhueza Soto
import cl.desafiolatam.clases.Bus;
import cl.desafiolatam.clases.Cliente;
import cl.desafiolatam.clases.MiniBus;
import cl.desafiolatam.clases.Taxi;
import cl.desafiolatam.clases.Tienda;
import cl.desafiolatam.clases.Vendedor;

public class Main {

	public static void main(String[] args) {
		// instancias de clases
		Taxi taxi=new Taxi("Gris","HSLP-33",530);
		Bus bus=new Bus("Blanco","JKTT-23",25);
		MiniBus miniBus=new MiniBus("Azul","LJPR-23",16,"Turismo");
		
		Vendedor vendedor=new Vendedor("08.818.674-5","Luis Sanhueza Soto","Pasaje C 361 San pedro de la Paz"); 
		Cliente cliente=new Cliente("09.209.714-5","Marisol Barrientos",43);
		Tienda tienda=new Tienda(vendedor,cliente,-1);
		
		 //muestra por consola el valor de las instancias
		System.out.println(taxi.toString());
		System.out.println("----------------------------------------------------");
		System.out.println(bus.toString());
		System.out.println("----------------------------------------------------");
		System.out.println(miniBus.toString());
		System.out.println("----------------------------------------------------");
		System.out.println(vendedor.toString());
		System.out.println("----------------------------------------------------");
		System.out.println(cliente.toString());
		System.out.println("----------------------------------------------------");
		System.out.println(tienda.toString());
		System.out.println("----------------------------------------------------");
		// invoca al método existeStock() de la clase Tienda 
		tienda.existeStock();
		System.out.println("----------------------------------------------------");
		// invoca al método imprimeBus() de la clase miniBus
		miniBus.imprimeBus();
		System.out.println("----------------------------------------------------");
		// invoca al método asientos Disponibles() de la clase Bus
		// el parámetro que recibe son los asientos ocupados
		System.out.println("Asientos disponibles bus = " +bus.asientosDisponibles(11));
		System.out.println("----------------------------------------------------");
		// invoca al método pagarPasaje() de la clase Taxi
		taxi.pagarPasaje(1000);
	}

}
