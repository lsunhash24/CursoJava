package package cltalento.desafiolatam;

import java.util.Scanner;

public class Hipotenusa {

	public static void main(String[] args) {
		/*Crearemos un programa donde el usuario introduzca los 
			valores de ambos catetos y entreguemos como resultado 
			el largo de la hipotenusa*/ 

		Scanner sc = new Scanner(System.in);
		
		System.out.println("*****************************");
		System.out.println("* Calculo de Hipotenusa (cm)*");
		System.out.println("*****************************");
		System.out.println();
		
		System.out.println("Ingrese cateto A");
		Double catetoa= sc.nextDouble();
		System.out.println("Ingrese cateto B");
		Double catetob= sc.nextDouble();
		
		if(catetob <=0) {
			System.out.println("El valor del cateto b no puede ser cero o negativo");
		} else {
			if(catetoa <=0) {
				System.out.println("El valor del cateto a no puede ser cero o negativo");
			} else {
				Double hipo = Math.hypot(catetoa, catetob);
				System.out.println("EL valor de la hipotenusa es "+hipo);
			}
		}
		//--
		if(catetoa > 0) {			
			if(catetob > 0) {
				Double hipotenusa = Math.sqrt((catetoa*catetoa)+(catetob*catetob));
				System.out.println("EL valor de la hipotenusa es "+hipotenusa);	
	
			}else {
				System.out.println("El valor del cateto b no puede ser cero o negativo");
			}
			
		} else {
			System.out.println("El valor del cateto a no puede ser cero o negativo");
		}
		
		sc.close();
	}

}
