package map;

import java.util.HashMap;

public class CreationMap {

	public static void main(String[] args) {
		HashMap<String, Double> mapSalaire = new HashMap<>();
		mapSalaire.put("Paul", 1750.0);
		mapSalaire.put("Hicham", 1825.0);
		mapSalaire.put("Yu", 2250.0);
		mapSalaire.put("Ingrid", 2015.0);
		mapSalaire.put("Chantal", 2418.0);

		System.out.println("Map Size : " + mapSalaire.size());

	}

}
