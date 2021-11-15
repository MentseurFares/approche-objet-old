package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {
	
	public static void main(String[] args) {
		
		// Declaration des deux cercles 
		Cercle cercle1 = new Cercle(23);
		Cercle cercle2 = new Cercle(45);
		// Affichage des infos de cercles grace à toString 
		System.out.println(cercle1);
		System.out.println(cercle2);
		System.out.println(CercleFactory.createCercle(56));
	}
}
