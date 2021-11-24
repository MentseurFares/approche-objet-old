package fr.diginamic.equal;

import listes.Ville;

public class TestEquals {

	public static void main(String[] args) {
		Ville v1 = new Ville("Montpellier", 320_000);
		Ville v2 = new Ville("Montpellier", 320_000);
		System.out.println(v1.equals(v2));
	}
}
