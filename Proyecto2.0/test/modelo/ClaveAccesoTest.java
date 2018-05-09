package modelo;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sun.media.sound.SimpleSoundbank;


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
	
	public void testConstructorConvencionalIncorrecto() {
		try {
			new ClaveAcceso("ppp");
		} catch (ModeloException e) {
			assertTrue(true);
		}
	}
}
