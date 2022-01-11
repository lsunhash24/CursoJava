package cltalento.desafiolatam;

import java.util.Scanner;

public class CicloFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = 0;

		System.out.println("Ingrese un número entero");
		try {
			
			num1 = sc.nextInt();
			if (num1 > 0) {
		} catch (Exception e) {
			System.out.println(" error -> " + e);
		} 

		for (int i = num1; i > 0; i--) {
			System.out.println("      " + i);

		}
		sc.close();
	}
}
