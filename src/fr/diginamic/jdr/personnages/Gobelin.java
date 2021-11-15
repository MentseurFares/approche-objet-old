package fr.diginamic.jdr.personnages;

public class Gobelin extends Creature {

	
	// Declaration constantes 
	private static final int MIN_FORCE = 5;
	private static final int MAX_FORCE = 10;
	private static final int MIN_VIE = 10;
	private static final int MAX_VIE = 15;
	private static final int RECOMPENSE = 2;
	private static final String NAME = "GOBELIN";

	public Gobelin() {
		super(MIN_FORCE, MAX_FORCE, MIN_VIE, MAX_VIE, NAME, RECOMPENSE);
	}
}
