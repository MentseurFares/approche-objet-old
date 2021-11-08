package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
	
	public static void main(String[] args) {
		Compte compte = new Compte(1345, 20_000);
		System.out.println("Numero de compte : " +compte.getNumeroComte() + "  Solde : "+ compte.getSoldeCompte());	
		System.out.println(compte);
	}
}
