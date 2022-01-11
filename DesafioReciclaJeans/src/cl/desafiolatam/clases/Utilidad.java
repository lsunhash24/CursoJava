package cl.desafiolatam.clases;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilidad {

	public static void limpiar() {   // m�todo que limpia la consola.....

		for (int i = 0; i < 45; i++) {
		
	     System.out.println();

		}

	}
	
	public static void continuar() {   // m�todo est�tico que permite pausar los accesos al men�

			int opcion2 = 0;
			
			try {
				Scanner leer3 = new Scanner(System.in);
				
				while (opcion2 != 1) {

					System.out.println("Ingrese 1 para continuar.....");
					opcion2 = leer3.nextInt();
					leer3.nextLine();

				}
				
			
			}catch (InputMismatchException e) {
				System.out.println("La opci�n a ingresar debe ser un n�mero !");
			
		}
	 
	}

}
