package cl.desafiolatam.clases;

import java.util.List;

public class ListadoRespuesta {
	
		
	// método para listar todos los libros desde la primera Api
	
	public void listarLibros(List<Book> lista) {
		
		System.out.println(" 1.- Listado de libros desde la primera Api");
		System.out.println();
		System.out.println(lista);
		System.out.println();
		
	}
	// método para listar todos los libros desde la primera Api, sólo autor y título
	
	public void listarLibros2(List<Book> lista) {
		
		System.out.println(" 2.- Listado de libros (Autor + Título) desde la primera Api");
		System.out.println();
		
		for (Book book : lista) {
			
		System.out.println(book.getAuthor() + ":"  + book.getTitle());
		
		}
		System.out.println();
	}
	
	// método para listar todos los libros desde la primera Api, posiciones 3 y 8
	
	public void listarLibros3(List<Book> lista) {
		
		System.out.println(" 3.- Listado de libros posición 3 y 8 desde la primera Api");
		System.out.println();
		System.out.println(lista.get(3));
		System.out.println(lista.get(8));
		System.out.println();
		
	}
	
	// método para listar el detalle de todos los libros desde la segunda Api
	
	public void listarLibros4(List<BookDetail> lista) {
		
		System.out.println(" 4.- Listado de detalle de libros desde la segunda Api");
		System.out.println();
		System.out.println(lista);
		System.out.println();
		
	}
	
	// método para listar todos los libros desde la primera Api cuyo autor es anónimo
	
	public void listarLibros5(List<Book> lista) {
		
		System.out.println(" 5.- Listado de libros cuyo autor es anónimo");
		System.out.println();
		
		for (Book book : lista) {
			
			if (book.getAuthor().equals("Unknown")) {
			
			System.out.println("Autor: " + book.getAuthor() + "-"  + "libro: " +  book.getTitle());
			
			
			}
		}	
		System.out.println();
	}
	
	// método para listar todos los libros con delivery desde la segunda Api
	
	public void listarLibros6(List<BookDetail> lista) {
		
		System.out.println(" 6.- Listado de libros con delivery");
		System.out.println();
		
		for (BookDetail bookDetail : lista) {
			
			if (bookDetail.isDelivery())
				System.out.println("Libro: "  + bookDetail.getTitle());
				
		}
		System.out.println();
		
	}
	
	
}
