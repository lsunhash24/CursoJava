package cltalento.desafiolatam.f07122021;

import java.util.Scanner;

public class Imc2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer edad = 0;
		Float estatura = 0f;
		Float kilos = 0f;

		do {
			System.out.println("Ingrese su edad");
			edad = sc.nextInt();
		} while (edad < 18 || edad > 115);

		do {
			System.out.println("Ingrese estatura en metros");
			estatura = sc.nextFloat();
		} while (estatura < 0.5);

		do {
			System.out.println("Ingrese peso en kilogramos.");
			kilos = sc.nextFloat();
		} while (1f < kilos);
		sc.close();
	}
		
		CalculoImc();

	}

			

	public static void CalculoImc(float estatura, float kilos) {
		Float iMC = 0f;

		iMC = kilos / (estatura * estatura);
		/*
		 * Por debajo de 18.5 Bajo peso 18.5 – 24.9 Normal 25.0 – 29.9 Sobrepeso 30.0 o
		 * más Obeso
		 */
		if (iMC < 18.5) {
			System.out.println("Bajo peso");
		} else if (iMC >= 18.5 && iMC < 25) {
			System.out.println("Normal");
		} else if (iMC >= 25 && iMC < 30) {
			System.out.println("Sobrepeso");
		} else {
			System.out.println("Obeso");
		}
	}
}
