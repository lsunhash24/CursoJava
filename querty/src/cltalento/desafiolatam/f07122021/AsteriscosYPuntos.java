package cltalento.desafiolatam.f07122021;

import java.util.Scanner;

public class AsteriscosYPuntos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = 0;

		System.out.println(" Mostrar Puntos: ");
		System.out.println();
		// valida que el numero sea entero
		try {
			System.out.println("Ingrese cantidad de veces a mostrar: ");
			num1 = sc.nextInt();

		} catch (Exception e) {
			System.out.println(" error, valor no entero " + e);
		}

		if (num1 > 0) {// valida que el numero sea mayor a cero
			String caracter = "";

			for (int i = 0; i < num1; i++) {
				if (i%2==0) {
				caracter+= "*";
				} else {
				caracter+= ".";
			}
				System.out.println(caracter);
			}
			
		} else {
			System.out.println("Error de ingreso");
		}
		sc.close();
	}
}
