package entites;

import entites2.Person;

public class TestPerson {
	public static void main(String[] args) {
		
		Person pers1 = new Person("MENTSEUR","Fares");
		AdressePostale adr1 = new AdressePostale(64,"Avenue de Castelnau",34000,"Montpellier");
		Person pers2 = new Person("Mentseur", "Mehdi", adr1);
		pers1.afficherEnMajuscule();
		pers2.afficherEnMajuscule();
		
		// afficher la personne pers2
		System.out.println(pers2);
		// Modifier pers2 avec les setters 
		pers2.setNom("Sadio");
		pers2.setPrenom("Mane");
		adr1.setNumRue(45);
		adr1.setLibelleRue("Rue du Faubourg Saint Jaumes");
		adr1.setCodePostale(34090);
		adr1.setVille("Montpellier");
		pers2.setAdresse(adr1);
		// Afficher pers2 apreès modification
		System.out.println(pers2);
		
	}
}
