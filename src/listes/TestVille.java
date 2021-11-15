package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestVille {

	public static void main(String[] args) {

		ArrayList<Ville> listVilles = new ArrayList<>();
		listVilles.add(new Ville("Nice", 343_000));
		listVilles.add(new Ville("Carcassone", 47_800));
		listVilles.add(new Ville("Narbonne", 53_400));
		listVilles.add(new Ville("Lyon", 484_000));
		listVilles.add(new Ville("Foix", 9_700));
		listVilles.add(new Ville("Pau", 77_200));
		listVilles.add(new Ville("Marseille", 850_700));
		listVilles.add(new Ville("Tarbes", 40_600));
		
		int indexMax = 0;
		int indexMin = 0;
		for (int i = 0; i < listVilles.size(); i++) {
			if(listVilles.get(i).getNbHabitants() > listVilles.get(indexMax).getNbHabitants()) {
				indexMax = i;
			}
			if(listVilles.get(i).getNbHabitants() < listVilles.get(indexMin).getNbHabitants()) {
				indexMin = i;
			}
		}
		System.out.println("Ville la plus peuplée : "+listVilles.get(indexMax).getName());
		
		listVilles.remove(indexMin);
		
		for (Iterator iterator = listVilles.iterator(); iterator.hasNext();) {
			Ville ville = (Ville) iterator.next();
			if(ville.getNbHabitants() > 100_000) {
				ville.setName(ville.getName().toUpperCase());
			}			
		}
		
		for (Ville ville : listVilles) {
			System.out.println(ville);
		}
		
	}

}
