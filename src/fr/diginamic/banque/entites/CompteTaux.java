package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{

	private float tauxRenumeration ;
	
	public CompteTaux(String numeroComte, double soldeCompte, float tauxRenumeration) {
		super(numeroComte, soldeCompte);		
		this.tauxRenumeration = tauxRenumeration;
	}

	@Override
	public String toString() {
		
		return super.toString()+ " Taux de rénumération : " + tauxRenumeration;
	}
	
	
}
