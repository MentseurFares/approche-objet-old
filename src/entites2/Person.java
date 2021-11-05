package entites2;

import entites.AdressePostale;

public class Person {
	
	private String nom;
	private String prenom;
	private AdressePostale adresse;
	
	public Person(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public Person(String nom, String prenom, AdressePostale adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public AdressePostale getAdresse() {
		return adresse;
	}

	public void setAdresse(AdressePostale adresse) {
		this.adresse.setNumRue(adresse.getNumRue());
		this.adresse.setLibelleRue(adresse.getLibelleRue());
		this.adresse.setCodePostale(adresse.getCodePostale());
		this.adresse.setVille(adresse.getVille());
	}

	public void afficherEnMajuscule() {
		System.out.println("nom : "+ nom.toUpperCase()+"\t prenom : "+prenom);
	}

	@Override
	public String toString() {
		System.out.println("----------------------------------------");
		if(adresse != null) {
			return "nom : \t" + nom + "\nprenom : \t" + prenom +"\n"+ adresse ;			
		}else {
			return "nom : \t" + nom + "\nprenom : \t" + prenom;
		}
			
	}
	
	
}
