package cltalento.desafiolatam.f20211220.models;

import java.util.Scanner;

public class Excepciones {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	try {
		
		String variable = sc.nextLine();
		
		if(variable.isEmpty()){
		variable = null;
		}
		int total = 3 / Integer.parseInt(variable);
		}catch(NullPointerException e) {
		System.out.println("No se puede dividir por un valor nulo.");
		int total = 0;
		throw new NullPointerException e (e.getMessage());
		
		}catch(NumberFormatException ex2) {
		System.out.println("El valor de variable no es un número.");
		int total = 0;
		}catch(Exception ex3){
		System.out.println("Error inesperado: "+ex3.getMessage());
		int total = 0;
		}finally {
			System.out.println("Pasó por finally.....");
			sc.close();
		}

		
	}

}

