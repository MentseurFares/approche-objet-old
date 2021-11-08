package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
	
	public static void main(String[] args) {
		Compte compte = new Compte("1345DF56", 20_000);
		CompteTaux compteTaux = new CompteTaux("3467BW42", 120_000, 0.78f);
		// Affichage à l'aide de getters 
		System.out.println("Numero de compte : " +compte.getNumeroComte() + "  Solde : "+ compte.getSoldeCompte());	
		// Affichage compte avec toString 
		System.out.println(compte);
		// affichage competTaux avec toString
		System.out.println(compteTaux);
		Compte[] tabCompte = new Compte[2];
		tabCompte[0] = compte;
		tabCompte[1] = compteTaux;
		// Boucle d'affichage des elements de type Compte et CompteTaux dans un tableau de type Compte
		for (int i = 0; i < tabCompte.length; i++) {
			System.out.println(tabCompte[i]);
			
		}
		
	}
}
