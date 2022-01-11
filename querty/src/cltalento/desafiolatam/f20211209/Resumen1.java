package cl.desafiolatam.f20211209;

import java.util.Scanner;

public class Resumen1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		String saludo = "";
		int numero = 0;
		Integer numero1 = getNumero();
		
		System.out.println("Hola clase");
		saludo = sc.nextLine();
		
		
		if(true) {
			Float numero2 = 0f;
	
		}
		Float numero2 = 0f;
		
		if(numero1 <= 0) {
			// se ejecuta si es verdad
		}else {
			//numero positivo
		}
		
		if(numero1 == 0) {
			// es cero
		}else if(numero1 > 0) {
			//es positivo
		}else {
			//es negativo
		}
		
		//do
		do {
			// se ejecuta a lo menos 1 vez
		}while(numero1 > 0);// si es verdad se sigue ejecutando
		
		//while
		while(numero1 > 0) {
			//solo ingresa si es verdadero
			// si es verdad se sigue ejecutando
			numero1 = 0;
		}
		
		//for 
		for (int i = 0; i < numero1; i++) {
			// si es verdad entra al for
		}// regresa a incrementar la variable
		
		// for anidado
		for (int x = 0; x < args.length; x++) {
			for (int y = 0; y < args.length; y++) {
				for (int z = 0; z < args.length; z++) {
					
				}				
			}
		}
		
		Math.hypot(numero, numero);
		Math.pow(numero, numero);
		
		getEdad();
		getEdad("Sobre carga del metodo");
		

	}
	//Metodos
	//simplificar;  Reutilizar; Llamar desde mucha partes;	
	public static void getEdad() {
		System.out.println("Solo ejecuta, void no retorna");
	}
	//sobrecarga
	public static void getEdad(String frase) {
		System.out.println(frase);
	}
	
	public static Integer getNumero() {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Ingrese un numero");
		Integer numero = sc.nextInt();
		
		return numero;//

	}
	

}
