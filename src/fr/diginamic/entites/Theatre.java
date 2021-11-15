package fr.diginamic.entites;

public class Theatre {

	private String nom;
	private int capacite;
	private int totalClients;
	private double recetteTotal;

	public Theatre(String nom, int capacite) {
		this.nom = nom;
		this.capacite = capacite;
	}

	public void inscrire(int nbClient, double prixPlace) {
		if (nbClient + totalClients < capacite) {
			totalClients += nbClient;
			recetteTotal += prixPlace * nbClient;
		} else {
			System.err.println("Nombre de place restante insuffisantes, il reste que " + (capacite - totalClients));
		}
	}

	public int getTotalClients() {
		return totalClients;
	}

	public void setRecetteTotal(double recetteTotal) {
		this.recetteTotal = recetteTotal;
	}

	@Override
	public String toString() {
		return "Le theatre : " + this.nom + " a une capacite : " + this.capacite + " cliens \n\tNombre total de client : "
				+ this.totalClients + "\tTotal de recette : " + this.recetteTotal;
	}
}
