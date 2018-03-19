package by.htp.gadalka;

public class MainApp {
	public static void main(String[] args) {
		
		Romashka rom1 = new Romashka();
		Romashka rom2 = new Romashka();
		
		Gadalka gadalka = new Gadalka();
		
		gadalka.getRomashki().add(rom1);
		gadalka.getRomashki().add(rom2);
		
		Gadanie gad1 = new Gadanie("work");
		Gadanie gad2 = new Gadanie("love");
		Gadanie gad3 = new Gadanie("fortune");
		
		gadalka.addGadanie(gad1);
		gadalka.addGadanie(gad2);
		gadalka.addGadanie(gad3);
		
		Client client = new Client();
		client.askGadalkaPogadat("work", gadalka);
		
	}

}
