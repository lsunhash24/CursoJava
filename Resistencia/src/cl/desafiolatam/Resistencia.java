package cl.desafiolatam;
import java.util.Scanner;

public class Resistencia {

	public static void main(String[] args) {
			
			Scanner leer=new Scanner(System.in);
			System.out.println("********************************************************");
			System.out.println("* Programa para calcular resistencia total en paralelo *");
			System.out.println("* Ingrese tres valores de resistencias positivos       *");
			System.out.println("********************************************************");
			
			// declaramos las tres variables como punto flotante
			float resistencia1 = 0;
			float resistencia2 = 0;
			float resistencia3 = 0;
			
			// ingreso y validación del valor ingresado por usuario
			do {
			
			    System.out.println("Ingrese resistencia 1:");
				resistencia1 = leer.nextFloat();
				if (resistencia1 <=0) {
					System.out.println("Ingrese un valor positivo: ");
				}
				
			}while(resistencia1<=0);
			
			do {
				
			    System.out.println("Ingrese resistencia 2:");
				resistencia2 = leer.nextFloat();
				if (resistencia2 <=0) {
					System.out.println("Ingrese un valor positivo: ");
				}
				
			}while(resistencia2<=0);
			
			do {
				
			    System.out.println("Ingrese resistencia 3:");
				resistencia3 = leer.nextFloat();
				if (resistencia3 <=0) {
					System.out.println("Ingrese un valor positivo: ");
				}
				
			}while(resistencia3<=0);
			
			
			// cálculo de la resistencia total			
			float resistenciaTotal = (1/resistencia1 + 1/resistencia2 + 1/resistencia3);
			resistenciaTotal = 1/resistenciaTotal;
			
			System.out.println("La resistencia total es de " +Math.round(resistenciaTotal*100.0)/100.0);
		}

	}
