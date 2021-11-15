package fr.diginamic.jdr.personnages;

public class Loup extends Creature {
	
;
	// Declaration constantes 
	private static final int MIN_FORCE = 3;
	private static final int MAX_FORCE = 8;
	private static final int MIN_VIE = 5;
	private static final int MAX_VIE = 10;
	private static final int RECOMPENSE = 1;
	private static final String NAME = "LOUP";

	public Loup() {
		super(MIN_FORCE, MAX_FORCE, MIN_VIE, MAX_VIE, NAME, RECOMPENSE);
	}
	
}
