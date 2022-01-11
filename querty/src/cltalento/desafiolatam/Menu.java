package cltalento.desafiolatam;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("*************************");
		System.out.println("*        MENU           *");
		System.out.println("*************************");
		System.out.println("* 1 .- SUMAR            *");
		System.out.println("* 2 .- RESTAR           *");
		System.out.println("* 3 .- MULTIPLICAR      *");
		System.out.println("* 4 .- DIVIDIR          *");
		System.out.println("* 0 .- SALIR            *");
		System.out.println("*************************");
		// variables de control globales
		int opcion = 0;
		int contador = 0;//
		do {
			System.out.println("* Seleccione una opcion *");
			opcion = sc.nextInt();

			if (opcion == 0) {				
				// sale de do -while
				break;
			}

			contador = contador + 1;// variable de control
			if (contador == 4) {// solo 4 veces
				opcion = 0;// limpiar la variable
				break;
			}
			// <-1 2 3 4->
		} while (opcion < 1 || opcion > 4);

		System.out.println("fuera del while " + opcion);

		if (opcion == 0) {
			System.out.println("Hasta la proxima!!");
		} else {
			//solicitar numeros (2)
			System.out.println("ingrese numero 1");
			//guardar los numeros 
			float num1 = sc.nextFloat();
			System.out.println("ingrese numero 2");
			float num2 = sc.nextFloat();					
			//variable acumuladora resultado
			float resultado = 0f;
			//imprimir el resultado
			//salir
			
			if (opcion == 1) {// sumar
				resultado = num1 + num2;
				System.out.println(" La suma es " + resultado);
				
			} else if (opcion == 2) {//restar
				resultado = num1 - num2;
				System.out.println(" La resta es " + resultado);
			} else if (opcion == 3) {//multiplicar
				resultado = num1 * num2;
				System.out.println(" El producto es " + resultado);
			} else {//dividir
				//validar el divisor distinto de cero
				if(num2 == 0) {
					System.out.println("No se puede dividir por cero");
				}else {
					resultado = num1 / num2;
					System.out.println(" El cuociente es " + resultado);
				}
				
			}
		}

		sc.close();
	}

}

