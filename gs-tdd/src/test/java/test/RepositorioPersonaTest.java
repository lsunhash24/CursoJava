package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.logging.Logger;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import modelos.Persona;
import repositorio.RepositorioPersona;

@DisplayName("Test Repositorio personas") 
public class RepositorioPersonaTest {
	
	private static Logger logger = Logger.getLogger("test.RepositorioPersonaTest");

	private RepositorioPersona repositorioPersona = mock(RepositorioPersona.class);
	
	@Test
	public void testCrearPersona() {
		
	logger.info("Informacion crear persona");
	Persona pepe = new Persona("1-2", "Pepe");
	
	when(repositorioPersona.crearPersona(pepe)).thenReturn("OK");
	when(repositorioPersona.crearPersona(null)).thenThrow(new NullPointerException());
	
	String crearPersonaRes = repositorioPersona.crearPersona(pepe);
	assertEquals("OK", crearPersonaRes);
	verify(repositorioPersona).crearPersona(pepe);

	}
	
	@Test
	public void testActualizarPersona () {
	logger.info("Informacion actualizar persona");	
	Persona juanito = new Persona("1-2", "Juanito");
	when(repositorioPersona.actualizarPersona(juanito)).thenReturn("OK");
	String actualizarRes = repositorioPersona.actualizarPersona(juanito);
	assertEquals("OK", actualizarRes);
	verify(repositorioPersona).actualizarPersona(juanito);
	
	}
}
