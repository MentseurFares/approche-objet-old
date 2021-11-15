package fr.diginamic.salaire;

public class Pigiste extends Intervenant {

	private int nbJours;
	private double salaireJournalier;

	public Pigiste(String nom, String prenom, int nbJours, double salaireJournalier) {
		super(nom, prenom);
		this.nbJours = nbJours;
		this.salaireJournalier = salaireJournalier;
	}

	@Override
	public double getSalaire() {

		return nbJours * salaireJournalier;
	}

	@Override
	public String getStatut() {
		return "Pigiste";
	}

}
