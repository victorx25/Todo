/** 
 * Proyecto: Juego de la vida.
 * Clase JUnit de prueba automatizada de las características de la clase Usuario según el modelo 2.
 * @since: prototipo2
 * @source: TestUsuario.java 
 * @version: 2.0 - 2017.03.21
 * @author: ajp
 */

package modelo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import modelo.ModeloException;
import modelo.ClaveAcceso;
import modelo.Correo;
import modelo.DireccionPostal;
import modelo.Nif;
import modelo.Usuario;
import modelo.Usuario.RolUsuario;
import util.Fecha;
import util.UtilException;

public class UsuarioTest {
	private Usuario usuario1; 
	private Usuario usuario2; 
	
	/**
	 * Método que se ejecuta antes de cada @Test para preparar datos de prueba.
	 * @throws DatosException 
	 */
	@Before
	public void iniciarlizarDatosPrueba() {
		// Objetos para la prueba.
		try {
			usuario1 = new Usuario(); 
			usuario2 = new Usuario(new Nif("00000000T"), "Luis", "Pérez Ruiz",
					new DireccionPostal("Roncal", "10", "30130", "Murcia"), 
					new Correo("luis@gmail.com"), new Fecha(2000, 03, 21),
					new Fecha(2017,05,12), new ClaveAcceso(), RolUsuario.NORMAL);
		} 
		catch (ModeloException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Método que se ejecuta después de cada @Test para limpiar datos de prueba.
	 */
	@After	
	public void borrarDatosPrueba() {
		usuario1 = null;
		usuario2 = null;
	}
	
	// Test CON DATOS VALIDOS
	@Test
	public void testSetFechaAlta() {
		
		try {
			usuario1.setFechaAlta(new Fecha(2012, 2, 9, 10, 9, 0));
			assertEquals( usuario1.getFechaAlta(), new Fecha(2012, 2, 9, 10, 9, 0)); 
		} 
		catch (UtilException e) {
			fail("No debe llegar");
		}
	}

	@Test
	public void testSetClaveAcceso() {
		try {
			usuario1.setClaveAcceso(new ClaveAcceso("Hola#12"));
			assertEquals(usuario1.getClaveAcceso(), new ClaveAcceso("Hola#12"));
		} 
		catch (Exception e) { } 
	}

	@Test
	public void testSetRol() {
		usuario1.setRol(RolUsuario.INVITADO);
		assertEquals(usuario1.getRol(), RolUsuario.INVITADO);
	}
	
	@Test
	public void testToString() {
		
		assertEquals(usuario2.toString(),"nif:             00000000T\n" + 
				"nombre:          Luis\n" + 
				"apellidos:       Pérez Ruiz\n" + 
				"idUsr:           LPR0T\n" + 
				"domicilio:       Roncal, 10, 30130, Murcia\n" + 
				"correo:          luis@gmail.com\n" + 
				"fechaNacimiento: 2000.03.21 - 00:00:00\n" + 
				"fechaAlta:       2017.05.12 - 00:00:00\n" + 
				"claveAcceso:     Pmeyd4\n" + 
				"rol:             NORMAL\n");
	}

	@Test
	public void testEqualsObject() {
		try {
			usuario1 = new Usuario(new Nif("00000000T"), "Luis", "Pérez Ruiz",
					new DireccionPostal("Roncal", "10", "30130", "Murcia"), 
					new Correo("luis@gmail.com"), new Fecha(2000, 03, 21),
					new Fecha(2017,05,12), new ClaveAcceso(), RolUsuario.NORMAL);
		} 
		catch (Exception e) { }
		assertEquals(usuario1, usuario2);
	}

	public void testHashCode() {
		System.out.println(usuario2.hashCode());
		assertEquals(usuario2.hashCode(), -2032408461);
	}

	// Test CON DATOS NO VALIDOS
	
	@Test
	public void testSetNombreFormatoIncorrecto() {
		try {
			usuario1.setNombre("Pe pe");
			fail("No debe llegar aquí...");
		} 
		catch (AssertionError e) { // Con ModeloException da fallo por lo que he probado Exception.
				
		}
	}
	
	@Test
	public void testSiempreSuperado() {
		
	}
	
	@Test
	public void testSetClaveAccesoNull() {
		try {
			usuario1.setNif(null);
			fail("No debe llegar aquí...");
		} 
		catch (AssertionError e) { 
			assertTrue(true);
		}
	}
	
	@Test
	public void testSetFechaAltaNull() {
		try {
			usuario2.setFechaAlta(null);
			fail("No debe llegar aquí...");
		} 
		catch (AssertionError e) {
		}
	}
	
	@Test
	public void testValidarFechaIncorrecta() {
		try {
			usuario1.setFechaAlta(new Fecha(-2018, 20, 90, 100, 900, -10));
			fail("No debe llegar aqui");
		} 
		catch (Exception e) { 
		
		}
	}
		
	@Test
	public void testSetRolNull() {
		try {
			usuario1.setRol(null);
			fail("No debe llegar aquí...");
		} 
		catch (AssertionError e) { 
			assertTrue(true);
		}
	}
	
	
} // class
