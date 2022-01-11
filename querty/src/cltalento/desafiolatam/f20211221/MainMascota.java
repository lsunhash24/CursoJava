package cltalento.desafiolatam.f20211221;

import cltalento.desafiolatam.f20211221.models.Gato;
import cltalento.desafiolatam.f20211221.models.Mascota;
import cltalento.desafiolatam.f20211221.models.Perro;

public class MainMascota {

	public static void main(String[] args) {

		//Mascota mascota=new Mascota();
		
		//System.out.println(mascota.toString());
		System.out.println("*** Instancia de mascota con clase Gato ****");
		Mascota gatito= new Gato();
		System.out.println(gatito.horasSueños());
		System.out.println("*** Instancia de mascota con clase Perro ****");
		Mascota perrito= new Perro();
		System.out.println(perrito.horasSueños());
	}

}
