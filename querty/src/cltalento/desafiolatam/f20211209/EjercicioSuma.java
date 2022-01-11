package cltalento.desafiolatam.f20211209;

public class EjercicioSuma {

	public static void main(String[] args) {
		
		double promedio = promedio();
		System.out.println("El promedio de sueldos mayores a $ 500.000 es  " + promedio);

	}

	public static Double promedio() {
		// Dentro del método promedio, declarar una variable local llamada promedio que
		// parte en cero, una variable suma y un contador
		double promedio = 0;
		int suma = 0;
		int contador = 0;

		// Inicializar el arreglo con valores aleatorios

		int[] arreglosueldos = { 501000, 760000, 1100000, 650000, 654984, 350000, 480000, 499995 }; // arregloNumeros.length
																									// = 8
		// Recorrer el arreglo con un ciclo for.
		for (int i = 0; i < arreglosueldos.length; i++) {
			/*
			 * ● Dentro del ciclo, realizar condición if donde preguntamos por los valores
			 * que están en el intervalo solicitado.
			 */
			int numero = arreglosueldos[i];

			if (numero > 500000) {
				// Si la condición se cumple, sumamos los valores

				suma = suma + numero;
				contador += 1;

			} // calculamos el promedio
			promedio = suma / contador;
		}
		return promedio;

	}
}
