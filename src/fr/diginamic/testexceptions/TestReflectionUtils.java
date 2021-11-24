package fr.diginamic.testexceptions;

import fr.diginamic.recensementFares.entites.Ville;

public class TestReflectionUtils {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, ReflectionException {
		Ville ville = new Ville("34", "Occitanie" , "34", "34000" , "Montpellier", 216_000);
		ReflectionUtils.afficherAttributs(null);
	
	}
}
