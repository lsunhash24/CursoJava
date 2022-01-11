package com.desafiolatam.f20211213;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String directorio = "src/com/desafiolatam/f20211213";
		
		System.out.println("ingrese nombre de fichero a crear");
		String fichero = sc.nextLine();
		
		crearArchivo(directorio,fichero);
		
	}
	
	public static void crearArchivo(String directorio,String fichero) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Perro");
		lista.add("Gato");
		lista.add("Juan");
		lista.add("Daniel");
		lista.add("Juan");
		lista.add("Gato");
		lista.add("Perro");
		lista.add("Camila");
		lista.add("Daniel");
		lista.add("Camila");

		// ruta de mi carpeta
		File carpeta = new File(directorio);
		// si no exite la ruta, crea la nueva carpeta
		if(!carpeta.exists()) {
			carpeta.mkdir();
		}
		
		File archivo = new File(directorio+"/"+fichero+".txt");
		if(!archivo.exists()) {
			try {
				archivo.createNewFile();
				FileWriter fileWriter = new FileWriter(archivo);
				BufferedWriter buff = new BufferedWriter(fileWriter);
				buff.newLine();
				for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
					String palabra = (String) iterator.next();
					buff.write(palabra);
				}
				buff.close();
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void buscarTexto(String nombreFichero,String texto) {
		
	}

}


