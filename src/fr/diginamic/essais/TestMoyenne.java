package fr.diginamic.essais;

import fr.diginamic.CalculMoyenne;

public class TestMoyenne {
	
	public static void main(String[] args) {
		// declaration de la variable
		CalculMoyenne calculMoyenne = new CalculMoyenne();
		// remplissage des elements 
		calculMoyenne.ajout(6);
		calculMoyenne.ajout(7);
		calculMoyenne.ajout(23);
		calculMoyenne.ajout(56);
		calculMoyenne.ajout(34);
		calculMoyenne.ajout(875);
		// affichage 
		calculMoyenne.afficheElements();
		// affichage de la moyenne
		System.out.println("moyenne : "+calculMoyenne.moyenne());
	}

}
