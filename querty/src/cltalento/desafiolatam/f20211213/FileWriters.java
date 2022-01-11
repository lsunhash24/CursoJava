package cltalento.desafiolatam.f20211213;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriters {

	public static void main(String[] args) throws IOException {
		escribir();
		leer();
		System.out.println("*** fin file ***");
	}
	
	private static void leer() throws IOException {
		// Leer archivo 
		String rutaBase = "src/com/desafiolatam/f20211213";
		File archivo = new File(rutaBase+"/index.txt");
		
		try {
			FileReader fileReader = new FileReader(archivo);
			BufferedReader buffReader = new BufferedReader(fileReader);
			
			String  textoFila = buffReader.readLine();
			while( textoFila != null) {
				System.out.println(textoFila);
				textoFila = buffReader.readLine();
			}
			
			buffReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

	public static void escribir()
	{
		Scanner sc = new Scanner(System.in);
		String rutaBase = "src/com/desafiolatam/f20211213";
		
		// ruta de mi carpeta
		File carpeta = new File(rutaBase);
		// si no exite la ruta, crea la nueva carpeta
		if(!carpeta.exists()) {
			carpeta.mkdir();
		}
		
		try {
			File archivo = new File(rutaBase+"/index.txt");
			if(!archivo.exists()) {
				archivo.createNewFile();
			}
			
			FileWriter fileWriter = new FileWriter(archivo);
			fileWriter.write("cualquier cosa\n");
			fileWriter.write("otra linea");
			//fileWriter.close();
			
			BufferedWriter buff = new BufferedWriter(fileWriter);
			buff.newLine();//agrega nueva linea
			buff.write("Otro String");
			
			System.out.println("Ingrese texto a agregar");
			String texto = sc.nextLine();
			buff.newLine();//agrega nueva linea
			buff.write(texto);
			buff.close();
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
