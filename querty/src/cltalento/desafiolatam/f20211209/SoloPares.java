package Fechas;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayNumerosPares {

	public static void main(String[] args) {
		numerosParesImpares();

	}

	public static void numerosParesImpares() {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		ArrayList<Integer> numerosPares = new ArrayList<>();
		ArrayList<Integer> numerosImpares = new ArrayList<>();

		do {
			System.out.println("Ingrese un numero");
			int numero = sc.nextInt();

			if (numero % 2 == 0) {
				numerosPares.add(numero);
			}else {
				numerosImpares.add(numero);
			}
			System.out.println("*desea ingresar otro numero *");
			System.out.println("* (0) NO - (1) SI *");
			opcion = sc.nextInt();
			sc.nextLine();

		} while (opcion == 1);

		System.out.println("numeros pares " + numerosPares);
		System.out.println("numeros impares " + numerosImpares);
	}
}
