package fr.diginamic.entites;

public class Salarie {

	private String nom;
	private String prenom;
	private double salaire;

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	@Override
	public String toString() {
		return "Nom : " + this.nom + "\t prenom : " + this.prenom + "\tsalaire : " + this.salaire;
	}

}
