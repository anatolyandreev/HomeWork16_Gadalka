package by.htp.gadalka;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class Test2 {
	
	Gadalka gd;
	Client cl;
	Gadanie gadanie;
	Gadalka gadalka;
	Romashka romashka;
	
	@Before
	public void initTestData() {
		cl = new Client();
		gadalka = new Gadalka();
		gadanie = new Gadanie();
		romashka = new Romashka();
		
	}
	
	@Test
	public void gadanieTest1() {
		String actual = cl.askGadalkaPogadat("work", gadalka);
		String[] expected = Gadanie.getWorkvariants();
		assertTrue(Arrays.asList(expected).contains(actual));
	}
	
	@Test
	public void gadanieTest2() {
		int size = gadalka.getRomashki().get(0).getSize();
		assertTrue(size > 0);
	}
	
	@Test
	public void gadanieTest3() {
		assertTrue(gadalka.getRomashki().size() > 0 && gadalka.getRomashki().size() <= 5 && gadalka.getRomashki() != null);
	}
	
	@Test
	public void gadanieTest4() {
		assertTrue(cl.askGadalkaPogadat("work", gadalka) != null);
	}
}
