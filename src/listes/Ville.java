package listes;

public class Ville {
	private String name;
	private int nbHabitants;

	public Ville(String name, int nbHabitants) {
		super();
		this.name = name;
		this.nbHabitants = nbHabitants;
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
		return this.getName() + " a "+this.getNbHabitants() + " d'habitants" ;
	}

}
