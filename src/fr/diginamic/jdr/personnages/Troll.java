package fr.diginamic.jdr.personnages;

public class Troll extends Creature {
	
	// Declaration constantes 
	private static final int MIN_FORCE = 10;	
	private static final int MAX_FORCE = 15;
	private static final int MIN_VIE = 20;
	private static final int MAX_VIE = 30 ;
	private static final int RECOMPENSE = 5;
	private static final String NAME = "TROLL";

	public Troll() {
		super(MIN_FORCE, MAX_FORCE, MIN_VIE, MAX_VIE, NAME, RECOMPENSE);
	}
	
}
