package tri;

import java.util.Comparator;

import listes.Ville;

public class ComparatorHabitant implements Comparator<Ville> {

	@Override
	public int compare(Ville v1, Ville v2) {
		if (v1.getNbHabitants() > v2.getNbHabitants()) {
			return 1;
		} else if (v1.getNbHabitants() < v2.getNbHabitants()) {
			return -1;
		}
		return 0;
	}
}
