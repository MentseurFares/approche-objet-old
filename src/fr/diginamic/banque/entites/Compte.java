package fr.diginamic.banque.entites;

public class Compte {

	private int numeroComte;
	private int soldeCompte;

	public Compte(int numeroComte, int soldeCompte) {
		super();
		this.numeroComte = numeroComte;
		this.soldeCompte = soldeCompte;
	}

	public int getNumeroComte() {
		return numeroComte;
	}

	public void setNumeroComte(int numeroComte) {
		this.numeroComte = numeroComte;
	}

	public int getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(int soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

	@Override
	public String toString() {
		return "Numero de compte : " +numeroComte + "  Solde : "+ soldeCompte ;	
	}
	
	

}
