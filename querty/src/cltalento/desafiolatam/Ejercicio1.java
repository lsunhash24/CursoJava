package cltalento.desafiolatam;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("************************");
		System.out.println("*     Destinatario     *");
		System.out.println("************************");
		System.out.println();
		System.out.println("Ingrese por favor los siguientes datos: ");
		System.out.println();
		
		System.out.println("Ingrese nombre destinatario:");
		String nombre = sc.next();
		
		System.out.println("Ingrese apellido destinatario:");
		String apellido = sc.next();
		
		System.out.println("Ingrese direcci�n destinatario:");
		String direccion = sc.next();
		
		System.out.println("Ingrese n�mero direcci�n destinatario:");
		Integer numero = sc.nextInt();
		
		System.out.println("Ingrese ciudad destinatario:");
		String ciudad = sc.next();
		
		System.out.println("Ingrese tel�fono destinatario:");
		String telefono = sc.next();
		
		System.out.println();
		System.out.println("************************");
		System.out.println();
		System.out.println("Los datos del destinatario son: ");
		System.out.println();
		System.out.println("nombre y apellido : " +nombre+" "+apellido);
		System.out.println("direci�n          : " +direccion+" "+numero);
		System.out.println("ciudad            : " +ciudad);
		System.out.println("tel�fono          : " +telefono);
		
	}

}
