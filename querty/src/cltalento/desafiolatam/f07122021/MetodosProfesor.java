package cltalento.desafiolatam.f07122021;

import java.util.Scanner;

public class MetodosProfesor {


public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Ingrese un numero");
		int numero = sc.nextInt();
		    
        System.out.println(esPar2(numero));
		sc.close();
	}
	
	//void no retorma, solo ejecuta
	//tipo_de_acceso tipo_de_retorno nombre_metodo( parametros) { 
	// 	CODIGO
	//}
	
	public static boolean esPar(int numero) {
		if(numero%2 == 0) {//par
			return true;
		}else {
			return false;
		}
	}
  
  	public static String esPar2(int numero) {
		if(numero%2 == 0) {//par
			return "El numero es par";
		}else {
			return "El numero es impar";
		}
	
	}
}








