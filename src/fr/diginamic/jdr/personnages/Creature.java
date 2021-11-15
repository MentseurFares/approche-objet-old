package fr.diginamic.jdr.personnages;

public class Creature extends Personnage {

	private int recompense;

	public Creature(int minForce, int maxForce, int minVie, int maxVie, String name, int recompense) {
		super(minForce, maxForce, minVie, maxVie, name);
		this.recompense = recompense;
	}

	public int getRecompense() {
		return recompense;
	}

}
