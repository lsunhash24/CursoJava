package cltalento.desafiolatam.Poo;

import cltalento.desafiolatam.Poo.models.Alimento;
import cltalento.desafiolatam.Poo.models.Animal;
import cltalento.desafiolatam.Poo.models.Auto;

public class Main {

	public static void main(String[] args) {
		
	    Auto auto= new Auto();
		// llamar a un método
		auto.miMetodo();
		// asignar un valor a un atributo de la variable auto (tambien sobreescribe)
		auto.setRuedas(4);
		auto.setColor("rojo");
		auto.setMotor(1.5f);
		auto.setVelocidad(200);
		
		System.out.println(auto.toString());
		//obtener el valor de un atributo de la variable auto
		System.out.println(auto.getRuedas());
		System.out.println(auto.getColor());
		System.out.println(auto.getMotor());
		System.out.println(auto.getVelocidad());
		
		// nueva instancia constructor con parametros
		
		//Auto auto2= new Auto("blanco",200f,1.5f,4);
		//Auto auto3= new Auto("gris",4);|
		//auto3.toString();
		Animal perro = new Animal();
		
		Alimento alimento=new Alimento("Wiskat","Alimento especial");
		
			
		perro.setColor("beige");
		perro.setNombre("panchita");
		perro.setRaza("foxterrier");
		//asignar valores a la variable alimento
		perro.setAlimento(alimento);
		perro.getAlimento().getNombre();
		System.out.println(perro.getAlimento().getNombre());
		
		System.out.println(perro.toString());
		
	}
		
		
		
		
		
		

}
