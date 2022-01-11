package cltalento.desafiolatam;
// alumno : Luis Sanhueza Soto
import java.util.Scanner;

public class SoloPares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num1 = 0;

		System.out.println("Ingrese un número entero:");

		num1 = sc.nextInt();

		for (int i = 0; i < num1; i++) {
			System.out.println(2*i);
		}
			
		sc.close();

	}

}
