package cl.desafiolatam;
//alumno: Luis Sanhueza
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import cl.desafiolatam.clases.Book;
import cl.desafiolatam.clases.BookDetail;
import cl.desafiolatam.clases.ListadoRespuesta;

public class Main {

	public static void main(String[] args) {
		
				// instancia de clase "ListadoRespuesta" para invocar métodos para listar libros
				ListadoRespuesta listar = new ListadoRespuesta();
									
				//Crear un cliente
		
				Client cliente = ClientBuilder.newClient();
								
				//Cliente consume desde las API la información
				WebTarget target = cliente.target("https://my-json-server.typicode.com/Himuravidal/anchorBooks").path("books");
				
				WebTarget target2 = cliente.target("https://my-json-server.typicode.com/Himuravidal/anchorBooks").path("bookDetail");
				
				//WebTarget construye el Request
				
				Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON);
				
				Invocation.Builder invocationBuilder2 = target2.request(MediaType.APPLICATION_JSON);
				
				//El builder tiene la información del request y le pedimos ejecutar un get 
				
				Response respuestaPublicaciones = invocationBuilder.get();
				
				Response respuestaPublicaciones2 = invocationBuilder2.get();
				
				//A la respuesta le pedimos que lea la información
				List<Book> listaPublicaciones = respuestaPublicaciones.readEntity(new GenericType<List<Book>>() {});
				
				List<BookDetail> listaPublicaciones2 = respuestaPublicaciones2.readEntity(new GenericType<List<BookDetail>>() {});
				
				// se invocan los métodos con lista de publicaciones de ambas Api como parámetro
				// para listar libros desde la clase "ListadoRespuesta"
				
				listar.listarLibros(listaPublicaciones);
				
				listar.listarLibros2(listaPublicaciones);
				
				listar.listarLibros3(listaPublicaciones);
				
				listar.listarLibros4(listaPublicaciones2);
				
				listar.listarLibros5(listaPublicaciones);
				
				listar.listarLibros6(listaPublicaciones2);
				
				}

}
