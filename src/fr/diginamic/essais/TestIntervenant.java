package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {
	
	public static void main(String[] args) {
		Salarie salarie = new Salarie("Menes", "Pierre", 4600) ;
		Pigiste pigiste = new Pigiste("Hafid", "Derradji", 12, 480); 
		
		System.out.println("Salaire : " + salarie.getSalaire());
		System.out.println("Salaire : " + pigiste.getSalaire());
		
		salarie.afficherDonnes();
		pigiste.afficherDonnes();
	}
}
