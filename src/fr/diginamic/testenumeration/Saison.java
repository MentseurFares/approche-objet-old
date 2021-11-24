package fr.diginamic.testenumeration;

public enum Saison {

	PRINTEMPS("Printemps", 1), ETE("Ete", 2), AUTOMNE("Automne", 3), HIVER("Hiver", 4);

	private String libelle;
	private int ordre;

	private Saison(String libelle, int ordre) {

		this.libelle = libelle;
		this.ordre = ordre;
	}

	static Saison getSaisonByLibelle(String libelle) {
		for (Saison saison : values()) {
			if (saison.getLibelle().equalsIgnoreCase(libelle)) {
				return saison;
			}
		}
		return null;
	}

	public String getLibelle() {
		return libelle;
	}

	public int getOrdre() {
		return ordre;
	}

}
