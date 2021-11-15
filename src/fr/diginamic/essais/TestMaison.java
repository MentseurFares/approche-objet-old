package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.Wc;

public class TestMaison {

	public static void main(String[] args) {
		
		Maison maison = new Maison();
		maison.ajouterPiece(new SalleDeBain(9, 0));
		maison.ajouterPiece(new SalleDeBain(6, 1));
		maison.ajouterPiece(new Wc(5, 0));
		maison.ajouterPiece(new Wc(4, 1));
		maison.ajouterPiece(new Salon(45, 0));
		maison.ajouterPiece(new Salon(27, 1));
		maison.ajouterPiece(new Cuisine(32, 0));
		maison.ajouterPiece(new Chambre(15, 0));
		maison.ajouterPiece(new Chambre(12, 1));
		maison.ajouterPiece(new Chambre(12, 1));
		maison.ajouterPiece(new Chambre(18, 1));
		maison.ajouterPiece(new Chambre(14, 1));
		maison.ajouterPiece(new Chambre(14, 0));
		maison.ajouterPiece(null);
		
		System.out.println(maison.getSuperficieTotale());
		System.out.println(maison.getEtageSuperficie(0));
		System.out.println(maison.getEtageSuperficie(1));
		
		
		System.out.println(maison.getNbPiecesParType(Chambre.class));
		System.out.println(maison.getNbPiecesParType("chambre"));
		
		System.out.println(maison.getSuperficieParType(Chambre.class));
		System.out.println(maison.getSuperficieParType("chambre"));
		
		
	}

}
