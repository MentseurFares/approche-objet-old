package fr.diginamic.testenumeration;

public enum Continent {
	AFRIQUE("Afrique"), EUROPE("Europe"), ASIE("Asie"), AMERIQUE("Amérique"), OCEANIE("Océanie");

	private String libelle;

	private Continent(String libelle) {
		this.libelle = libelle;
	}

	public String getLibelle() {
		return libelle;
	}

}
