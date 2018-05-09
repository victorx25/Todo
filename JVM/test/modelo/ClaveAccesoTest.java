package test.modelo;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo.ClaveAcceso;
import modelo.ModeloException;

public class ClaveAccesoTest {
	
	@Test
	public void testConstructorConvencional() {
		try {
			assertEquals(new ClaveAcceso("Hola3$").getTexto(),"Lsoe7-");
		} catch (ModeloException e) {
			//No debe llegar aqui
			fail();
		}
	}
	
	@Test
	public void testConstructorConvencionalIncorrecto() {
		try {
			new ClaveAcceso("ppp");
		} catch (ModeloException e) {
			assertTrue(true);
		}
	}

}
