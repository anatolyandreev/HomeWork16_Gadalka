package by.htp.gadalka;

import java.util.Arrays;

public class MainApp {
	public static void main(String[] args) {
		
		Gadalka gadalka = new Gadalka();
		
//		Gadanie gad1 = new Gadanie("work");
//		Gadanie gad2 = new Gadanie("love");
//		Gadanie gad3 = new Gadanie("fortune");
//		
//		gadalka.addGadanie(gad1);
//		gadalka.addGadanie(gad2);
//		gadalka.addGadanie(gad3);
		System.out.println(gadalka.getGadaniya());
		Client client = new Client();
		System.out.println("Gadalka has " + gadalka.getRomashki().size() + " romashek");
		String res = client.askGadalkaPogadat("love", gadalka);
		System.out.println("Client 1 gadnanie result " + res);
		String res2 = client.askGadalkaPogadat("work", gadalka);
		System.out.println("Client 2 gadnanie result " + res2);
		String res3 = client.askGadalkaPogadat("fortune", gadalka);
		System.out.println("Client 3 gadnanie result " + res3);
		String res4 = client.askGadalkaPogadat("love", gadalka);
		System.out.println("Client 4 gadnanie result " + res4);
	}

}
