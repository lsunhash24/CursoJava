package cltalento.desafiolatam;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("** Cálculo velocidad **");
		System.out.println("Ingrese distancia:");
		Float distancia = sc.nextFloat();
		System.out.println("Ingrese tiempo:");
		Float tiempo = sc.nextFloat();
		
		if (tiempo>0) {
		System.out.println("La velocidad es : "+distancia/tiempo);
		} else {
			System.out.println("El tiempo debe ser positivo");
		}
			
		}

	}
