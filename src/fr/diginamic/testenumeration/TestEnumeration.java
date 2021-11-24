package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		
			
		for (Saison saison : Saison.values()) {
			System.out.println(saison);
		}
		
		String nom = "ETE";
		System.out.println(Saison.valueOf(nom));
		
		String libelle="Hiver";
		
		Saison result = Saison.getSaisonByLibelle(libelle);
		Saison hiver = Saison.HIVER;
		
		if(result != null && result.equals(hiver)) {
			System.out.println("La saison avec le libelle : " +libelle+ " est la même saison que : " + hiver.getLibelle());
		}
	}

}
