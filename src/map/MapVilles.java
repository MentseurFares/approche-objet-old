package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import listes.Ville;

public class MapVilles {

	public static void main(String[] args) {
		HashMap<String, Ville> mapVilles = new HashMap<>();

		mapVilles.put("Nice", new Ville("Nice", 343_000));
		mapVilles.put("Carcassone", new Ville("Carcassone", 47_800));
		mapVilles.put("Narbonne", new Ville("Narbonne", 53_400));
		mapVilles.put("Lyon", new Ville("Lyon", 484_000));
		mapVilles.put("Foix", new Ville("Foix", 9_700));
		mapVilles.put("Pau", new Ville("Pau", 77_200));
		mapVilles.put("Marseille", new Ville("Marseille", 850_700));
		mapVilles.put("Tarbes", new Ville("Tarbes", 40_600));

		Iterator<Ville> villes = mapVilles.values().iterator();
		Ville max = null;
		String keyMax = null;
		for (String cityName : mapVilles.keySet()) {
			Ville ville = mapVilles.get(cityName);
			if (max == null || (ville.compareTo(max) > 0)) {
				max = ville;
				keyMax = cityName;
			}
		}
		
		System.out.println(keyMax + "   " +mapVilles.get(keyMax));
		mapVilles.remove(keyMax);
		System.out.println("---------------------------------------");
		for (Map.Entry<String, Ville> entry : mapVilles.entrySet()) {			
			System.out.println(entry.getKey()+"       "+entry.getValue());
		}
	}
	
}
