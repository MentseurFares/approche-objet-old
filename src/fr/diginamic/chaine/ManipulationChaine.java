package fr.diginamic.chaine;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) { 

		char separateur = ';';

		String chaine = "Durand;Marcel;2 523.5";
		System.out.println(chaine);

		System.out.println("Longueur chaine : " + chaine.length());

		System.out.println("Premier index du caractere \"" + separateur + "\" : " + chaine.indexOf(separateur));

		String nom = chaine.substring(0, chaine.indexOf(separateur));
		System.out.println("Nom : " + nom);
		
		System.out.println("Nom majuscule : " + nom.toUpperCase());
		System.out.println("Nom minuscule : " + nom.toLowerCase());
		
		String[] stringParts = chaine.split(";");
		
		Salarie empl = new Salarie();
		empl.setNom(stringParts[0]);
		empl.setPrenom(stringParts[1]);
		double salaire = Double.parseDouble(stringParts[2].replaceAll(" ", ""));
		empl.setSalaire(salaire);
		System.out.println(empl);
	}

}
