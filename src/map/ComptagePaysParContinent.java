package map;

import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent {

	public static void main(String[] args) {
		HashMap<String, Integer> mapContinent = new HashMap<>();
		ArrayList<Pays> listPays = new ArrayList<>();
		listPays.add(new Pays("France", 65, "Europe"));
		listPays.add(new Pays("Allemagne,", 80, "Europe"));
		listPays.add(new Pays("Belgique,", 10, "Europe"));
		listPays.add(new Pays("Russie", 150, "Océanie"));
		listPays.add(new Pays("Chine", 1400, "Asie"));
		listPays.add(new Pays("Indonésie", 220, "Océanie"));
		listPays.add(new Pays("Australie", 20, "Océanie"));

		for (Pays pays : listPays) {
			if (mapContinent.get(pays.getContinet()) == null) {
				mapContinent.put(pays.getContinet(), 1);
			} else {
				mapContinent.put(pays.getContinet(), mapContinent.get(pays.getContinet()) + 1);
			}
			System.out.println("--------------------");
			System.out.println(mapContinent);
		}

		System.out.println(mapContinent);
	}
}
