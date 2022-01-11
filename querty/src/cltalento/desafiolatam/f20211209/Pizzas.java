package cltalento.desafiolatam.f20211209;

import java.util.ArrayList;
import java.util.Scanner;

public class Pizzas {

	public static void main(String[] args) {
		 ingredientes();
	}
	
	public static void ingredientes() {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> pizza = new ArrayList<String>();
		pizza.add("Masa");
		pizza.add("Queso");
		pizza.add("Tomate");
		System.out.println(pizza);
		int opcion = 0;
		do {
			System.out.println("Ingresa el ingrediente a agregar a su Pizza");
			String ingrediente = sc.nextLine();
			if(pizza.size() == 0) {
				pizza.add(ingrediente);
			}else {
				boolean existe = false;
				//recorrer la pizza
				for (int i = 0; i < pizza.size(); i++) {
					String ingredienteExistente = pizza.get(i);
					//comparar TODOS lo ingredientes existentes con el nuevo ingresado
					if(ingredienteExistente.equalsIgnoreCase(ingrediente)) {
						existe = true;
						System.out.println("Ingrediente ya existe!!");
					}					
				}
				//distinto(!) de verdadero (true)
				if(!existe) {
					pizza.add(ingrediente);
				}

				//si existe, no es agregado, si no existe lo agregamos  
				
			}
			//como va quedando la pizza
			System.out.println(pizza);
			
			System.out.println("*Desea consultar otro ingrediente *");
			System.out.println("* (0) NO - (1) SI *");
			opcion = sc.nextInt();
			sc.nextLine();
			
		}while(opcion==1);
		
		
		/*eliminar por indice*/
		System.out.println("Desea eliminar algun igrediente?");
		System.out.println("* (0) NO - (1) SI *");
		opcion = sc.nextInt();
		sc.nextLine();
		if(opcion==1) {
			System.out.println("Ingrese el ingrediente a eliminar");
			String ingrediente = sc.nextLine();
			for (int i = 0; i < pizza.size(); i++) {
				String ingredienteExistente = pizza.get(i);
				//comparar TODOS, si exite lo elimina
				if(ingredienteExistente.equalsIgnoreCase(ingrediente)) {
					pizza.remove(i);
				}					
			}
		}
		
		
		System.out.println("*Confirma su pedido *");
		System.out.println("* (0) Cancela - (1) Confirma   *");
		opcion = sc.nextInt();
		sc.nextLine();
		//cancela
		if(opcion==0) {
			//eliminamos todos los elementos del arreglo
			pizza.clear();
			//arreglo vacio, tamaño 0
			System.out.println("pizza eliminada "+pizza);
		}
		System.out.println("*** Su pedido de Pizza " + pizza);
	}

}
