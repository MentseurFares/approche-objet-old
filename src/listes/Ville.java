package listes;

import java.util.Objects;

import fr.diginamic.testenumeration.Continent;

public class Ville implements Comparable<Ville> {
	private String name;
	private int nbHabitants;
	private Continent continent;

	public Ville(String name, int nbHabitants) {
		super();
		this.name = name;
		this.nbHabitants = nbHabitants;
	}

	public Ville(String name, int nbHabitants, Continent continent) {
		super();
		this.name = name;
		this.nbHabitants = nbHabitants;
		this.continent = continent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	@Override
	public String toString() {
		if (continent != null) {
			return this.getName() + " du continent d'" + this.continent.getLibelle() + " a " + this.getNbHabitants() + " habitants";
		}
		return this.getName() + " a " + this.getNbHabitants() + " habitants";
	}

//	@Override
//	public int compareTo(Ville autre) {		
//		return this.name.compareTo(autre.getName());		
//	}

	@Override
	public int compareTo(Ville autre) {
		return Integer.compare(nbHabitants, autre.nbHabitants);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, nbHabitants);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Ville)) {
			return false;
		}
		Ville other = (Ville) obj;
		return name.equals(other.getName()) && nbHabitants == other.getNbHabitants();
	}

	public Continent getContinent() {
		return continent;
	}

	public void setContinent(Continent continent) {
		this.continent = continent;
	}

}
