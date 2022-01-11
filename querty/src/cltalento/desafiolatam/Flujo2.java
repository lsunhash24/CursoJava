package cltalento.desafiolatam;

import java.util.Scanner;

public class Flujo2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
				
		System.out.println(" Ingrese palabra 1 :");
		String palabra1 = sc.next();
		 
		System.out.println(" Ingrese palabra 2 :");
		String palabra2 = sc.next(); 
		
		if (palabra1.equals("Hola")) {
		    System.out.println("Son iguales");
		}else {
			System.out.println("las palabras son distintas");
							
		}
		if (palabra1.compareTo(palabra2)==0) {
		    System.out.println("Son iguales");
		}else {
			System.out.println("las palabras son distintas");
							
		} 
		if (palabra1.equalsIgnoreCase(palabra2)) {
		    System.out.println("Son iguales");
		}else {
			System.out.println("las palabras son distintas");
							
		}
	}
	

}
