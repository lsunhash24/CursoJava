package cltalento.desafiolatam.f20211209;

public class Arrays {

	public static void main(String[] args) {
		
			
			String[] vocales = {"a","e","i","o","u"};
			System.out.println(vocales.length);
			
			
			
			int[] sinNumeros = {};//cero 
			System.out.println(sinNumeros.length);
			
						
			//definicion de arreglo estatico de tamaño 5
			int[] numerosPares = new int[15];
			//int[] numeroPares = {2,4,6,8,10};
			System.out.println("numerosPares "+numerosPares.length);
			
			String[] alumnos = new String[25]; //{"Romina","Soledad","Andres" };
			
			//Recorriendo arreglos
									//5
			for (int i = 0; i < vocales.length; i++) {
				//valor i (indice o posicion)
				System.out.printf("valor de i %d ", i);
				//acceder a cada elemento, uno por uno
				System.out.println(" Elemento "+ vocales[i]);
			}
			
			//acceso individual
			System.out.println("** Elemento vocales[0] "+ vocales[0] );
			System.out.println("** Elemento vocales[4] "+ vocales[4] );   
		}
			
			
			
			
			
			
			
			
			
		}

	


