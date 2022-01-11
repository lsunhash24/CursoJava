package cl.desafiolatam.clases;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilidad {

	public static void limpiar() {   // método que limpia la consola.....

		for (int i = 0; i < 45; i++) {
			System.out.println();

		}

	}

	public static void continuar() {   // método estático que permite pausar los accesos al menú

		try {
			int opcion2 = 0;
			Scanner leer3 = new Scanner(System.in);

			while (opcion2 != 1) {

				System.out.println("Ingrese 1 para continuar.....");
				opcion2 = leer3.nextInt();
				leer3.nextLine();

			}
			//leer3.close();
		} catch (InputMismatchException e) {
			System.out.println("La opción a ingresar debe ser un número !");
			
		}
	 
	}
	
}
