package cl.desafiolatam;
// Nombre alumno: Luis Sanhueza Soto

import java.util.Scanner;

public class Fechas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("** Determinar quien es mayor **");
		System.out.println("*******************************");

		System.out.println("Ingrese primera fecha como DD/MM/AAAA :");
		String fecha1 = sc.next();

		// se extrae el a�o de la cadena de caracteres y se convierte a tipo entera
		String anio1 = fecha1.substring(6);
		int anio11 = Integer.parseInt(anio1);

		// se extrae el mes de la cadena de caracteres y se convierte a tipo entera
		String mes1 = fecha1.substring(3, 5);
		int mes11 = Integer.parseInt(mes1);

		// se extrae el d�a de la cadena de caracteres y se convierte a tipo entera
		String dia1 = fecha1.substring(0, 2);
		int dia11 = Integer.parseInt(dia1);

		// validaci�n del ingreso de primera fecha *******

		if ((dia11 > 31 || dia11 < 1) || (mes11 > 12 || mes11 < 1) || (anio11 < 1 || anio11 > 2021)) {
			System.out.println("Primera fecha inv�lida");
		} else {

			System.out.println("Ingrese segunda fecha como DD/MM/AAAA :");
			String fecha2 = sc.next();

			// se extrae el a�o de la cadena de caracteres y se convierte a tipo entera
			String anio2 = fecha2.substring(6);
			int anio22 = Integer.parseInt(anio2);

			// se extrae el mes de la cadena de caracteres y se convierte a tipo entera
			String mes2 = fecha2.substring(3, 5);
			int mes22 = Integer.parseInt(mes2);

			// se extrae el d�a de la cadena de caracteres y se convierte a tipo entera
			String dia2 = fecha2.substring(0, 2);
			int dia22 = Integer.parseInt(dia2);

			// validaci�n del ingreso de segunda fecha *******

			if ((dia22 > 31 || dia22 < 1) || (mes22 > 12 || mes22 < 1) || (anio22 < 1 || anio22 > 2021)) {
				System.out.println("Segunda fecha inv�lida");
			} else {

				// primero se compara el a�o, s�lo si son iguales se sigue comparando el mes, si
				// el mes es igual, se compara el d�a
				if (anio11 < anio22) {
					System.out.println("La persona 1 es mayor");
				} else if (anio22 < anio11) {
					System.out.println("La persona 2 es mayor");
				} else { // aqu�, la condici�n que queda por defecto es que los a�os son iguales
					if (mes11 < mes22) {
						System.out.println("La persona 1 es mayor");
					} else if (mes22 < mes11) {
						System.out.println("La persona 2 es mayor");
					} else { // aqu�, la condici�n que queda por defecto es que los meses son iguales
						if (dia11 < dia22) {
							System.out.println("La persona 1 es mayor");
						} else if (dia22 < dia11) {
							System.out.println("La persona 2 es mayor");
						} else { // aqu�, la condici�n que queda por defecto es que los d�as son iguales
							System.out.println("Tienen la misma edad");
						}
					}
				}
			}
		}
		sc.close();
	}
}
