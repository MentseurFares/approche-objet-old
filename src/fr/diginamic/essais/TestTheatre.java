package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {

		Theatre theatre = new Theatre("Les retrouvailles", 200);
		System.out.println(theatre);
		theatre.inscrire(20, 23);
		theatre.inscrire(10, 49.99);
		theatre.inscrire(100, 15);
		theatre.inscrire(5,0);
		theatre.inscrire(50, 12.50);
		theatre.inscrire(10, 19.99);
		theatre.inscrire(7, 28);
		
		System.out.println(theatre);
	}

}
