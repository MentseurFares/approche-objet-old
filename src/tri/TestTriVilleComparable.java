package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import listes.Ville;

public class TestTriVilleComparable {
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
		
//		Collections.sort(listVilles);
		
		Collections.sort(listVilles, new ComparatorHabitant());
		
		for (Ville ville : listVilles) {
			System.out.println(ville);
		}
		
	}
}
