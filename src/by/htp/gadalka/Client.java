package by.htp.gadalka;

import java.util.Date;

public class Client {

	private Date date;

	public Client() {

	}
	
	public void askGadalkaPogadat(String name, Gadalka g) {
		if (g.getGadaniyaNames().contains(name)) {
			if (!g.isRomashkiEmpty()) {
				g.getRomashki().get(0).getSize();
				g.getGadanieByName(name);
			}
		} else {
			System.out.println("Gadalka in not able gadat' by " + name);
		}
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	
	
}
