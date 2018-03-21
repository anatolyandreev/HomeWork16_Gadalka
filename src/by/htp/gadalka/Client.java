package by.htp.gadalka;

import java.util.Date;

public class Client {

	private Date date;

	public Client() {

	}

	public String askGadalkaPogadat(String name, Gadalka g) {
		String result = null;
		g.checkGadalkaMood();
		if (g.getGadaniyaNames().contains(name)) {
			if (g.isGoodMood()) {
				String[] strArray = g.getGadanieByName(name).getGadanie().get(name);
				if (strArray.length >= g.getRomashki().get(0).getSize()) {
					result = strArray[g.getRomashki().get(0).getSize() - 1];
					g.getRomashki().remove(0);
				} else {
					int index = g.getRomashki().get(0).getSize() % strArray.length;
					if (index != 0) {
						result = strArray[index - 1];
						g.getRomashki().remove(0);
					} else {
						result = strArray[strArray.length - 1];
						g.getRomashki().remove(0);
					}
				}
			} else {
				result = "Gadalka has no Romashek, that's sad :(\n Good bye";
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
