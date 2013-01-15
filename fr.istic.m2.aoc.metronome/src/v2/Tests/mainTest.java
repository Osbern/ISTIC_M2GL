package v2.Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import v2.Adaptor.Materiel;
import v2.Adaptor.Impl.Adaptor;
import v2.Adaptor.Impl.HorlogeImpl;
import v2.Command.Command;
import v2.Command.TocMesure;
import v2.Command.TocTemps;
import v2.Impl.Constantes;
import v2.Impl.Controller;
import v2.Impl.Moteur;

public class mainTest {
	
	private Moteur mot;
	private Controller ctl;

	@Before
	public void setUp() throws Exception {
		ctl = new Controller();
		mot = new Moteur();
		
		ctl.setMoteur(mot);
		mot.setController(ctl);
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
