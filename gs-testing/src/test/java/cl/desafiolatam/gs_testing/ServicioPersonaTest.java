package cl.desafiolatam.gs_testing;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import cl.desafiolatam.gs_testing.modelos.Persona;
import cl.desafiolatam.gs_testing.servicios.ServicioPersona;

import java.util.Map;
import java.util.logging.Logger;

@DisplayName("Tests Clase ServicioPersona")
public class ServicioPersonaTest {

	private static Logger logger = Logger.getLogger("cl.desafiolatam.servicios.ServicioPersonaTest");
	private final ServicioPersona servicioPersona = new ServicioPersona();

	@Test
	public void testCrearPersona() {
	logger.info("info test crear persona");
	Persona juanito = new Persona("1234-1", "Juanito");
	String respuestaServicio = servicioPersona.crearPersona(juanito);
	assertEquals("Creada", respuestaServicio);
	
	}
	
	@Test
	public void testActualizarPersona() {
	logger.info("info test actualizar persona");
	Persona pepe = new Persona("1234-1", "Pepe");
	String respuestaServicio = servicioPersona.actualizarPersona(pepe);
	assertEquals("Actualizada", respuestaServicio);
	
	}
	
	@Test
	public void testEliminarPersona() {
	logger.info("info test eliminar persona");
	Persona pepe = new Persona("1234-1", "Pepe");
	String respuestaServicio = servicioPersona.eliminarPersona(pepe);
	assertEquals("Eliminada", respuestaServicio);
	
	}
	
	@Test
	public void testListarPersona() {
	logger.info("info test listar persona");
	Map<String, String> listaPersonas = servicioPersona.listarPersonas();
	assertNotNull(listaPersonas);
	
	}
	
	
}
