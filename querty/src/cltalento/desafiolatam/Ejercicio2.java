package cltalento.desafiolatam;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	/*	System.out.println("Ingrese nombre completo alumno");
		String alumno = sc.nextLine();
		System.out.println("Nombre Asignatura");
		String asignatura = sc.nextLine();
		System.out.println("Ingrese nombre del Docente");
		String docente = sc.nextLine();
	*/	
		float nota1 = 0f;
				
		do {
		System.out.println("Ingrese nota 1");
		 nota1 = sc.nextFloat();
		}while (nota1 <= 0 || nota1 > 7);
		
		System.out.println("Ingrese nota 2");
		Float nota2 = sc.nextFloat();
		System.out.println("Ingrese nota 3");
		Float nota3 = sc.nextFloat();
		sc.nextLine();

		System.out.println("******* Hoja Calificiones  *******");
	/*	System.out.println("*Alumno     " + alumno + "           ");
		System.out.println("*Asignatura " + asignatura + "       ");
		System.out.println("*Docente    " + docente + "          ");
	*/	System.out.println("**********************************");
		System.out.println("* Evaluacion **** Calificacion ***");
		System.out.println("* nota 1     **** " + nota1 + "  ***");
		System.out.println("* nota 2     **** " + nota2 + "  ***");
		System.out.println("* nota 3     **** " + nota3 + "  ***");
		System.out.println("**********************************");

		float promedio = (nota1 + nota2 + nota3) / 3;

		if (promedio < 4) {
			System.out.println("Debes dar una prueba de recuperación para poder rendir el exámen final");
		} else {
			if (promedio >= 4 && promedio <= 5.5) {
				System.out.println("Debes rendir el exámen final para aprobar");
			} else {
				if (promedio > 5.5) {
					System.out.println("Felicitaciones, te eximiste del exámen y aprobaste");
				}
			}

		}

		sc.close();
	}

}
