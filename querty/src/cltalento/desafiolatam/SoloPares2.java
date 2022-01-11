package cltalento.desafiolatam;
// alumno : Luis Sanhueza Soto
import java.util.Scanner;

public class SoloPares2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num1 = 0;
		System.out.println("** Muestra los n numeros pares **");
		System.out.println("Ingrese un número entero:");

		num1 = sc.nextInt();

		for (int i = 1; i <= num1; i++) {
			System.out.println(2*i);
		}
			
		sc.close();
	}
	}
