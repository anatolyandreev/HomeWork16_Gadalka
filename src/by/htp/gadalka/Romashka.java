package by.htp.gadalka;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Romashka {

	private Lepestok lepestok;
	private List<Lepestok> lepestoks;
	private static final int maxlepestkovVRomvashke = 10;
	private int size;

	public Romashka() {
		size = randomWithRange(1, maxlepestkovVRomvashke);
		lepestoks = new ArrayList(size);
		for (int i= 0; i < size; i++) {
			lepestoks.add(new Lepestok());
		}
	}
	
	public static int randomWithRange(int min, int max) {
		int range = (max - min) + 1;
		return (int) (Math.random() * range) + min;
	}

	public Lepestok getLepepestok() {
		return lepestok;
	}

	public void setLepepestok(Lepestok lepepestok) {
		this.lepestok = lepepestok;
	}

	public List<Lepestok> getLepestoks() {
		return lepestoks;
	}

	public void setLepestoks(List<Lepestok> lepestoks) {
		this.lepestoks = lepestoks;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
}