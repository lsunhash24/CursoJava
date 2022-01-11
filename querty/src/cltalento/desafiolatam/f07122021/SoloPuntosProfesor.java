package cltalento.desafiolatam.f07122021;

import java.util.Scanner;

public class SoloPuntosProfesor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cantidad = 0;//definicion de variable
		boolean error = false;//variables de control
		
		//solicitamos el ingreso de datos
		System.out.println("Ingrese cantidad de veces a mostrar *");
	
		try {//error controlado
			//capturar el dato
			cantidad = sc.nextInt();
			
		} catch (Exception e) {
			System.out.println("Error de ingreso");
			error = true;
		}
		if(!error) {
			//validar el dato, no negativo y mayor a cero
			if(cantidad > 0) {
				//realizar la accion 
				//String caracter ="";
				for (int i = 0; i < cantidad; i++) {
					
					for (int j = 1; j < 2; j++) {
						System.out.printf(i + "," + j);
					//	System.out.printf("%d",j);
					}
					//System.out.printf("\n");
					//System.out.println("**************");
					//if(i%2==0) {
					//	System.out.printf(".");
					//caracter += "*";
				//	System.out.println(caracter);
				//}else {
					//System.out.printf("*");
				}
				//	System.out.printf("\n");
				//}
			}else {
				System.out.println("Sólo numeros positivos mayor a cero");
			}
		}
		

	}

}

