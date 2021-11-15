package fr.diginamic.jdr.personnages;

public class Joueur extends Personnage {

	//variable speciale pour le joeur principal 
	private int score;
	// declaration constantes
	private static final int MIN_FORCE = 12;
	private static final int MAX_FORCE = 18;
	private static final int MIN_VIE = 20;
	private static final int MAX_VIE = 50;

	public Joueur(String name) {
		super(MIN_FORCE, MAX_FORCE, MIN_VIE, MAX_VIE, name);
	}

	public int getScore() {
		return score;
	}
	
	public void augmenteScore(int score) {
		this.score += score;
	}
}
