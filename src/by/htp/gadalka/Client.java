package by.htp.gadalka;

import java.util.Date;

public class Client {

	private Date date;

	public Client() {

	}
	
	public String askGadalkaPogadat(String name, Gadalka g) {
		String result = null;
		if (g.getGadaniyaNames().contains(name)) {
			if (!g.isRomashkiEmpty()) {
				String[] strArray = g.getGadanieByName(name).getGadanie().get(name);
				if (strArray.length >= g.getRomashki().get(0).getSize()) {
					result = strArray[g.getRomashki().get(0).getSize()];
				} else {
					int index = g.getRomashki().get(0).getSize() % strArray.length;
					result = strArray[index];
				}
				for (int i = 0; i < g.getRomashki().get(0).getSize(); i++) {
				}
			}
		} else {
			System.out.println("Gadalka in not able gadat' by " + name);
		}
		return result;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	
	
}
