package fr.diginamic.banque.entites;

public class Compte {

	private	String numero;
	private double solde;

	public Compte(String numeroComte, double soldeCompte) {
		super();
		this.numero = numeroComte;
		this.solde = soldeCompte;
	}

	public String getNumeroComte() {
		return numero;
	}

	public void setNumeroComte(String numeroComte) {
		this.numero = numeroComte;
	}

	public double getSoldeCompte() {
		return solde;
	}

	public void setSoldeCompte(double soldeCompte) {
		this.solde = soldeCompte;
	}

	@Override
	public String toString() {
		return "Numero de compte : " +numero + "  Solde : "+ solde ;	
	}
	
	

}
