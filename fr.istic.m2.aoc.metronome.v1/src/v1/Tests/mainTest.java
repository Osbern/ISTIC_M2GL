package v1.Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import v1.Impl.Constantes;
import v1.Impl.Controller;
import v1.Impl.Moteur;
import v1.Impl.UI.IHM;

public class mainTest {
	
	private Moteur mot;
	private Controller ctl;

	@Before
	public void setUp() throws Exception {
		mot = new Moteur();
		ctl = new Controller();
		
		ctl.setMoteur(mot);
		
		IHM ihm = new IHM(ctl);
		ctl.setIHM(ihm);
	}

	@Test
	public void testEteintBase() {
		assertFalse(mot.getEtatMarche());
	}
	
	@Test
	public void testEnMarche() {
		ctl.start();
		assertTrue(mot.getEtatMarche());
	}
	
	@Test
	public void testInc() {
		int old = mot.getMesure();
		
		ctl.inc();
		assertEquals(old + 1, mot.getMesure());
	}
	
	@Test
	public void testDec() {
		int old = mot.getMesure();
		
		ctl.dec();
		assertEquals(old - 1, mot.getMesure());
	}
	
	@Test
	public void testIncMax() {
		for (int i = 0; i < 10; i++)
			ctl.inc();
		
		assertEquals(Constantes.MAX_MESURE, mot.getMesure());
	}
	
	@Test
	public void testDecMax() {
		for (int i = 0; i < 10; i++)
			ctl.dec();
		
		assertEquals(Constantes.MIN_MESURE, mot.getMesure());
	}
}
