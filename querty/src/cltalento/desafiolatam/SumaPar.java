package cltalento.desafiolatam;

import java.util.Scanner;

public class SumaPar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = 0;
		int total = 0;

		System.out.println("Ingrese un número entero");

		num1 = sc.nextInt();
		for (int i = 1; i <= num1; i++) {
			if ((i % 2) == 0) {// verificar que el numero sea par
				total = total + i;
			}
		}
		System.out.println(" la suma tota  de los numeros pares: " + total);
		
		sc.close();
	}
}
