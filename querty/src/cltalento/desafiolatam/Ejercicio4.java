package cltalento.desafiolatam;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("*********************");
		System.out.println("* C�lculo de �rea   *");
		System.out.println("*********************");
		
		System.out.println("Ingrese largo del rect�ngulo:");
		Float largo = sc.nextFloat();
		System.out.println("Ingrese alto del rect�ngulo:");
		Float alto = sc.nextFloat();
		
		if ( largo > 0) {
			if (alto > 0) {
				Float area = largo*alto;
				System.out.println("El valor del �rea es: "+area);
			}else {
				System.out.println("El valor del alto no puede ser ni negativo");
			}
		}else {
			System.out.println("El valor del largo no puede ser 0 ni negativo");
		}
		sc.close();
	}
	
}
