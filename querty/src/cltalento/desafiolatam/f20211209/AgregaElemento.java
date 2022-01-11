package cltalento.desafiolatam.f20211209;

import java.util.ArrayList;
import java.util.Scanner;

public class AgregaElemento {

	public static void main(String[] args) {
		
		int opcion = 0;
		do {
		System.out.println("Ingrese elemento a agregar en la casa");
		Scanner casa = new Scanner(System.in);
		String elementoCasa = casa.nextLine();

		agregarElemento(elementoCasa);
		
		System.out.println("*Desea consultar otra parte");
		System.out.println("* (0) NO - (1) SI *");
		opcion = casa.nextInt();
		casa.nextLine();
		
	}while(opcion==1);

	}

	public static void agregarElemento(String elementoCasa) {

		int cantidad = 0;
		ArrayList<String> casa = new ArrayList<String>();
		if (casa.size() == 0) {
			casa.add(elementoCasa);
		} else {
			for (int i = 0; i < casa.size(); i++) {
				if (casa.get(i).equals(elementoCasa)) {
					System.out.println("Elemento ya existe");
					cantidad++;
				}
			}
			if (cantidad == 0) {
				casa.add(elementoCasa);
			}

		}
		System.out.println(casa);
	}

}
