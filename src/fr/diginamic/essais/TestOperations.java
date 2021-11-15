package fr.diginamic.essais;

import fr.diginamic.Operations;

public class TestOperations {
	
	public static void main(String[] args) {
		
		//Test Addition 
		System.out.println(Operations.calcul(4, 5, '+'));
		System.out.println(Operations.calcul(4, 5, '*'));
		System.out.println(Operations.calcul(4, 5, '-'));
		System.out.println(Operations.calcul(4, 5, '/'));
		System.out.println(Operations.calcul(4, 0, '/'));
		System.out.println(Operations.calcul(4, 5, '%'));
		System.out.println(Operations.calcul(4, 0, '%'));
		System.out.println(Operations.calcul(4, 5, '['));
	}

}
