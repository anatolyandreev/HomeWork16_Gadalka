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
	
	@Before
	public void initTestData() {
		cl = new Client();
		gadalka = new Gadalka();
		gadanie = new Gadanie();
		
	}
	
	@Test
	public void gadanieTest1() {
		String actual = cl.askGadalkaPogadat("love", gadalka);
		String[] expected = Gadanie.getWorkvariants();
		System.out.println(cl.askGadalkaPogadat("work", gadalka));
	}
	

}
