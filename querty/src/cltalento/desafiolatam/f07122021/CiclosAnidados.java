package cltalento.desafiolatam.f07122021;

import java.util.Scanner;

public class CiclosAnidados {

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
				String caracter = "";
				for (int i = 1; i < cantidad; i++) {				
					for (int j = 1; j < i; j++) {
						if (j%2==0) {
							System.out.printf("%d",j);
							caracter+="";
						}
					
					}
					System.out.printf("\n");
				}
				
				
			}else {
				System.out.println("SOlo numeros positivos mayor a cero");
			}
		}
		

	}

}
