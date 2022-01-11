package cltalento.desafiolatam.f20211220;

import cltalento.desafiolatam.f20211220.models.Auto;

public class Main {

	public static void main(String[] args) {
		// instancia de Auto
		Auto auto = new Auto();

		auto.pruebaEstatica = "test";
		System.out.println("**** Auto creado *****");
		// System.out.println(auto.toString());
		// aumenta automaticamente en 10
		// auto.aumentarVelocidad();
		// System.out.println(auto.toString());
		// aceleramos con un valor especifico
		// auto.aumentarVelocidad(5);
		// System.out.println(auto.toString());
		// frenamos
		// auto.aumentarVelocidad(false, true);
		
		
		auto.circulacionCiudad(2021,true, true);
		System.out.println(auto.toString());
		System.out.println();
		auto.circulacionCiudad();

	}

}
