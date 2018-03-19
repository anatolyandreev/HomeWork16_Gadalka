package by.htp.gadalka;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Gadalka {
	
	private boolean isGoodMood;
	private LinkedList<Romashka> romashki;
	private Set<Client> clients;
	private List<Gadanie> gadaniya;
	private List<String> gadaniyaNames;
	
	public Gadalka() {
		romashki = new LinkedList<>();
		clients = new HashSet<>();
		gadaniya = new LinkedList<>();
		gadaniyaNames = new ArrayList<>();
	}

	public boolean isGoodMood() {
		return isGoodMood;
	}

	public void setGoodMood(boolean isGoodMood) {
		this.isGoodMood = isGoodMood;
	}

	public List<Romashka> getRomashki() {
		return romashki;
	}

	public void setRomashki(LinkedList<Romashka> romashki) {
		this.romashki = romashki;
	}

	public Set<Client> getClients() {
		return clients;
	}

	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}

	public List<Gadanie> getGadaniya() {
		return gadaniya;
	}

	public void setGadaniya(List<Gadanie> gadaniya) {
		this.gadaniya = gadaniya;
	}

	public List<String> getGadaniyaNames() {
		for (Gadanie g : gadaniya) {
			gadaniyaNames.add(g.getGadanieName());
		}
		return gadaniyaNames;
	}

	public void setGadaniyaNames(List<String> gadaniyaNames) {
		this.gadaniyaNames = gadaniyaNames;
	}
	
	public void addGadanie(Gadanie g) {
		gadaniya.add(g);
	}
	
	public boolean isRomashkiEmpty() {
		return this.romashki.isEmpty();
	}
	
	public Gadanie getGadanieByName(String name) {
		Gadanie tmp = new Gadanie();
		for (Gadanie g : this.getGadaniya()) {
			if (g.getGadanie().containsKey(name)) {
				tmp = g;
				return tmp;
			} else {
				System.out.println("Gadalka doesn't have Gadanie with name " + name);
			}
		}
		return tmp;
	}

}
