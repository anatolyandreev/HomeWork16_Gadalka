package by.htp.gadalka;

import java.util.HashMap;
import java.util.List;

public class Gadanie {

	private String gadanieName;
	private String[] gadaniyeVariants;
	HashMap<String, String[]> gadanie;
	private static final String[] workVariants = { "work1", "work2", "work3", "work4", "work5" };
	private static final String[] loveVariants = { "love1", "love2", "love3", "love4", "love5" };
	private static final String[] fortuneVariants = { "frotune1", "frotune2", "frotune3", "frotune4", "frotune5" };

	public Gadanie(String name) {
		gadanie = new HashMap<>();
		gadanieName = name;
		if (name.equals("work")) {
			gadaniyeVariants = workVariants;
			gadanie.put(name, gadaniyeVariants);
		} else if (name.equals("love")) {
			gadaniyeVariants = loveVariants;
			gadanie.put(name, gadaniyeVariants);
		} else if (name.equals("fortune")) {
			gadaniyeVariants = fortuneVariants;
			gadanie.put(name, gadaniyeVariants);
		} else {
			System.out.println("enter name for 'gadanie': work, love or fortune");
		}
	}

	public Gadanie() {
	}

	public String getGadanieName() {
		return gadanieName;
	}

	public void setGadanieName(String gadanieName) {
		this.gadanieName = gadanieName;
	}

	public String[] getGadaniyeVariants() {
		return gadaniyeVariants;
	}

	public void setGadaniyeVariants(String[] gadaniyeVariants) {
		this.gadaniyeVariants = gadaniyeVariants;
	}

	public HashMap<String, String[]> getGadanie() {
		return gadanie;
	}

	public void setGadanie(HashMap<String, String[]> gadanie) {
		this.gadanie = gadanie;
	}

	public static String[] getWorkvariants() {
		return workVariants;
	}

	public static String[] getLovevariants() {
		return loveVariants;
	}

	public static String[] getFortunevariants() {
		return fortuneVariants;
	}

	
	
}
