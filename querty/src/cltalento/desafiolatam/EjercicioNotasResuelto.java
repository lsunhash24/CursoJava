package cltalento.desafiolatam;

import java.util.Scanner;

public class EjercicioNotasResuelto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Crear y mostrar en pantalla, una hoja de calificaciones que 
			tendrá la siguiente información:
			● Nombre completo del estudiante.
			● Asignatura.
			● Nombre del Docente.
			● Nota 1
			● Nota 2.
			● Nota 3
		 * */
		
		System.out.println("Ingrese nombre completo alumno");
		String alumno = sc.nextLine();
		System.out.println("Nombre Asignatura");
		String asignatura= sc.nextLine();
		System.out.println("Ingrese nombre del Docente");
		String docente = sc.nextLine();
		System.out.println("Ingrese nota 1");
		Float nota1 = sc.nextFloat();
		System.out.println("Ingrese nota 2");
		Float nota2 = sc.nextFloat();
		System.out.println("Ingrese nota 3");
		Float nota3 = sc.nextFloat();
		sc.nextLine();
		
		String estado = "REPROBADO";
		Float promedio = (nota1+nota2+nota3)/3;
		
		if (promedio >= 4) {
			estado = "APROBADO";
		}
		
		System.out.println("******* Hoja Calificiones  *******");
		System.out.println("*Alumno     "+alumno+"            ");
		System.out.println("*Asignatura "+asignatura+"        ");
		System.out.println("*Docente    "+docente+"           ");
		System.out.println("***********************************");
		System.out.println("* Evaluacion **** Calificacion  ***");
		System.out.println("* nota 1     ****    "+ nota1 +"   ***");
		System.out.println("* nota 2     ****    "+ nota2 +"   ***");
		System.out.println("* nota 3     ****    "+ nota3 +"   ***");
		System.out.println("***********************************");
		System.out.println("** PROMEDIO  **** "+promedio+"  ******");
		System.out.println("** ESTADO    **** "+estado+"       ***");
		/*
		if (promedio >= 4) {
			System.out.println("** ESTADO    **** APROBADO       ***");
		}else {
			System.out.println("** ESTADO    **** REPROBADO       ***");
		}
		*/
		System.out.println("***********************************");
		sc.close();
	}

}
