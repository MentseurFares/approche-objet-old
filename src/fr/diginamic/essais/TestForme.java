package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class TestForme {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(25, 30);
		Carre carre = new Carre(30);
		Cercle cercle = new Cercle(20);
		
		AffichageForme.afficher(rectangle);
		AffichageForme.afficher(carre);
		AffichageForme.afficher(cercle);
	}
}
