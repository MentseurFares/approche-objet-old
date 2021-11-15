package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {
	
	public static void afficher(Forme forme) {
		System.out.println("Perimetre : " + forme.calculerPerimetre() + "\tSurface : "+forme.calculerSurface());
	}
}
