package cltalento.desafiolatam;

import java.util.Scanner;

public class CicloWhile {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int contador = 0;
	int edad = 0;
	
	System.out.println("Ingrese edad");
	 edad = sc.nextInt();
	
	
	while (edad>=18) {
		System.out.println("dentro del while");
		contador = contador + 1;
		if (contador == 5) {
		 edad == 0;
		}
	}
		System.out.println("fuera del while");
	}

}
