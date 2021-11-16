package listes;

public class Ville implements Comparable<Ville>{
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
		return this.getName() + " a "+this.getNbHabitants() + " habitants" ;
	}

//	@Override
//	public int compareTo(Ville autre) {		
//		return this.name.compareTo(autre.getName());		
//	}
	
	@Override
	public int compareTo(Ville autre) {
		if(this.nbHabitants > autre.getNbHabitants()) {
			return 1;
		}else if (this.nbHabitants < autre.getNbHabitants()) {
			return -1;			
		}
		return 0;
	}

}
